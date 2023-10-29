package lesson5;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Создание объектов
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        Student student1 = new Student(1,"Olga");
        Student student2 = new Student(2,"Roman");
        Student student3 = new Student(3,"Lubov");
        Teacher teacher1 = new Teacher(1,"SuperRoman");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);



        // Создание учителя и списка студентов
        int teacherId = 1;
        List<Integer> studentIds = new ArrayList<>();
        studentIds.add(1);
        studentIds.add(2);
        studentIds.add(3);

        // Вызов метода createStudyGroupWithTeacherAndStudents
        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacherId, studentIds);


    }
}
