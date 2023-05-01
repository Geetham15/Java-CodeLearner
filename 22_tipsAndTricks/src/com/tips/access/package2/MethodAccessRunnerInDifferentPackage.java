package com.tips.access.package2;

import com.tips.access.package1.Example;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		Example example = new Example();
		example.publicMethod();
		// example.protectedMethod();
		// example.privateMethod();
		// example.defaultMethod();

	}

}
