import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumberCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers (comma-seperated): ");
		String input = sc.nextLine();
		
		String[] numbersArray = input.split(" ");
		List<Integer> numbers = new ArrayList<>();
		for (String numStr: numbersArray) {
			int number = Integer.parseInt(numStr.trim());
			numbers.add(number);
		}
		
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i= 1; i <= 9; i++) {
			countMap.put(i,  0);
		}
		for (int number : numbers) {
			for( int i = 1; i<= 9; i++) {
				if (number % i == 0) {
					countMap.put(i, countMap.get(i) + 1 );
				}
			}
		}
		
		System.out.println("Output: " + countMap);
		
				}
}
