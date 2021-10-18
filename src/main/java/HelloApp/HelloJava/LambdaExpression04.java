package HelloApp.HelloJava;

import java.util.function.Function;

public class LambdaExpression04 {

	int a = 10;

	public void method() {
		final int b = 20;
		int c = 30;
		int d = 40;
		d = 50;
		int e = 60;

		Function<String, String> f1 = (String str) -> {
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
//			System.out.println("d: " + d);
			System.out.println("e: " + e);
//			e = 100;
			return "Hello " + str;
		};

		System.out.println(f1.apply("naoki"));
	}

	public static void main(String[] args) {
		new LambdaExpression04().method();
	}
}
