import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        String theName = "Вячеслав";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");

          String name = in.nextLine();
          if (theName.equals(name)) {
              System.out.println("Привет, Вячеслав");
          }
          else {
              System.out.println("Нет такого имени");
          }



    }
}

