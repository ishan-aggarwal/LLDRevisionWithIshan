# Count Unique Words(Assignment)

## Problem Statement

Given a list of strings representing sentences, write a Java method called `countWords` that performs the following
operations using Java streams:

- Filter out sentences that don't contain the word `"Java"`.
- Map each filtered sentences to a list of unique words (remove duplicates).
- Flatten the list of unique words into a single stream of words.
  **Hint**: Use **flatMap(Arrays::stream)** Method

- Count the total number of remaining words.
- Return the count of remaining words.

## Instructions

1. Implement the `countWords` method inside the `WordCounter` class
2. You need to use **Java Streams** for doing the operation.