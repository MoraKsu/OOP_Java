package Seminar05HW;

import Seminar05HW.controllers.Controller;
import Seminar05HW.models.Student;
import Seminar05HW.models.StudyGroup;
import Seminar05HW.models.Teacher;
import Seminar05HW.service.StudyGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Иванов");
        List<Student> students = List.of(
                new Student(1, "Петров"),
                new Student(2, "Сидоров"),
                new Student(3, "Иванов")
        );

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        StudyGroup studyGroup = controller.formStudyGroup(teacher, students);

        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("ID: " + student.getId() + ", Имя: " + student.getName());
        }
    }
}
