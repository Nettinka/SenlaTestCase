package case_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    final static String errorSbg = "Неккоректный формат ввода. Введите целое число!";

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите целое число");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println(findDivider(str));
        }

    }

    public static String findDivider(String str){
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            return errorSbg;
        }

        int numb = Integer.parseInt(str);

        String result = "";

        ArrayList<Multiplayer> multiplayers = new ArrayList<>();

        for(int i = 1; i <= numb; i++){
            if(numb % i == 0){
                Multiplayer multiplayer = new Multiplayer(i, (numb / i));
                multiplayers.add(multiplayer);
            }
        }
        for(int k = 1; k < multiplayers.size(); k++){

            if(multiplayers.get(k).getFirst() == multiplayers.get(k - 1).getSecond()){
                result += Integer.toString(multiplayers.get(0).getFirst()) + " * " + Integer.toString(multiplayers.get(0).getSecond()) + "\n";
                break;
            }
            result += Integer.toString(multiplayers.get(k).getFirst()) + " * " + Integer.toString(multiplayers.get(k).getSecond()) + "\n";
        }
        return result;
    }
}
