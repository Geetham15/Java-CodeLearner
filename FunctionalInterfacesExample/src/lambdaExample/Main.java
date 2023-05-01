package lambdaExample;

import functionalInterfaceExample.GreetingMessage;

//Lambda are the simple way to implement the interfaces
public class Main {

	public static void main(String[] args) {

		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		gm.greet("Geetha");

		GreetingMessage gm2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		gm2.greet("Geetha2");

		MessagePrinter mp = () -> {
			System.out.println("This is a message");
		};
		mp.printMessage();
	}

}
