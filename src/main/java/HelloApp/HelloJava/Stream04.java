package HelloApp.HelloJava;

import java.util.stream.Stream;

public class Stream04 {
		public static void main(String[] args) {
			long result1 = Stream.of("a", "b", "c").count();
			System.out.println(result1);

			Stream<String> stream1 = Stream.of("a", "b", "c");
			stream1.forEach(System.out::print);
	}
}
