package HelloApp.HelloJava;

import java.util.Optional;

public class Stream08 {

	public static void main(String[] args) {
		Optional<Integer> op1 = Optional.of(10);
		Optional<Integer> op2 = Optional.empty();

		System.out.println("op1.get: " + op1.get());
//		emptyのため、例外が発生する
//		System.out.println("op2.get: " + op2.get());
		System.out.println("op1.isPresent: " + op1.isPresent());
		System.out.println("op2.isPresent: " + op2.isPresent());

	}

}
