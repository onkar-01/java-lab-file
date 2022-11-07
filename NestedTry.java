public class NestedTry {
    public static void main(String[] args){
        try{
            int a = args.length;
            int b = 42/a;
            try{ // nested try block
                if(a==1) a = a/(a-a); // division by zero
                if(a==2){
                    int c[] = {2,3,4};
                    c[50] = 56; // generate an out-of-bounds exception
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out-of-bounds: " + e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0: " + e);
        }
    }
    
}
