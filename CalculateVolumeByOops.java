import java.util.*;

class volume {
    int length, width, height;

    volume(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int calculateVolume() {
        int volume = length * width * height;
        return volume;
    }
}

public class CalculateVolumeByOops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length, width and height: ");
        int length = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();
        volume v = new volume(length, width, height);
        System.out.println("The volume of the figure is " + v.calculateVolume());
    }
}
