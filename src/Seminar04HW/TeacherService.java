package Seminar04HW;


import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAllUsers() {
        return teachers;
    }

    @Override
    public void addUser(Teacher user) {
        teachers.add(user);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
