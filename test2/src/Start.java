import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        String theName = "��������";
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���: ");

          String name = in.nextLine();
          if (theName.equals(name)) {
              System.out.println("������, ��������");
          }
          else {
              System.out.println("��� ������ �����");
          }



    }
}

