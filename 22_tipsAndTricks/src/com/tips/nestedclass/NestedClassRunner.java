package com.tips.nestedclass;

class DefaultClass {

}
public class NestedClassRunner {
	int i;
	class InnerClass {
		public void method() {
			i = 5;
		}
	}

	static class StaticNestedClass {
		public void method() {
			// i = 7;
		}
	}
	public static void main(String[] args) {
		// InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();

	}

}
