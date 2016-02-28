This is the readme file for Palindrome checker.

MyStack Class:
It has two instance variable, a linkedlist and an integer size. 

The constructor intialized the linkedlist and the size to null and 0. 

Push method calls the addFirst method from MyGenericLinkedlist and add elements to the top, and it increments the size. 

Peek returns the value of element on the top of stack, if size is 0, it returns null. 

Pop method throws exception when size is 0, otherwise, it removes the top element from the stack and returns its value, also the size get reduced. 

GetSize method returns the current size. 

PalindromeChecker class:
It has three instance variables, a String that needs to be tested against, two stacks that stores the characters of the string both forward and backwards. 

Constructor takes in the string, and initialized two stacks.

FillOriginal method push all numbers and letters into the stack, the last character is at the top of the stack. 

FillReverse method does the opposite, the first character is at the top of the stack.

Compare method calls fillOriginal and fillReverse, and it compares characters between two stacks, if not equal, return false, it also checks whether the letter is capitalized. If it does not return after looping through the entire stack, it returns true.


Unit test is written for every class except tester class, it has 93% coverage. 