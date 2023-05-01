package com.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {

	public static void main(String[] args) {
		Example example = new Example();
		example.publicMethod();
		example.protectedMethod();
		// example.privateMethod();
		example.defaultMethod();

	}

}
