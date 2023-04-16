package ExampleIsVowel;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		super();
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// aeiou AEIOU
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57) { // between '0' to '9'
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 65 && ch <= 90) || // between 'A' to 'Z'
				(ch >= 97 && ch <= 122)) { // between 'a' to 'z'
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		// Alphabet and not vowel
		// ! [ a e i o u]
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

}
