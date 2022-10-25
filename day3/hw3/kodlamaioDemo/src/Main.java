import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.Category.JdbcCategoryDao;
import dataAccess.Course.HibernateCourseDao;
import dataAccess.Teacher.HibernateTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("========== Eğitmen ==========");
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        Teacher teacher1 = new Teacher(1, "Engin Demiroğ");

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);

        teacherManager.add(teacher1);

        System.out.println("========== Kategori ==========");

        List<Category> categories = new ArrayList<>();
        Category category1 = new Category(1, "C# + Angular");
        Category category2 = new Category(2, ".NET");
        Category category3 = new Category(3, "Java");
        Category category4 = new Category(4, "JavaScript");
        Category category5 = new Category(5, "Temel");
        Category category6 = new Category(6, "Java + React");


        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categories, loggers);

        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);
        categoryManager.add(category4);
        categoryManager.add(category5);
        categoryManager.add(category6);

        System.out.println("========== Kurs ==========");

        List<Course> courses = new ArrayList<>();
        Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 0);
        Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 0);
        Course course3 = new Course(3, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "Java Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 0);
        Course course4 = new Course(4, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "1,5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 0);
        Course course5 = new Course(5, "Programlamaya Giriş için Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.", 0);
        Course course6 = new Course(6, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 0);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);

        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.add(course4);
        courseManager.add(course5);
        courseManager.add(course6);
    }
}