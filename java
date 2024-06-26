// Example to illustrate accessing the instance method .
import java.io.*;

class Foo {

	String name = "";

	// Instance method to be called within the
	// same class or from a another class defined
	// in the same package or in different package.
	public void geek(String name) { this.name = name; }
}

class GFG {
	public static void main(String[] args)
	{

		// create an instance of the class.
		Foo ob = new Foo();

		// calling an instance method in the class 'Foo'.
		ob.geek("GeeksfjbhjorGeeks");
		System.out.println(ob.name);
	}
}
