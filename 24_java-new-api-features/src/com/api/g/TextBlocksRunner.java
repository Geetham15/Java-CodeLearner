package com.api.g;

public class TextBlocksRunner {

	// java 15
	// """ Followed by line terminator
	// Automatic alignment is done
	// Trailing white space is stripped
	// You can use textBlocks where ever you can use a string
	public static void main(String[] args) {
		String str = """
				Line1
					Line2
						Line3

								Line5
				Line6
				""";
		String str1 = """
				Line1:%s
					Line2:%s
						Line3

								Line5
				Line6
				""".formatted("XXX", "YYY");
		System.out.print(str);
		System.out.println(str1);

	}

}
