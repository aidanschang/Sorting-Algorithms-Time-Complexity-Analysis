# sorting-time-complexity-analysis

## Overview
This assignment demonstrated how time complexity of each sorting algorithms behaves in relation to the amount of input(n). By calculating the amount of time spent on sorting incremented amount of random integers into each sorting algorithms, I was able to obtain a graphical relationship between numbers of input and the amount of time it used to complete each sorting task. 

![image](https://user-images.githubusercontent.com/84875731/149720562-ff102ec6-ffc1-4c38-af25-021435651e15.png)

## Implementation
This demonstration compares 4 of the common sorting algorithms: insertionSort, mergeSort, quickSort, and heapSort. Each sorting algorithm will be sorting 10,000 random integers with an incrementation of 10,000 more random integers 10 times.

To ensure each sorting algorithm are getting the same set of random numbers in each increment, deep copies of random integer array were implemented

![image](https://user-images.githubusercontent.com/84875731/149714345-f8596480-f49d-4b20-bc86-4ebd6783c230.png)

The amount of time each algorithms used was conducted by subtracting the ending System.currentTimeMillis() and starting System.currentTimeMillis(). As result, I am able to obtain the amount of time each sorting algorithms spent and be able to visualize each algorithms' time complexities through the graph.

## Observation

1. I have noticed that there was an unusual spike on the mergeSort during the second round(20,000). After extensive research on what might have caused the spike, I tried to put a warmup dummy at the very beginning of the program, and that spike reduced from an average of 17 milliseconds to an average of 10 milliseconds.

    ![image](https://user-images.githubusercontent.com/84875731/149720649-231a8843-0ca7-4363-99d7-32eec712ac86.png)

2. Based on my research, quickSort has better locality than the merge sort because merge sort is not an in-place sorting algorithm. Hence, quickSort will be a little faster than the merge sort.

3. I was conducting an experiment for the worst time complexity for quickSort which is O(n^2), when the parameter array is already been sorted. So I placed a sorted array within the quickSort parameter and got a StackOverflow error when the inputs are at 20,000. 
