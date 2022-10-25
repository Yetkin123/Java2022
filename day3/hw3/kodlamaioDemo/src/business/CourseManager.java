package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.Course.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> courses;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, Logger[] loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course c : courses) {
            if (course.getName().equals(c.getName())) {
                throw new Exception("Kurs ismi tekrar edemez");
            }
            if (course.getPrice() < 0) {
                throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
            }
        }
        courseDao.add(course);
        System.out.println("Kurs eklendi");
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
