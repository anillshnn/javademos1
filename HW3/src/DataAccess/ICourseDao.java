package DataAccess;

import Entities.Course;
import java.util.List;

public interface ICourseDao {
    List<Course> getAllCourses();
    Course getCourse(int id) throws Exception;
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Course course);
}
