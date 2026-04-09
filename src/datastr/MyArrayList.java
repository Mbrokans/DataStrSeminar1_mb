package datastr;



public class MyArrayList {

	    public static void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];     
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key; 
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 18, 1, 13, 6, 9, 10, 11, -1};

	        insertionSort(numbers);

	        System.out.println("Sorted list:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}

