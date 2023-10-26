package lesson4;
//Создать класс Учитель;
//— Создать класс УчительГруппа и реализовать с параметризацией;
//— Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой

public class Main {
    public static void main(String[] args) {
        TeacherGroup<Teacher> teacherGroup = new TeacherGroup<>();

        Teacher oopTeacher1 = new OopTeacher("Olga");
        Teacher oopTeacher2 = new OopTeacher("Lubov");
        Teacher javaTeacher = new JavaTeacher("Roman");

        teacherGroup.addTeacher(oopTeacher1);
        teacherGroup.addTeacher(oopTeacher2);
        teacherGroup.addTeacher(javaTeacher);

        teacherGroup.teachGroup();
    }
}
