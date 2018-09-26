#### Advantages of .class
+ .class code has been type checked 
+ code is simple Distributed, safer and faster
+ protect the intellectural property

#### Object Oriented 

+ Definition: 
Object-oriented programming (OOP) is a programming language model organized 
around objects rather than "actions" and data rather than logic. 

+ For example, A new project is assigned to a manager. The manager alone can finish the project by 
doing requirement anaylsis, system design, development and test. This is process oriented. 
If each part is implemented by one worker, then the manager is responsible to organize these people,
here, each worker is an object. This is object oriented. It improves the work efficiency.

#### Four principles of object-oriented programming:
+ encapsulation: each object keeps its state private, inside a class
+ abstraction: each object should only expose a high-level mechanism for using it.
+ inheritance: reuse the common logic and extract the unique logic into a separate class+
+ polymorphism: each child class implements its own version of the methods from parent class.
same method with different implementation

#### Constructor 
code similar to a method, Define how to initiate a class

#### Static and non-static
+ non-static/instance methods can be called by an instance of a class
+ static methods or members are invoked using class name, cannot access instance method

#### reference variable
+ assign 64 bits to the address of the reference type variable, which denotes the location of the var
+ the object which var referred to can be the any size

#### Nested class
above the methods of the main class
private static nested class can only be used in the main class

#### array copy VS. slices in python
geometric resize for the array
time and space effciency tradeoff

#### Autograder Driven Development(ADD)
!!! Worst Way 
+ write the program entirely and then debug and 
fix bug after running autograder repeatly
+ add unit test(improve)

#### Test driven development(TDD)
+ identify a new feature
+ write a new test
+ run the test(fail)
+ write the code which pass the tests

#### Integration testing
Tests covers many units at once
- ensure modules interact properly
+ challenging to automate
+ tedious to do manually
+ Miss subtle errors since it is high level


#### overriding and overloading
+ overriding: method with same signature with super class (inheritance) running time
+ overloading: method with same name but different signatures (compile time}
--------------------------------------------------
Pros:
- add Override tag can prevent typos
- remind of the inheritance hierarchy

Default method with implementation can be inherited by subclass

#### inheritance by interface
- code reuse
- simple to generalize the code
- hard to keep track of the actual situation
- breaks encapsulation
- resolve conflicts rule difficult

--------------------------------------------------
inherit by extend: extend all members(instance and static variables,
 methods and nested class) except the constructors
+ use super keyword to revoke the method in parent class or override the parent method 
+ make a call using "super()" to the constructor in super class
+ need to specify the super constructor if there is argument

#### rules
- override only for non-static method
- compiler allows calls based on static type
- overridden non-static methods are selected at run time based on dynamic type

#### Encapsulation
how to manage complexity
+ hierarchical abstraction
+ design for change(around objects, hide unneeded information, object include methods)


#### Polymorphism

######Comparable and Comparator
ability to make callback()
explicit function passing in other language


#### Checked and Unchecked
java consider IO exception as checked, runtime exception or Error as unchecked

all checked exception myst be caught or specified

#### Access control
protected: package included, not the world
private: only in current class
default: default package 

#### Object method
+ == same object(reference address)
+ .equals() same content
