package lesson5;

import java.util.List;



public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    private static String studygroupname;

    public StudyGroup(Teacher teacher, List<Student> students, String studygroupname) {
        this.teacher = teacher;
        this.students = students;
        this.studygroupname = studygroupname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static String getStudygroupname() {
        return studygroupname;
    }

    public void setStudygroupname(String studygroupname) {
        this.studygroupname = studygroupname;
    }



}

