package functions;
public class functionDefine implements area,parimeter{
    public void areaofRect(int l,int b){
        System.out.println("Area of Rectangle is "+(l*b));
    }
    public void areaofSquare(int s){
        System.out.println("Area of Square is "+(s*s));
    }
    public void parimeterofRect(int l,int b){
        System.out.println("Parimeter of Rectangle is "+(2*(l+b)));
    }
    public void parimeterofSquare(int s){
        System.out.println("Parimeter of Square is "+(4*s));
    }
}
