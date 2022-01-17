import java.util.*;

public class Hw5_p7 {
    public static void main(String[] args) {

        int increment = 10000;
        int n = 10000;
        int maxRandomNumber = 1000000;

        while (n<=100000) {
            //Creating random integer array
            int[] integerArray = new int[n];
            Random r = new Random();

            //Creating a new insertKeys array
            for (int i = 0; i < n; i++) {
                integerArray[i] = r.nextInt(maxRandomNumber) + 1;
            }

            //Cloning 4 of the integer arrays to conduct sorting experiment
            int[]insertionSortArray = integerArray.clone();
            int[]mergeSortArray = integerArray.clone();
            int[]quickSortArray = integerArray.clone();
            int[]heapSortArray = integerArray.clone();
            int[]warmupDummy = integerArray.clone();


            //*
            //*
            //***WarmUPDummy
            int warmUpLength = insertionSortArray.length;
            for (int k =1;k<warmUpLength; k++) {
                int cur =warmupDummy[k];
                int j = k;
                while (j > 0 && warmupDummy[j-1] > cur) {
                    warmupDummy[j] = warmupDummy[j-1];
                    j--;
                }
                warmupDummy[j] = cur;
            }


            //To prove that clone() method is deep copy
            /*
            integerArray[0] = 0;
            insertionSortArray[0]=1;
            mergeSortArray[0]=2;
            quickSortArray[0]=4;
            heapSortArray[0]=3;

            System.out.println(integerArray[0]);
            System.out.println(insertionSortArray[0]);
            System.out.println(mergeSortArray[0]);
            System.out.println(quickSortArray[0]);
            System.out.println(heapSortArray[0]);
            System.out.println("");*/

            //*
            // *
            // ***implementing insertion sort
            long insertionStartTime = System.currentTimeMillis();

            int length = insertionSortArray.length;
            for (int k =1;k<length; k++) {
                int cur =insertionSortArray[k];
                int j = k;
                while (j > 0 && insertionSortArray[j-1] > cur) {
                    insertionSortArray[j] = insertionSortArray[j-1];
                    j--;
                }
                insertionSortArray[j] = cur;
            }
            long insertionEndTime = System.currentTimeMillis();
            long insertionElapsedTime = insertionEndTime-insertionStartTime;
            System.out.println("insertion sort elapsed time : "+ insertionElapsedTime);

            //Testing insertionSort
            /*System.out.println(insertionSortArray[0]);
            System.out.println(insertionSortArray[1000]);
            System.out.println(insertionSortArray[4000]);
            System.out.println(insertionSortArray[6000]);
            System.out.println(insertionSortArray[8000]);
            System.out.println(insertionSortArray[9999]);
            System.out.println("");*/


            //*
            // *
            // ***Implementing merge sort
            long mergeSortStartTime = System.currentTimeMillis();
            //calls the mergeSort method of mergeSort class with mergeSOrtArray parameter
            mergeSort.mergeSort(mergeSortArray);

            //testing mergesort works
            /*System.out.println(mergeSortArray[0]);
            System.out.println(mergeSortArray[2000]);
            System.out.println(mergeSortArray[4000]);
            System.out.println(mergeSortArray[6000]);
            System.out.println(mergeSortArray[8000]);
            System.out.println(mergeSortArray[9999]);*/

            long mergeSortEndTime = System.currentTimeMillis();
            long mergeSortElapsedTime = mergeSortEndTime - mergeSortStartTime;
            System.out.println("mergesort elapsed time: " + mergeSortElapsedTime);

            //Implementing quick sort
            long quickSortStartTime = System.currentTimeMillis();
            int leftIndex = 0;
            int rightIndex = quickSortArray.length-1;
            quickSort.quickSort(quickSortArray,leftIndex,rightIndex);

            //testing quicksort works
            /*System.out.println(quickSortArray[0]);
            System.out.println(quickSortArray[2000]);
            System.out.println(quickSortArray[4000]);
            System.out.println(quickSortArray[6000]);
            System.out.println(quickSortArray[8000]);
            System.out.println(quickSortArray[9999]);*/
            long quickSortEndTime = System.currentTimeMillis();
            long quickSortElapsedTime = quickSortEndTime - quickSortStartTime;
            System.out.println("quicksort elapsed time: " + quickSortElapsedTime);

            //*
            // *
            // ***heapsort implementation
            long heapsortStartTime = System.currentTimeMillis();
            heapsort ob = new heapsort();
            ob.sort(heapSortArray);

            long heapsortEndTime = System.currentTimeMillis();
            long heapsortElapsedTime = heapsortEndTime - heapsortStartTime;
            System.out.println("heap sort elapsed time: "+ heapsortElapsedTime);

            //testing if heapsort works
            /*System.out.println(heapSortArray[0]);
            System.out.println(heapSortArray[2000]);
            System.out.println(heapSortArray[4000]);
            System.out.println(heapSortArray[6000]);
            System.out.println(heapSortArray[8000]);
            System.out.println(heapSortArray[9999]);*/

            System.out.println("");
            n+= increment;

        }

    }
}
