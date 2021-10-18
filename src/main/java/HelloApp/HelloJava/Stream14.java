package HelloApp.HelloJava;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream14 {

	public static void main(String[] args) {
	    Stream<String> stream1a = Stream.of("naoki", "akko", "ami");
	    Stream<String> stream1b = stream1a.map( s -> s.toUpperCase());
	    stream1b.forEach(x -> System.out.print(x + " "));
	    System.out.println();

	    Stream<String> stream2s = Stream.of("naoki", "akko", "ami");
	    Stream<Integer> stream2i = stream2s.map( s -> s.length());
	    stream2i.forEach( x -> System.out.print(x + " "));
	    System.out.println();

	    IntStream stream3a = IntStream.of(1,2,3);
	    IntStream stream3b = stream3a.map( n -> n * 10);
	    stream3b.forEach( x -> System.out.print(x + " "));
	}


}
