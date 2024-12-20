# Unique Persons(Assignment)

## Problem Statement

You are given a class `Person` which stores the data of each person. The `Person` class has two variables, `name` and
`age`. Now you are given a list of `Person` and you need to remove the duplicates from the given list and return the
filtered list.

You need to remove the duplicates based on `name` only, irrespective of the age. If two or more persons have the same
`name` but different ages, then include the person who came first in the list and discard others.

## Instructions

1. Implement the `removeDuplicatePersons` method inside the `PersonManager` class.
2. Return a `List<Person>` as the output after removing the duplicates based on name.
3. Only consider the name for checking duplicates.
4. If two or more person have same name but different age, then consider the one who came first in the input list.
5. You don't need to implement the `Person` class. It is already implemented.
6. The output must be in the same order as they occur in the input list.
7. There can be null and empty list in input. Handle that case and return empty `List<Person>` in that case.