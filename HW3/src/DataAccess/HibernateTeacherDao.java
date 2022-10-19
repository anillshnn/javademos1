package DataAccess;

import Entities.Teacher;
import java.util.ArrayList;
import java.util.List;

public class HibernateTeacherDao implements ITeacherDao{
    private List<Teacher> teachers = new ArrayList<Teacher>();
    @Override
    public List<Teacher> getAllTeachers() {
        System.out.println("Tüm Ögretmenler Hibernate ile getirildi.");
        return teachers;
    }

    @Override
    public Teacher getTeacher(int id) throws Exception {
        for (Teacher teacher : teachers){
            if (teacher.getId() == id){
                System.out.println(id+ " numaralı ögretmen getirildi(Hibernate)");
                return teacher;
            }else {
                System.out.println("Öğretmen bulunamadı(Hibernate)");

            }
        }
        throw new Exception("Hata(Öğretmen(Hibernate))");
    }

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println(teacher.name + "İsimli öğretmen eklendi(Hibernate)");
        this.teachers.add(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Öğretmen güncellendi(Hibernate)");

    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        System.out.println("Öğretmen Silindi(Hibernate)");
    }
}
