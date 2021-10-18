package HelloApp.HelloJava;

import java.util.stream.Stream;

public class Stream12 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ami", "naoki", "akko" );
		stream1.filter(s -> s.startsWith("a"))
					.forEach(x -> System.out.println(x + " "));

		System.out.println("");

		Stream<String> stream2 = Stream.of("ami", "naoki", "akko", "ami");
		stream2.distinct()
					.forEach(x -> System.out.println(x + " "));

	}
}
