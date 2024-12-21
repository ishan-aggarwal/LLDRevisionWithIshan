# Custom Exception

## Problem Statement

You are given a string as an input. You need to check if the string starts with "Scaler Java".
If it starts with "Scaler Java", then print `"Book created!:"  + <bookName>`, otherwise throw a custom exception (
InvalidBookNameException)
with the message `"Book name doesn't start with Scaler Java"`

## Instructions

1. Implement the `validate` method inside the `BookNameValidator` class.
2. You need to print `"Book created!:"  + <bookName>` if the name starts with "Scaler Java".
4. If not then throw an `InvalidBookNameException`, with message `"Book name doesn't start with Scaler Java"`.
5. You don't need to implement the `InvalidBookNameException` class on your own, it is already implemented for you.