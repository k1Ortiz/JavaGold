package HelloApp.HelloJava;

import java.util.function.Function;

public class LambdaExpression03 {

	public static void main(String args[]) {

		/*
		 Function<T, R> …	T型の引数を受けとって、R型の値を返す
										メソッドは apply(T)
		 */

//     匿名クラス
		String str1 = new Function<String, String>(){
			public String apply(String str) {
				return "Hello " + str ;
			}
		}.apply("naoki");
		System.out.println("匿名クラス: " + str1);

//		ラムダ式(省略なし)
		Function<String, String> f2 = (String str) -> {
			return "Hello " + str ;
		};

		String str2 = f2.apply("naoki");
		System.out.println("ラムダ式(省略なし): " + str2 );

//		ラムダ式(省略あり)
		Function<String, String> f3 = str -> "Hello " + str;
		String str3 = f3.apply("naoki");
		System.out.println("ラムダ式(省略あり): " + str3 );

	}
}
