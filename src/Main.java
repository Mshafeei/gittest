import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(1224);
        int x = random.nextInt();
        if (x > 50){
            System.out.println("t");
        }
        else {
            System.out.println("f");
        }
    }
}