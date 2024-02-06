package Seminar04HW;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherController<TeacherService> controller = new TeacherController<>(teacherService);

        // Добавление учителей
        teacherService.addUser(new Teacher("John"));
        teacherService.addUser(new Teacher("Alice"));
        teacherService.addUser(new Teacher("Bob"));

        // Отображение списка учителей
        controller.displayTeachers();

        // Создание и редактирование учителя
        TeacherController2<TeacherService> controller2 = new TeacherController2<>(teacherService);
        controller2.createTeacher("Tom");
        controller.displayTeachers();
        controller2.editTeacher(new Teacher("Tom"), "Tim");
        controller.displayTeachers();

    }
}
