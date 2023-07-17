import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeriesGenerator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		
		String series=IntStream.range(1, a).mapToObj(i -> String.valueOf(2*i-1)).collect(Collectors.joining(","));
		System.out.println("Output: " + series);
	}

}
