import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberGenerator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		
		String series=IntStream.rangeClosed(1, a).mapToObj(i -> String.valueOf(2*i-1)).collect(Collectors.joining(","));
		
		String Output="Input a = " + a + ", then output: " +series;
		System.out.println(Output);
	}

}
