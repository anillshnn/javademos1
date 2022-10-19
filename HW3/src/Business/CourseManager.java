package Business;

import Core.Logging.ILogging;
import DataAccess.ICourseDao;
import Entities.Course;

import java.util.List;

public class CourseManager {
    private List<ILogging> loggers;
    private ICourseDao courseDao;
    public CourseManager(List<ILogging> loggers,ICourseDao courseDao ){
        this.loggers=loggers;
        this.courseDao=courseDao;

    }
    public void add(Course course) throws Exception{
        List<Course> courses = courseDao.getAllCourses();
        boolean isThere = false;
        for (Course course1:courses){
            if (course.name==course1.name){
                isThere=true;
                break;
            }
        }
        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0 dan küçük olamaz");
        }else if (!isThere && !(course.getPrice()<0)){
            courseDao.addCourse(course);
            for (ILogging logging:loggers){
                logging.log();
            }
        }else {
            throw new Exception("Kurs ismi tekrar edemez");
        }

    }
    public void update(Course course){
        courseDao.updateCourse(course);
        for (ILogging logging:loggers){
            logging.log();
        }
    }
    public void delete(Course course){
        courseDao.deleteCourse(course);
        for (ILogging logging: loggers){
            logging.log();
        }
    }
}
