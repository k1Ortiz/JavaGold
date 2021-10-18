package HelloApp.HelloJava;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream16 {
	public static void main(String[] args) {
		Stream.of("naoki","akko","ami")
		  .sorted()
		  .forEach(x -> System.out.print(x + " "));

		System.out.println();

		Stream.of("naoki","akko","ami")
		  .sorted(Comparator.reverseOrder())
		  .forEach(x -> System.out.print(x + " "));
	}
}
