
public class VarArgsDemo2 {

	static void vartest(int ...v) {
		System.out.print("Number of args:"+ v.length + " contents ");
		
		for(int i : v) {
			System.out.print(i + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1[]= {10};
        int n2[] = {1,2,3};
        int n3[] = {};
        
        vartest(n1);
        vartest(n2);
        vartest(n3);
	}
}
