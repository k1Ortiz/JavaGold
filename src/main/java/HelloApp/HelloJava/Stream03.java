package HelloApp.HelloJava;

import java.util.Arrays;
import java.util.List;

public class Stream03 {

		public static void main(String[] args) {
			List<String> data1 = Arrays.asList("mana", "naoki", "ryo");

			boolean result1 = data1.stream().allMatch(s -> s.length() >= 3);
			boolean result2 = data1.stream().anyMatch(s -> s.length() ==4);
			boolean result3 = data1.stream().noneMatch(s -> s.length() == 4);

			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);

//			1つのストリームを2回連続で操作するとエラーになる
//			※正確には、1つのストリームは終端操作は1回しか呼び出せない

			/*
			Stream<String> stream1 = data1.stream();
			boolean result4 = stream1.allMatch(s -> s.length() >= 3);
			boolean result5 = stream1.anyMatch(s -> s.length() == 4);
			 */
	}

}
