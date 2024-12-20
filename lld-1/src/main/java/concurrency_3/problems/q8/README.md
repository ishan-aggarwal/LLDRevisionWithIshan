Q8. Create a class Counter -Introduction to Synchronization - Mutex

Raw Problem

Create a class with the following requirements

1. Class should be public and name is Counter
2. It should've a single private data member of int type named count
3. It should've a single public constructor which takes an integer parameter and sets the value of count
4. It should've following 3 methods
    1. public void incValue(int offset)

       This method should increment the value of count by offset. Also make this method synchronized

    2. public void getValue()

       This method should return the value of count. Also make this method synchronized

    3. public void decValue(int offset)

       This method should decrement the value of count by offset. Also make this method synchronized