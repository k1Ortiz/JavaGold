package HelloApp.HelloJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression06 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,1,2);

		/*
//		匿名クラス
		Consumer<List<Integer>> con1 = new Consumer<List<Integer>>() {
			public void accept(List<Integer> list) {
				Collections.sort(list);
			}
		};

//		ラムダ式
		Consumer<List<Integer>> con1 = lambdaList -> Collections.sort(lambdaList);
		 */

//		staticメソッド参照。返り値が無いので、実行時に代入しない形で記述
//		Consumer<T> は、T型の引数を受けとって返り値は無い。メソッドは accept<T>
		Consumer<List<Integer>> con1 = Collections::sort;
		con1.accept(list);
		System.out.println(list);

	}

}
