package case_5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        while (true){
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            Generator.getListNumb(str);
            System.out.println(Generator.getGraphicNumb());
        }
    }
}
