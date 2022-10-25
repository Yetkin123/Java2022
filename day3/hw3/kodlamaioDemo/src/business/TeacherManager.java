package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.Teacher.TeacherDao;
import entities.Teacher;

public class TeacherManager {
    private TeacherDao teacherDao;
    private Logger[] loggers;

    public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void add(Teacher teacher) {
        teacherDao.add(teacher);
        System.out.println("Eğitmen eklendi");
        for (Logger logger : loggers) {
            logger.log(teacher.getName());
        }
    }
}
