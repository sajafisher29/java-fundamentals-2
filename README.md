# java-fundamentals
All labs for Java 401





## Lab-02

Citations - Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.
files

## Over View
This lab is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.


## Methods used


- containsDuplicates(int[] arr);
- averageCount(int[][] arr);
- roll(int n);


Citations - Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.
files

basics/Main.class basics/Main.java
methods

pluralize (String str, int num ) flipNHeads(int n) clock()


## Lab-03

Citations - W3Schools, Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.
files

## Overview
As with lab 2 this lab also is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.


## Methods used

- containsDuplicates(int[] arr);
- temperatures();
- String tally(List<String> votes);
  
  ## Tests 
  
  - testAverageCount() 
  - testTemperatures() 
  - testTally() 
  
  
  
## Lab-04

This Lab was completed with Chase Tucker with pair programming technique. 

Citations - Stack overflow, Oracle docs, and java tutorial point where referenced for this lab.


## Overview
For this assignment we built a bitmap (.bmp) transformer CLI. It will read a bitmap in from disk, run one or more color or raster transforms and then write it out to a new file. This project will require manipulating binary data. 


## Methods used
- invertImage(); 
- imageToFile(File path)
- readBitmap(File path)
- 

## Transformations
- invert Image Color

  
  ## Tests 
  
- testAppHasAGreeting();
- readFileTestGoodRead()
 - readFileTestBadRead();



## Lab-05

Citations - Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.


## Overview
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.



## Methods used

- insert(int data)
- public boolean searchNode(Node head, int n)
- append(int data)

## Classes

- Node
- LinkedList
  
  ## Tests 
  
  - testInitiatedLinkedList() 
  - testInsertLinkedList()
  - testTheHeadPointingToFirst()
  - testInsertMultipleNodes()
  
  
  ## Lab-06

Citations - W3Schools.com, Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.


## Overview
Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs). 

## Methods used

- addReview(Review review)
- toString(Restaurant restaurant)
- Review(String body, String author, int stars)
- toString();

## Classes

- Restaurant 
- Review
  
  ## Tests 
  
  - testRestaurantClass()
  - testToString() 
  - testReviewToString()
  - testTheAddMethod()
  - testTheAverage() 

## Lab-07 

Citations - W3Schools.com, Stack overflow, geeks for geeks, and java tutorial point where referenced for this lab.


## Overview
The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.  The users also want movie theaters and to review the theater itself, as well as individual movies. 

## Methods used

- addReview(Review review)
- toString(Restaurant restaurant)
- Review(String body, String author, int stars)
- toString();
- 

## Classes

- Restaurant 
- Review
- Shop
- Theater
  
  ## Tests 
  
  - testRestaurantClass()
  - testToString() 
  - testReviewToString()
  - testTheAddMethod()
  - testTheAverage() 
  - testTheAverageStarsShop()
  - testToStringShop() 
  - testToStringTheater()
  - testAddMovietoTheater()
  - testDeleteMovietoTheater()
  - testMovieReviewToString()
  - testMovieReviewLinkedList()
