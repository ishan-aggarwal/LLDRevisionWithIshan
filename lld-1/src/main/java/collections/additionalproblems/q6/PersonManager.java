package collections.additionalproblems.q6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PersonManager {
    public static List<Person> removeDuplicatePersons(List<Person> persons) {
        HashSet<String> seenNames = new HashSet<>();
        List<Person> uniquePersons = new ArrayList<>();

        if (persons == null) return uniquePersons;
        for (Person person : persons) {
            if (!seenNames.contains(person.getName())) {
                seenNames.add(person.getName());
                uniquePersons.add(person);
            }
        }
        return uniquePersons;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 20));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Alice", 22));
        persons.add(new Person("Charlie", 22));
        persons.add(new Person("Bob", 30));

        List<Person> result = removeDuplicatePersons(persons);
        for (Person p : result) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
