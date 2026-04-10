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
	public static void insertionSort1(String[] arr) {
		for (int i=1; i<arr.length;i++) {
			String key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j].compareTo(key)>0) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
	    int[] numbers = {5, 2, 18, 1, 13, 6, 9, 10, 11, -1};
	    String[] studenti = {"Maris", "Alise", "Talivaldis", "Benrijs", "Darta"};
	     insertionSort(numbers);
	     insertionSort1(studenti);

	     System.out.println("Sorted list:");
	     for (int num : numbers) {
	     System.out.print(num + " ");
	     }
	     System.out.println();
	     System.out.println("Sorted name list: ");
	     for(String names : studenti) {
	    	 System.out.println(names+" ");
	     }
	        }
	
	
	}

