import java.util.*;




class RandomNumberArray{
    public static void main(String[] args){

        Scanner  sc =  new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int capacity = sc.nextInt();

        int[] array = new int[capacity];

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        int smallest = array[0];
        int index = 0;
        for(int i : array){
            System.out.print(i+" ");
        }

        System.out.print("\n");
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }

        System.out.println("The smallest number is " + smallest + " and it is at index " + index);

        


    }
}