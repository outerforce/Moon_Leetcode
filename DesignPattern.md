### Python Design Patterns
What Is A Design Pattern?
Patterns can be divided into three different categories depending on their level
of abstraction and implementation language independency:
+ architectural patterns
+ design patterns
+ idioms

the Gang of Four (GOF):
[https://en.wikipedia.org/wiki/Design_Patterns]
(Design Patterns: Elements of Reusable Object-Oriented Software)

#### Two main principles:
+ Program to an interface not an implementation.
+ Favor object composition over inheritance.



### Interview Questions
1. key points for Python:
+ interpreted language. No need for compile before it is run.
+ dynamically typed, no need to state the types of variables.
+ all are objects. functions are first-class objects. can be assigned to variables
- slower than compiled languages. allows the inclusion of C based extensions, for example, numpy package

2. print contents in dir
```python
def print_directory_contents(sPath):
       import os
       for sChild in os.listdir(sPath):
           sChildPath = os.path.join(sPath,sChild)
           if os.path.isdir(sChildPath):
               print_directory_contents(sChildPath)
           else:
               print(sChildPath)
```

3. zip(seq1 [, seq2 [...]]) -> [(seq1[0], seq2[0] ...), (...)]
return a list of tuples
  ```python
    A0 = dict(zip(('a','b','c','d','e'),(1,2,3,4,5)))
    ('a', 1)
    ('b', 2)
    ('c', 3)
    ('d', 4)
    ('e', 5)
    A0 = {'a': 1, 'c': 3, 'b': 2, 'e': 5, 'd': 4}
  ```