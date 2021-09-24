package com.logics;

/*Initialise two variable largest and smallest with arr[0]
Iterate over array
If current element is greater than largest, then assign current element to largest.
If current element is smaller than smallest, then assign current element to smallest.
You will get smallest and largest element in the end.*/

public class SmallestAndLargestInArray {
	public static void main(String[] args) {

		// array of 10 numbers
		int arr[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };

		// assign first element of an array to largest and smallest
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];

		}
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largest);

	}

}
