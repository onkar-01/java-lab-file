class X {
	int i, j;

	X() {
		i = 2;
		j = 3;
	}

	X(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Y extends X {
	int k;

	Y() {
		i = 1;
		j = 2;
		k = 3;
	}

	Y(int a, int b, int c) {
		i = a;
		j = b;
		k = c;
	}

	void show() { // overrides A show
		// System.out.println("i and j :"+ i +" "+j);
		System.out.println("k: " + k);
		super.show();
	}

}

public class overriding {

	public static void main(String[] args) {
		Y subob = new Y(5, 7, 8);
		subob.show();

	}

}
