package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createStudyGroupWithTeacherAndStudents(int teacherId, List<Integer> studentIds) {
        Teacher teacher = getTeacherById(teacherId);
        List<Student> students = getStudentsByIds(studentIds);


        return studyGroupService.createStudyGroup(teacher, students);
    }

    private Teacher getTeacherById(int id) {
        // Здесь будет логика получения преподавателя по его id
        return new Teacher(id, "Преподаватель");
    }

    private List<Student> getStudentsByIds(List<Integer> ids) {
        // Здесь будет логика получения списка студентов по их id
        List<Student> students = new ArrayList<>();
        for (Integer id : ids) {
            students.add(new Student(id, "Студент " + id));
        }
        return students;
    }
}
