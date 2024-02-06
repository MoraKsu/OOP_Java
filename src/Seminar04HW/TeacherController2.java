package Seminar04HW;

public class TeacherController2 <T extends UserService<Teacher>> {
    private T teacherService;

    public TeacherController2(T teacherService) {
        this.teacherService = teacherService;
    }

    public void createTeacher(String name) {
        Teacher teacher = new Teacher(name);
        teacherService.addUser(teacher);
    }

    public void editTeacher(Teacher teacher, String newName) {
        teacher.setName(newName);
    }
}
