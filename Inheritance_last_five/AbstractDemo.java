/* Abstract Class: 
 * 1. Any class that contains the one or more abstract methods must be declared as abstract class
 * 2. There can be no objects of abstract class
 * 3. You cannot declare abstract constructors and abstract static methods
 * 4. Any subclass extending abstract class must either define all abstract methods of
 * its super class or itself be defined abstract itself.
 */

abstract class me {
	abstract void callme();

	void callmetoo() {
		System.out.println("This is concrete method");
	}
}

class metoo extends me {
	void callme() {
		System.out.println("Implementation of callme");
	}

	void othermethod() {
		System.out.println("Other methods can also be defined");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		metoo subob = new metoo();
		subob.callme();
		subob.othermethod();

	}

}
