package case_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumber {

    private static String wrongString = "В строке цифр не обнаружено! Введите корректное зеначение.";

    public static String sumOfNumberInString(String str) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()) {
            String numbers = str.replaceAll("[^0-9]", "");
            String[] arrayOfNumb = numbers.split("");
            int sum = 0;
            for(String el : arrayOfNumb){
                sum += Integer.parseInt(el);
            }
            return "Сумма всех цифр в строке равна " + sum;
        }
        return wrongString;
    }
}
