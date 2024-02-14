package Seminar05HW.service;

import Seminar05HW.models.Student;
import Seminar05HW.models.StudyGroup;
import Seminar05HW.models.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
