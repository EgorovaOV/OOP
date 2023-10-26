package lesson4;

import java.util.ArrayList;

public class TeacherGroup<T extends Teacher> {
    private ArrayList<T> teachers;

    public TeacherGroup() {
        this.teachers = new ArrayList<>();
}
    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void teachGroup() {
        for (T teacher : teachers) {
            teacher.teach();
        }
    }
}