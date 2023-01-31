import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int timeDiff = 0;
		int timeAtMidnight = 0;
		int timeAtNoon = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's the time difference between your origin and your destination?");
		timeDiff = scanner.nextInt();
		
		timeAtMidnight = (24 + timeDiff) % 24;
		timeAtNoon = (12 + timeDiff) % 24;
		
		System.out.println("When it's midnight at home, it will be " + timeAtMidnight + ":00 at destination");
		System.out.println("When it's noon at home, it will be " + timeAtNoon+ ":00 at destination");
		
		scanner.close();
	}

}
