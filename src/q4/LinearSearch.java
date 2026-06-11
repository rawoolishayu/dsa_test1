package q4;

public class LinearSearch {

	public static void main(String[] args) {
		int marks[] = {23,67,4,89,31,55,12};
		int target = 89;
		boolean found = false;
		int count = 0;
		for (int i = 0;i<marks.length;i++) {
			count++;
			System.out.println("Step "+count+":");
			if (marks[i]==target) {
				found = true;
				System.out.println(target+" found at index "+i);
				break;
			}
			else {
				System.out.println(target+" not found at index "+count);
			}
		}
		if (!found) {
			System.out.println("Number "+target+" not found in array");
		}
		System.out.println("Total Steps: "+count);
	}

}
