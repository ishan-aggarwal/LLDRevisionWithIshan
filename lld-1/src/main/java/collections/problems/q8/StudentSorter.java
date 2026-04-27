package collections.problems.q8;

import java.util.*;
import java.util.stream.Collectors;

public class StudentSorter {
    public static void sortStudentsByAgeDescending(List<Student> students) {
        Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge).reversed();
//        students.sort(ageComparator);
        Collections.sort(students, new MyAgeComparator());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));

        sortStudentsByAgeDescending(students);

        Map<String, Optional<Student>> ansz = students.stream()
                .collect(Collectors.groupingBy(e->e.getName(), Collectors.maxBy(new MyAgeComparator())));


        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }

    private static class MyAgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge() - o1.getAge();
        }
    }
}
