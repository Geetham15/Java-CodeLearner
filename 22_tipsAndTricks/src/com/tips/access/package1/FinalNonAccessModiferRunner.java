package com.tips.access.package1;

//
final class FinalClass { // final class cannot be extended

}

//class SomeClass extends FinalClass {
//
//}

class SomeClass {
	final public void doSomething() { // final method cannot be overriden
	}

	public void doSomethingElse(final int arg) {
		// arg = 6;
	}
}

class ExtendingClass extends SomeClass {
	// @Override
	// public void doSomething() {
	// }
}
public class FinalNonAccessModiferRunner {

	public static void main(String[] args) {
		final int i = 5; // assign a values once but not more than that
		// i = 7;

	}

}
