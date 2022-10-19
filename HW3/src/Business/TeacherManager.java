package Business;

import Core.Logging.ILogging;
import DataAccess.ITeacherDao;
import Entities.Teacher;

import java.util.List;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private List<ILogging> loggers;

    public TeacherManager(List<ILogging> loggings,ITeacherDao teacherDao){
        this.loggers =loggings;
        this.teacherDao=teacherDao;
    }
    public void add(Teacher teacher){
        teacherDao.addTeacher(teacher);
        for (ILogging logging: loggers){
            logging.log();
        }
    }
    public void update(Teacher teacher){
        teacherDao.addTeacher(teacher);
        for (ILogging logging:loggers){
            logging.log();
        }
    }
    public void delete(Teacher teacher){
        teacherDao.deleteTeacher(teacher);
        for (ILogging logging:loggers){
            logging.log();
        }
    }


}
