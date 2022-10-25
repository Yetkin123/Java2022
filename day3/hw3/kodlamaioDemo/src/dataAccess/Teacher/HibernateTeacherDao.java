package dataAccess.Teacher;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {
    public void add(Teacher teacher) {
        System.out.println("Hibernate ile eğitmen veritabanına eklendi");
    }
}
