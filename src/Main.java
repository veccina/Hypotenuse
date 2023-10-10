import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a, b;
      double c ;

      Scanner input = new Scanner(System.in);
        System.out.println("First side : ");
        a = input.nextInt();
        System.out.println("Second side : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse :" + c);

    }
}