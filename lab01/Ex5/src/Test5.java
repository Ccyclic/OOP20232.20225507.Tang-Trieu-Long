import java.util.Arrays;
import java.util.Scanner;
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		while (true) {
			System.out.println("Enter the array size:");
			size = sc.nextInt();
			if(size>0) {
				break;
			}
			else {
				System.out.println("Invalid size");
			}
		}
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i=0; i<size;i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Sorted array:");
		for (int i=0; i<size;i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		
		
	}
}
