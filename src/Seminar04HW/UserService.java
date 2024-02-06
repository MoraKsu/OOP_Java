package Seminar04HW;

import java.util.List;

public interface UserService<T> {
    List<T> getAllUsers();
    void addUser(T user);
    void addTeacher(T teacher);
}
