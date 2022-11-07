class M {
	int i, j;

	M() {
		i = 2;
		j = 3;
	}

	M(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println("i and j " + i + " " + j);
	}
}

class Z extends M {
	int k;

	Z() {
		i = 1;
		j = 2;
		k = 3;
	}

	Z(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show(String msg) { // overloads A show
		System.out.println(msg + k);

	}

}

public class Overloading {

	public static void main(String[] args) {
		Z subob = new Z(7, 3, 9);
		subob.show("This is k:  ");
		subob.show();

	}

}
