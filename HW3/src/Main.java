import Business.CategoryManager;
import Business.CourseManager;
import Business.TeacherManager;
import Core.Logging.*;
import DataAccess.*;
import Entities.Category;
import Entities.Course;
import Entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher(1,"Adem","Ayar","Kotlin");
        Teacher teacher1 = new Teacher(2,"Engin","Demiroğ","Java");

        Category category = new Category(1,"Mobil geliştirme");
        Category category1 = new Category(2,"Veritabanı");
        Category category2 = new Category(3,"Görüntü İşleme");
        Category category3 = new Category(4,"Yapay Zeka");

        Course course = new Course(1,"Java Kursu","2022 Java geliştirici kampı",category2,teacher1,1);
        Course course1 =new Course(2,"Kotlin Kursu","Mbil geliştirici kursu",category,teacher,2);
        Course course2 = new Course(3,"Bankacı kursu","Banka için veritabanı kursu",category1,teacher1,100);

        List<ILogging> loggers = new ArrayList<ILogging>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());
        loggers.add(new ConsoleLogger());

        TeacherManager teacherManager = new TeacherManager(loggers, new JdbcITeacherDao());
        teacherManager.add(teacher);

        TeacherManager teacherManager1 = new TeacherManager(loggers, new HibernateTeacherDao());
        teacherManager1.add(teacher1);

        CategoryManager categoryManager = new CategoryManager(loggers,new JdbcCategoryDao());
        categoryManager.add(category);
        categoryManager.add(category1);

        CategoryManager categoryManager1 = new CategoryManager(loggers, new HibernateCategoryDao());
        categoryManager1.add(category2);
        categoryManager1.add(category3);

        CourseManager courseManager = new CourseManager(loggers,new JdbcCourseDao());
        courseManager.add(course);
        courseManager.add(course1);

        CourseManager courseManager1 = new CourseManager(loggers, new HibernateCourseDao());
        courseManager1.add(course2);

    }
}
