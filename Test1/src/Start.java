import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your number: ");
        try {


        int number = in.nextInt();
        if (number>7) {
            System.out.println("Привет");
        }

            }
      catch (InputMismatchException e){System.out.print("Некорректные данные"); System.exit(0);}
    }
}