import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����: ");
        try {


        int number = in.nextInt();
        if (number>7) {
            System.out.println("������");
        }

            }
      catch (InputMismatchException e){System.out.print("������������ ������"); System.exit(0);}
    }
}