package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//Взять за основу код с семинара и модифицировать классы, добавив имплементацию comparable/comparator
public class Person implements Comparable<Person>, Iterable<Person> {
    private String name;
    private List<Person> people = new ArrayList<>();
    private int index = 0;
    private int age;//добавила возраст

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        //return this.name.compareTo(otherPerson.getName());
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return name;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {
        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public Person next() {
            if (hasNext()) {
                return people.get(index++);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 16);
        Person person2 = new Person("Bob", 44);
        Person person3 = new Person("Charlie", 99);
        Person person4 = new Person("David", 1);

        person1.addPerson(person1);
        person1.addPerson(person2);
        person1.addPerson(person3);
        person1.addPerson(person4);

//        System.out.println("initial list: " + person1);

        Collections.sort(person1.people);
        System.out.println("sort by name: " + person1.people);

        Collections.sort(person1.people, new NameLengthComparator());
        System.out.println("sort by name length: " + person1.people);

        Collections.sort(person1.people, new AgeComporator());//добавила вывод сортировки по возрасту
        System.out.println("sort by age: " + person1.people);

//        System.out.println("Итерация по списку:");
//        for (Person person : person1) {
//            System.out.println("Имя: " + person.getName());
        System.out.println("iterating:");
        Iterator<Person> iterator = person1.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("name: " + person.getName());
        }
    }
}

class NameLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().length() - person2.getName().length();
    }
}

//добавила компоратор - по возрасту
class AgeComporator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}


