package com.api.d;

class SampleClass {

	String str = null;
}

public class StringNewApiRunner {


	// java 11 feature
	public static void main(String[] args) {
		System.out.println(" ".isBlank()); // to check is there any non whitespace character
		System.out.println(" L R ".strip().replace(" ", "@")); // replace " " by @
		System.out.println(" L R ".stripLeading().replace(" ", "@"));
		System.out.println(" L R ".stripTrailing().replace(" ", "@"));

		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println); // java 12 feature
		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s. My age is %d".formatted("Geetha", 39));

		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(sample.str.isBlank()); // gives detail explanation which variable is giving null
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		// "String.isBlank()" because "sample.str" is null
		// at com.api.d.StringNewApiRunner.main(StringNewApiRunner.java:24)

		System.out.println(str.isBlank());

//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "str" is null
//		at com.api.d.StringNewApiRunner.main(StringNewApiRunner.java:17)

	}

}
