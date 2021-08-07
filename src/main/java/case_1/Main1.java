package case_1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите текст:");

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println(SumNumber.sumOfNumberInString(str));
        }
    }
}
