import java.util.*;
class No0or1Exception extends Exception {
    public No0or1Exception() {
        super("No 0 or 1");
    }
}


class all5Exception {
    public static void main(String[] args){
        try{
            int m = inpbin();
            int ans =0,i =0;
            while(m!=0){
                int r = m%10;
                ans = ans + r*(int)Math.pow(2,i);
                i++;
                m = m/10;
            }
            System.out.println("Decimal number is: "+ans);
        }
        catch(No0or1Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Program ends");
        }
      
    }
    public static int inpbin()throws No0or1Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n = sc.nextInt();
        int x = n;
        while(x!=0){
            int r = x%10;
            if(r!=0 && r!=1) {
                throw new No0or1Exception();
            }
            x = x/10;
        }
        return n;
    }

}