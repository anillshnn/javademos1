package DataAccess;

import Entities.Course;
import java.util.ArrayList;
import java.util.List;
public class HibernateCourseDao implements ICourseDao{
    private List<Course> courses = new ArrayList<Course>();

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Kurslar Hibernate İle Getirildi");
        return courses;
    }

    @Override
    public Course getCourse(int id) throws Exception {
        for(Course course : courses){
            if (course.getId() == id){
                System.out.println(id + " numaralı kurs Hibernate ile getirildi");
                return course;
            }else {
                System.out.println("Kurs Bulunamadı(JDBC)");
            }

        }
        throw new Exception("Hata(Kurs(Hibernate))");
    }

    @Override
    public void addCourse(Course course) {
        System.out.println(course.name +  " isimli kurs eklendi(Hibernate)");
        this.courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("Kurs güncellendi(Hibernate)");

    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("Kurs güncellendi(Hibernate)");
    }
}
