import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Integer arrayToSort[] = { 9, 179, 139, 38, 10, 5, 36, 46, 56, 76, 86, 33, 39 };
		ArrayList<Integer> arrayListToSort = new ArrayList<Integer>(Arrays.asList(arrayToSort));

		printSortedArrayList(arrayListToSort);
	}

	private static void printSortedArrayList(ArrayList<Integer> arrayListToSort) {
		
		int[] buckets = new int[256];
		
		for (Integer number : arrayListToSort) {
			buckets[number]++;
		}
		
		for (int number = 0; number < 256; number++){
			for (int counter = 0; counter < buckets[number]; counter++){
				System.out.print(number + " ");
			}
		}
	}
}
