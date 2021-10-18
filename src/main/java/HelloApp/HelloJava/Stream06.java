package HelloApp.HelloJava;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Stream06 {

		public static void main(String[] args) {
			BinaryOperator<Integer> operator = (a, b) -> a + b;
			Stream<Integer> stream1 = Stream.of(10, 20, 30);

			// Optional型は、Java8で追加された型。変数の値がNullである可能性を明示的に伝える機能を持つ
			// - ifPresent(<メソッド>) を使うと、Nullではない場合だけ()内のメソッドを実行することができる
			// - orElse(<値/変数>) を使うと、Nullだった場合のデフォルト値をセットできる

			Optional<Integer> result = stream1.reduce(operator);
			result.ifPresent(System.out::println);

			Stream<Integer> stream2 = Stream.empty();
			Optional<Integer> result2 = stream2.reduce(operator);

			//  resultが空なので、Optional.emptyが返る
			System.out.println(result2);
			// resultが空なので、何も出力されない
			 result2.ifPresent(System.out::println);

	}

}
