

public class exec {
    static void method1(){
        int a = 0;
        int c = 52/a;
    }

    public static void main(String[] args) {
        try{
            method1();
        }
        catch( ArithmeticException e){
            System.out.println(e);
        }
    }
}
