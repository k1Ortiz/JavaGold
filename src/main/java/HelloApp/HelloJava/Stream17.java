package HelloApp.HelloJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream17 {
	public static void main(String[] args) {

		// CollectはStreamのデータを変形などの処理をし、必要なデータ型に変換する。

		List<String> list =
				Stream.of("one","three","two","three","four")
				.filter(s -> s.length() > 3)
				.peek(e -> System.out.println("フィルタ後 :" + e ))
				.distinct()
				.map(String::toUpperCase)
				.peek(e -> System.out.println("フィルタ前 :" + e))
				.collect(Collectors.toList());
	}
}
