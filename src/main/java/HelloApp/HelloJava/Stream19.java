package HelloApp.HelloJava;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Stream19 {
	public static void main(String[] args) {
		IntStream stream1i = IntStream.of(2,3,5);
		DoubleStream stream1d = stream1i.mapToDouble(n -> n);
		System.out.println(stream1d.average().getAsDouble());

		IntStream stream2i = IntStream.of(2,3,5);
		DoubleStream stream2d = stream2i.asDoubleStream();
		System.out.println(stream2d.average().getAsDouble());

	}
}
