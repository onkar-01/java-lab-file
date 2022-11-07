import java.util.Random;
public class HandleError{
    // public static void main(String args[]){
    //     int a=0, b=0, c=0;
    //     Random r = new Random();
    //     for(int i=0; i<32000; i++){
    //         try{
    //             b = r.nextInt();
    //             c = r.nextInt();
    //             a = 12345 / (b/c);
    //         }catch(ArithmeticException e){
    //             System.out.println("Division by zero."+e);
    //             a = 0; // set a to zero and continue
    //         }
    //         System.out.println("a: " + a);
    //     }
    // }


    public static void main(String[] args) {
        try{
            int a = args.length;
            int c = 52/a;
        }
        catch( ArithmeticException e){
            System.out.println(e);
        }
        catch( Exception e){
            System.out.println(e);
        }
    }

}
