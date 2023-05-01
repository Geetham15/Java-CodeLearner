package com.oops.level2.interfaceExample;

// Interface can extends other interface
// If you want to implement a method2 in interface2 then you have to implement both interface1 and interface2
// If you want to implement only the method2 then you need to use abstract class which implement the interface2
// In interfaces you can create a constants but not the variables
// you can create a default method in interface
// Interface everything is public
// Class can implement multiple interfaces but you cannot do with abstract class
public interface GamingConsole {

	public void up();

	public void down();

	public void left();

	public void right();

}
