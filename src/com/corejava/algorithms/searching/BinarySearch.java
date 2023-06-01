package com.corejava.algorithms.searching;

/*
 * Complexity to O(log N)
 * 
 * To apply Binary Search algorithm:
 * 1. The data structure must be sorted.
 * 2. Access to any element of the data structure takes constant time.
 * 
 * In this algorithm, 
 * 
 * Divide the search space into two halves by finding the middle index “mid”. 
 * Compare the middle element of the search space with the key. 
 * If the key is found at middle element, the process is terminated.
 * If the key is not found at middle element, choose which half will be used as the next search space.
 * If the key is smaller than the middle element, then the left side is used for next search.
 * If the key is larger than the middle element, then the right side is used for next search.
 * This process is continued until the key is found or the total search space is exhausted.
 */
public class BinarySearch {
	
    // Returns index of numberToFind if it is present in numbers[].
    int binarySearch(int numbers[], int numberToFind)
    {
        int low = 0;
        int high = numbers.length - 1;
        
        while (low <= high) {
            int middlePosition = (low + high) / 2;
 
            // Check if numberToFind is present at mid
            if (numberToFind == numbers[middlePosition])
                return middlePosition;
 
            // If numberToFind greater, ignore left half
            if (numberToFind > numbers[middlePosition]) {
            	low = middlePosition + 1;
            }
            // If numberToFind is smaller, ignore right half
            else {
            	high = middlePosition - 1;
            }
        }
 
        // If we reach here, then element was
        // not present
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int numbers[] = { 2, 3, 4, 10, 40, 45, 60 };
        int numberToFind = 40;
        int result = ob.binarySearch(numbers, numberToFind);
		if (result == -1) {
			System.out.println("Element is not present in array");
		}else {
			System.out.println("Element is present at " + "index " + result);
		}
    }
}
