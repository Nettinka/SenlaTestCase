package case_4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {

    private static String regexWithoutVowels = "[^ёуеыаоэяиюЁУЕЫАОЭЯИЮ]";
    private static String regexWithVowels = "[ёуеыаоэяиюЁУЕЫАОЭЯИЮ]";

    public static void main(String[] args) {

        System.out.println("Введите слова для сортировки.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        sortByVowels(str);
    }

    public static void sortByVowels(String str) {
        numbOfVowelsInWord(str).entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach((k) -> System.out.println(k.getKey()));
    }

    public static HashMap<String, Integer> numbOfVowelsInWord(String str) {
        HashMap<String, Integer> newList = new HashMap<>();

        String[] words = str.split(" ");
        for (String el : words) {
            String replace = el.replaceAll(regexWithoutVowels, "");

            Pattern pattern = Pattern.compile(regexWithVowels);
            Matcher matcher = pattern.matcher(Character.toString(el.charAt(0)));  //проверка первой буквы слова на гласную
            if (matcher.find()) {
                char[] chars = el.toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                for (int i = 0; i < chars.length - 1; i++) {
                    if (chars[i] == ' ') {
                        chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                    }
                }
                String newWord = new String(chars);
                newList.put(newWord, replace.length());
            } else {
                newList.put(el, replace.length());
            }
        }
        return newList;
    }
}
