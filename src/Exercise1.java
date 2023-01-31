import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int angle1 = 0;
		int angle2 = 0;
		int angle3 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter angle 1:");
		angle1 = scanner.nextInt();
		
		System.out.println("Enter angle 2:");
		angle2 = scanner.nextInt();
		
		System.out.println("Enter angle 3:");
		angle3 = scanner.nextInt();
		
		if((angle1 + angle2 + angle3) == 180) {
			System.out.println("It is a valid triangle.");
		} else {
			System.out.println("It is not a valid triangle.");
		}
		
		scanner.close();
	}
}
