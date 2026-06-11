package q6;

public class BubbleSortCode {
	public static void main(String args[]) {
		int arr[] = {64, 25, 12, 22, 11};
		System.out.println("Array before sorting:");
		printArray(arr);
		bubbleSort(arr);
		
	}
	public static void printArray(int arr[]) {
		for (int i = 0;i<arr.length;i++) {
			System.out.println("Index "+i+": "+arr[i]);
		}
	}
	public static void bubbleSort(int arr[]) {
		int swaps = 0;
		for (int turn = 0;turn<arr.length;turn++) {
			System.out.println("Phase "+(turn+1)+":");
			for (int i = 0;i<arr.length-turn-1;i++) {
				if (arr[i]>arr[i+1]) {
					swaps++;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println("Array after step: ");
				printArray(arr);
			}
		}
		System.out.println("Total swaps = "+swaps);
		System.out.println("Final Array: ");
		printArray(arr);
	}
}
