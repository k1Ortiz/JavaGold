package HelloApp.HelloJava;

import java.util.function.Function;

public class LambdaExpression05 {

	public static void main(String[] args) {
		Function<String, Integer> f1 = str -> Integer.parseInt(str) ;
		int num1 = f1.apply("100");
		System.out.println(num1);

//		メソッド参照。
//		クラス名orインスタンス変数名::メソッド名 でラムダ式を使わずに =メソッド の形で記述できる
//		引数が省略可能で、()も不要。
		Function<String, Integer> f2 = Integer::parseInt;
		int num2 = f2.apply("200");
		System.out.println(num2);
	}
}