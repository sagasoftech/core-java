package com.corejava.algorithms.searching;

public class BinarySearchRecursive {
	
    // Returns index of numberToFind if it is present in numbers[].
    int binarySearch(int numbers[], int low, int high, int numberToFind)
    {
        if (high >= low) {
            int middlePosition = (low + high) / 2;
 
            // If the element is present at the
            // middle itself
            if (numbers[middlePosition] == numberToFind)
                return middlePosition;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (numbers[middlePosition] > numberToFind) {
            	high = middlePosition - 1;
            	return binarySearch(numbers, low, high, numberToFind);
            }
                
 
            // Else the element can only be present
            // in right subarray
            low = middlePosition + 1;
            return binarySearch(numbers, low, high, numberToFind);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int numbers[] = { 2, 3, 4, 10, 40, 45, 60 };
        int low = 0;
        int high = numbers.length - 1;
        int numberToFind = 40;
        int result = ob.binarySearch(numbers, low, high, numberToFind);
        System.out.println("Element to Search: " + numberToFind);
		if (result == -1) {
			System.out.println("Element is not present in array");
		}else {
			System.out.println("Element is present at " + "index " + result);
		}
    }
}
