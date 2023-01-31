import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		String word = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word: ");		
		word = s.nextLine();
		
		Scrabble sc = new Scrabble();
		
		System.out.println("Your score is: " + sc.getScore(word));
		
		s.close();
	}
	
	private int getScore(String word) {
		int score = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("E", 1);
		map.put("I", 1);
		map.put("O", 1);
		map.put("U", 1);
		map.put("L", 1);
		map.put("N", 1);
		map.put("R", 1);
		map.put("S", 1);
		map.put("T", 1);
		
		map.put("D", 2);
		map.put("G", 2);
		
		map.put("B", 3);
		map.put("C", 3);
		map.put("M", 3);
		map.put("P", 3);
		
		map.put("F", 4);
		map.put("H", 4);
		map.put("V", 4);
		map.put("W", 4);
		map.put("Y", 4);
		
		map.put("K", 5);
		
		map.put("J", 8);
		map.put("X", 8);
		
		map.put("Q", 10);
		map.put("Z", 10);
		
		String[] letters = word.split("", 0);
		
		for(int i = 0; i < letters.length; i++) {
			if(map.containsKey(letters[i].toUpperCase())) {
				score += map.get(letters[i].toUpperCase());
			}
		}
		
		return score;
	}

}
