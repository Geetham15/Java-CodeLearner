package com.tips.access.package1;

public class Example {

	public void publicMethod() {
	}

	protected void protectedMethod() { // can only be used either in same package or subclass
	}

	private void privateMethod() { // available only inside specific class
	}

	void defaultMethod() { // available in that class or same package
	}

	public static void main(String[] args) {
		Example example = new Example();
		example.publicMethod();
		example.protectedMethod();
		example.privateMethod();
		example.defaultMethod();

	}
}
