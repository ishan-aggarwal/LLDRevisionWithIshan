# Group Anagrams(Assignment)

## Problem Statement

You are given an array of strings, you need to group the anagrams together and store them in a list of strings.
Write a function in Java that takes an array of strings as input and returns a `List<List<String>>` where each inner
list contains the strings that are grouped together i.e. the anagrams.

**Note:** A string `s2` is called an anagram of string s1, if the frequency of each character in the string s2 is equal
to
the frequency of each character in the string `s1`.

### Example

Let us consider the array of strings given as input be ["eat", "tea", "tan"].
Now, if we look at the array we can see that "eat" and "tea" are anagrams because in "eat" the characters are 'e','a' &
't' having frequency of 1 each. Similarly, "tea" also has 'a','e' & 't' characters only and their frequency is also 1
each. Since all the characters have the same frequency and all the characters are common in both strings hence they are
anagrams.

We group these anagrams together in a list which will look like ["eat","tea"]. Since "tan" has no anagram therefore
the list for anagrams of "tan" has only one string (which is "tan" itself).

## Instructions

1. Implement the `groupAnagrams` method inside the `AnagramGrouper` class.
2. The input array of strings can also be empty or `null`. In that case you need to return an empty
   `<List<List<String>>`.
2. Hint: Use **LinkedHashmap** to maintain the ordering of strings, same as input.