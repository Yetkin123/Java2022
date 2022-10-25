package dataAccess.Teacher;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {
    public void add(Teacher teacher) {
        System.out.println("JDBC ile eğitmen veritabanına eklendi");
    }
}
