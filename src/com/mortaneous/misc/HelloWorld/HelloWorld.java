/*
 * HelloWorld.java
 */
 
package com.mortaneous.misc.HelloWorld;

public class HelloWorld
{
	public static void main(String[] args)
	{
		String greetee = "World";
		int argc = args.length;

		if(argc > 0) {
			greetee = args[0];
		}
		
		if(argc > 1) {
			for(int i=1; i<argc; i++) {
				greetee += ", " + args[i];
			}
		}
		
		System.out.println("Hello " + greetee + "!");
	}
}
