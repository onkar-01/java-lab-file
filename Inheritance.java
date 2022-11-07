class A {
    int i, j;

    void show() {
        System.out.println(i + "" + j);
    }
}

class B extends A {
    int k;

    void showAll() {
        System.out.println(i + " " + j + " " + k);
    }
}

class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.i = 5;
        b.j = 2;
        b.k = 6;
        b.show();

    }
}
