package Seminar05HW.controllers;

import Seminar05HW.models.Student;
import Seminar05HW.models.StudyGroup;
import Seminar05HW.models.Teacher;
import Seminar05HW.service.StudyGroupService;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
