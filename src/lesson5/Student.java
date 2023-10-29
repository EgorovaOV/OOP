package lesson5;

public class Student extends Person{
    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public Student(Integer id, String name) {
        super(id, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
