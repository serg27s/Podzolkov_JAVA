import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        String theName = "¬€чеслав";
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите им€: ");

          String name = in.nextLine();
          if (theName.equals(name)) {
              System.out.println("ѕривет, ¬€чеслав");
          }
          else {
              System.out.println("Ќет такого имени");
          }



    }
}

