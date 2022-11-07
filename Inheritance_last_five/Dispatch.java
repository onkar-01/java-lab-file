/* Dynamic Method Dispatch is the mechanism by which a call to an overridden method is
 * resolved at run time rather than compile time. Example of run time polymorphism.
 */

class One {
	void callme() {
		System.out.println("Inside One");
	}
}

class Two extends One {
	void callme() { // overrides
		System.out.println("Inside Two");
	}
}

class Three extends Two {
	void callme() { // overrides
		System.out.println("Inside Three");
	}
}

public class Dispatch {

	public static void main(String[] args) {
		One o = new One();
		Two t = new Two();
		Three th = new Three();

		One r;

		r = o;
		r.callme();

		r = t;
		r.callme();

		r = th;
		r.callme();

	}

}
