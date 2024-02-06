package Seminar04HW;

import java.util.List;

public class TeacherController <T extends UserService<Teacher>> {
    private T teacherService;

    public TeacherController(T teacherService) {
        this.teacherService = teacherService;
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getAllUsers();
        UserComparator<Teacher> comparator = new UserComparator<>();
        List<Teacher> sortedTeachers = comparator.sortUsers(teachers);
        for (Teacher teacher : sortedTeachers) {
            System.out.println(teacher.getName());
        }
    }
}
