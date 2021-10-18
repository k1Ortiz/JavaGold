package HelloApp.HelloJava;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaExpression14 {

	public static void main(String[] args) {

//		ToIntFunction<T> T型の引数を受け取って、int型を返す
//		メソッドは applyAsInt(T)

//		ToIntFunction<String> obj1 = s -> s.length();
		ToIntFunction<String> obj1 = (String s) -> {return s.length();};
		System.out.println(obj1.applyAsInt("Java"));

//		IntToDoubleFunction int型の引数を受け取って、Double型を返す
//		メソッドは applyAsDouble(int)

//		IntToDoubleFunction obj2 = i -> i + Math.random();
		IntToDoubleFunction obj2 = (int i) -> {return Math.random();};
		System.out.println(obj2.applyAsDouble(5));

	}

}
