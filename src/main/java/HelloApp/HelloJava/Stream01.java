package HelloApp.HelloJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stream01 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("bb", "aa", "cc");

//		これまでの実装
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}

		Collections.sort(list);
		for (String s : list) {
			System.out.println(s + " ");
		}

//		Stream APIを使った実装

//		中間操作: Stream<T> sorted ⇒ 自然順序に従ってソートした結果から構成されるストリームを返す
//		              <R> Stream<R> map(Function<? Super T, ? Super R> mapper)
//		               ⇒ 指定される関数を適用した複数の結果から構成される1つのストリームを返す
//		終端操作: forEach(Consumer<? Super T> action)  ⇒ 各要素に対して指定されたアクションを実行

		list = Arrays.asList("bb", "cc", "aa");
		list.stream().sorted().map(s -> s.toUpperCase()).forEach(
												s -> System.out.println(s + " "));

	}

}
