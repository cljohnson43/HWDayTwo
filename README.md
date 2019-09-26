# Homework Week 1 Day 2

## Research Questions

1. **What is the difference in a hash map versus a hash table?**

TODO

2. **Why should you generally override the equals and hashCode methods?**

The default `equals()` method is a reference equality check. In the case where value semantics is needed
the `equals()` method needs to be overridden. It is important that the `hashCode()` method be overridden
anytime the `equals()` method is overridden because the java `Object.hashCode()` general contract states
that two objects that are equal must have equal hash code values. The default `hashCode()` method maps
the object memory address to an integer value; Therefore, when overriding `equals()` without overriding
`hashCode()` the two methods will be inconsistent. If the methods are inconsistent, then the object
in question will not be able to be used as a key value for hash collections.

Referenced in this answer: [Hashing It Out](https://www.ibm.com/developerworks/java/library/j-jtp05273/index.html)

3. **How does a factory design pattern work?**

The factory design pattern works by having a static method, in this case it would be called the factory
method pattern, or a factory class that creates concrete classes. This encapsulates object creation
and prevents object creation logic from being repeated in multiple places throughout the source code.

4. **How does Java Garbage Collection Work?**

TODO

5. **What is the difference in a HashMap vs a Hashtable?**

The following are the differences between a `HashMap` and `Hashtable`:
    * A `HashMap` is not thread-safe whereas a `Hashtable` is thread-safe
    * The `HashMap` allows a null key and null values, while `Hashtable` doesn't allow either
    * `HashMap` has better performance because it is non-synchronized while the `Hashtable` is synchronized

Referenced in this answer: [What is the Difference Between HashMap and Hashtable](https://javarevisited.blogspot.com/2010/10/difference-between-hashmap-and.html)

6. **What is a sparse Array?**

A `SparseArray` is a java class that extends `Object` and implements the `Cloneable` interface. It is
a collection that maps integers to objects. The `SparseArray` also allows for gaps in the indices of
the collection elements.

7. **What is the difference in a ArrayList and the List?**

The following are the differences between an `ArrayList` and a `List`:
    * A `List` is an interface; whereas, an `ArrayList` is a class
    * A `List` extends the `Collection` interface, while an `ArrayList` extends the `AbstractList` class
    * A `List` is used to create a sequential collection of objects, while an `ArrayList` is used to
      create a dynamically sized array of objects

Referenced in this answer: [Difference Between List and ArrayList in Java](https://techdifferences.com/difference-between-list-and-arraylist-in-java.html)

8. **What is the difference in comparator vs comparable?**

There are many differences between the `Comparator` and `Comparable` interfaces in java. The `Comparator`
interface is defined in the java.util package while the `Comparable` interface is defined in the java.lang
package. The `Comparator` interface uses the method `public int compare(Object o1, Object o2)`, while
the `Comparable` interface uses the method `public int compareTo(Object o)`. The `Comparable` interface
sorts a collection in what is thought of as an object's natural ordering; while a `Comparator` interface
allows for more control over how a collection is sorted. For example, a `Person` object could have a
natural ordering, which would use the `Comparable` interface, that sorts by age; however, if you wanted
to sort a collection of `Person` objects by weight you would use the `Comparator` interface.

Referenced in this answer: [Learning the Difference Between Comparable and Comparator](https://www.developer.com/java/data/learning-the-difference-between-comparable-and-comparator.html)

## Coding Problems

1.
### Description
Create a function to print the duplicates in a list of strings
public void findDuplicates(List<String> strings){};
### Method Used
TODO
### Logged Image of Solution
TODO

2.
### Description
Create function to check if the string is a palindrome without using string.reverse() method
public boolean checkPalindrome(String word){};
### Method Used
TODO
### Logged Image of Solution
TODO

3.
### Description
Create a function that will print:
"fizz" is the number is divisible by 3
"buzz" is the number is divisible by 5
"fizzbuzz" is the number is divisible by both
### Method Used
TODO
### Logged Image of Solution
TODO

4.
### Description
Create a function to check if the two strings are Anagrams: Eg COAT and TACO would be anagrams
public boolean checkAnagrams(String word1, String word2){};
### Method Used
TODO
### Logged Image of Solution
TODO

5.
### Description
Print a multiplication table from 1 to 10 using multidimensional array
Output
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
public void printTables(){};
### Method Used
TODO
### Logged Image of Solution
TODO

