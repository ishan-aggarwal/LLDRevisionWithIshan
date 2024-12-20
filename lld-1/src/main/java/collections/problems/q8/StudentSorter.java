package collections.problems.q8;

import java.util.*;

public class StudentSorter {
    public static void sortStudentsByAgeDescending(List<Student> students) {
        Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge).reversed();
        students.sort(ageComparator);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));

        sortStudentsByAgeDescending(students);

        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
