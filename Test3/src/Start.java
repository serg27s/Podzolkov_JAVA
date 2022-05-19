import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.print("Input your number: ");
//        String name = in.nextLine();
//        if (theName.equals(name)) {
//            System.out.println("Привет, Вячеслав");
//        }
//        else {

        System.out.print("Ведите размер массива:>");
        try {
            int size = in.nextInt();

        int[] theNumbers = new int[size];

            System.out.print("Ведите эдементы массива:>'");

        for (int i = 0; i<size; i++){

                System.out.println( + (i+1) + "й эл-т: ");
                theNumbers[i] = in.nextInt();
            }

        System.out.println("Элементы кратные 3: ");
        for (int i = 0; i<size; i++){
            if (theNumbers[i]%3 == 0) {
                System.out.println( + (i+1) + "й эл-т: "+ theNumbers[i]);
            }


        };
        } catch (InputMismatchException e){System.out.print("Некорректные данные"); System.exit(0); }
          catch (NegativeArraySizeException e){System.out.print("Размер массива не может быть отрицательным"); System. exit(0); }
    }
}

