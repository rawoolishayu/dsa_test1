package q5;

public class BinarySearchCode {

	public static void main(String[] args) {
		int array[] = {4, 12, 23, 31, 55, 67, 89};
		int target = 12;
		int left = 0;
		int right = array.length - 1;
		int mid = (left+right)/2;
		boolean found = false;
		int count = 0;
		while (left<=right) {
			count++;
			System.out.println("Step "+count+":");
			System.out.println("Left = "+left);
			System.out.println("Right = "+right);
			System.out.println("Mid = "+mid);
			System.out.println("Value at mid = "+array[mid]);
			if (target==array[mid]) {
				found = true;
				System.out.println(target+" found at index "+mid+" in "+count+" step/s");
				break;
			}
			else if (target>array[mid]) {
				left = mid+1;
				mid = (left+right)/2;
			}
			else {
				right = mid-1;
				mid = (left+right)/2;
			}
			System.out.println(target+" not found at index "+mid+" in "+count+" step/s");
		}
		if (!found) {
			System.out.println(target+" was not found in the array in "+count+" step/s");
		}
		System.out.println("Total Steps: "+count);
	}

}
