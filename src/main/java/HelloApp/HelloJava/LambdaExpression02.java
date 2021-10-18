package HelloApp.HelloJava;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression02 {

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Tanaka","Sato");
		words.replaceAll( str -> str.toUpperCase() );
		System.out.println(words);
	}

}
