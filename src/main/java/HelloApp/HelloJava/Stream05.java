package HelloApp.HelloJava;

import java.util.stream.IntStream;

public class Stream05 {
	public static void main(String[] args) {

		IntStream stream = IntStream.of(10, 20, 30);

//		reduceは第一引数に初期値、第2引数に実際の集約処理を記述する
//		第2引数は、BinaryOperator(引数を2つ取り、int型で結果を返す)

		int result = stream.reduce(0, (a, b) -> a + b);
//		int result = stream.reduce(0, Integer::sum);

		System.out.println(result);
	}
}
