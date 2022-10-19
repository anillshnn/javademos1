package DataAccess;
import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements ICourseDao{
    private List<Course> courses = new ArrayList<Course>();

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Kurslar jdbc İle Getirildi");
        return courses;
    }

    @Override
    public Course getCourse(int id) throws Exception {
        for(Course course : courses){
            if (course.getId() == id){
                System.out.println(id + " numaralı kurs Jdbc ile getirildi");
                return course;
            }else {
                System.out.println("Kurs Bulunamadı(JDBC)");
            }

        }
        throw new Exception("Hata(Kurs(JDBC))");
    }

    @Override
    public void addCourse(Course course) {
        System.out.println(course.name +  " isimli kurs eklendi(JDBC)");
        this.courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("Kurs güncellendi(JDBC)");

    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("Kurs güncellendi(JDBC)");
    }
}
