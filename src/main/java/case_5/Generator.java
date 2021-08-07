package case_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Generator {

    private static LinkedList<Numb> numbLinkedList = new LinkedList<Numb>();

    public static LinkedList<Numb> getListNumb(String str) {
        numbLinkedList.clear();
        List<Integer> integerList = new ArrayList<>();
        String[] numbers = str.split("");
        for (String el : numbers) {
            integerList.add(Integer.parseInt(el));
        }
        int maxNumb = Collections.max(integerList);
        List<Integer> indexMax = new ArrayList<>();

        String finalResult = "";
        for (int j = 0; j < integerList.size(); j++) {
            if (integerList.get(j) == 0) {
                NumbZero zero = new NumbZero();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = zero.getFirstStr().replaceAll("\\*", "0");
                    zero.setFirstStr(newFirst);
                    String newSecond = zero.getSecondStr().replaceAll("\\*", "0");
                    zero.setSecondStr(newSecond);
                    String newThird = zero.getThirdStr().replaceAll("\\*", "0");
                    zero.setThirdStr(newThird);
                    String newFourth = zero.getFourthStr().replaceAll("\\*", "0");
                    zero.setFourthStr(newFourth);
                    String newFifth = zero.getFifthStr().replaceAll("\\*", "0");
                    zero.setFifthStr(newFifth);
                    String newSixth = zero.getSixthStr().replaceAll("\\*", "0");
                    zero.setSixthStr(newSixth);
                    String newSeventh = zero.getSeventh().replaceAll("\\*", "0");
                    zero.setSeventh(newSeventh);
                    numbLinkedList.add(zero);
                } else {
                    numbLinkedList.add(zero);
                }
            }
            if (integerList.get(j) == 1) {
                NumbOne one = new NumbOne();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = one.getFirstStr().replaceAll("\\*", "1");
                    one.setFirstStr(newFirst);
                    String newSecond = one.getSecondStr().replaceAll("\\*", "1");
                    one.setSecondStr(newSecond);
                    String newThird = one.getThirdStr().replaceAll("\\*", "1");
                    one.setThirdStr(newThird);
                    String newFourth = one.getFourthStr().replaceAll("\\*", "1");
                    one.setFourthStr(newFourth);
                    String newFifth = one.getFifthStr().replaceAll("\\*", "1");
                    one.setFifthStr(newFifth);
                    String newSixth = one.getSixthStr().replaceAll("\\*", "1");
                    one.setSixthStr(newSixth);
                    String newSeventh = one.getSeventh().replaceAll("\\*", "1");
                    one.setSeventh(newSeventh);
                    numbLinkedList.add(one);
                } else {
                    numbLinkedList.add(one);
                }
            }
            if (integerList.get(j) == 2) {
                NumbTwo two = new NumbTwo();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = two.getFirstStr().replaceAll("\\*", "2");
                    two.setFirstStr(newFirst);
                    String newSecond = two.getSecondStr().replaceAll("\\*", "2");
                    two.setSecondStr(newSecond);
                    String newThird = two.getThirdStr().replaceAll("\\*", "2");
                    two.setThirdStr(newThird);
                    String newFourth = two.getFourthStr().replaceAll("\\*", "2");
                    two.setFourthStr(newFourth);
                    String newFifth = two.getFifthStr().replaceAll("\\*", "2");
                    two.setFifthStr(newFifth);
                    String newSixth = two.getSixthStr().replaceAll("\\*", "2");
                    two.setSixthStr(newSixth);
                    String newSeventh = two.getSeventh().replaceAll("\\*", "2");
                    two.setSeventh(newSeventh);
                    numbLinkedList.add(two);
                } else {
                    numbLinkedList.add(two);
                }
            }
            if (integerList.get(j) == 3) {
                NumbThree three = new NumbThree();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = three.getFirstStr().replaceAll("\\*", "3");
                    three.setFirstStr(newFirst);
                    String newSecond = three.getSecondStr().replaceAll("\\*", "3");
                    three.setSecondStr(newSecond);
                    String newThird = three.getThirdStr().replaceAll("\\*", "3");
                    three.setThirdStr(newThird);
                    String newFourth = three.getFourthStr().replaceAll("\\*", "3");
                    three.setFourthStr(newFourth);
                    String newFifth = three.getFifthStr().replaceAll("\\*", "3");
                    three.setFifthStr(newFifth);
                    String newSixth = three.getSixthStr().replaceAll("\\*", "3");
                    three.setSixthStr(newSixth);
                    String newSeventh = three.getSeventh().replaceAll("\\*", "3");
                    three.setSeventh(newSeventh);
                    numbLinkedList.add(three);
                } else {
                    numbLinkedList.add(three);
                }
            }
            if (integerList.get(j) == 4) {
                NumbFour numb = new NumbFour();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "4");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "4");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "4");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "4");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "4");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "4");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "4");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
            if (integerList.get(j) == 5) {
                NumbFive numb = new NumbFive();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "5");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "5");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "5");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "5");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "5");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "5");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "5");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
            if (integerList.get(j) == 6) {
                NumbSix numb = new NumbSix();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "6");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "6");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "6");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "6");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "6");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "6");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "6");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
            if (integerList.get(j) == 7) {
                NumbSeven numb = new NumbSeven();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "7");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "7");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "7");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "7");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "7");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "7");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "7");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
            if (integerList.get(j) == 8) {
                NumbEight numb = new NumbEight();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "8");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "8");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "8");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "8");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "8");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "8");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "8");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
            if (integerList.get(j) == 9) {
                NumbNine numb = new NumbNine();
                if (integerList.get(j) == maxNumb) {
                    String newFirst = numb.getFirstStr().replaceAll("\\*", "9");
                    numb.setFirstStr(newFirst);
                    String newSecond = numb.getSecondStr().replaceAll("\\*", "9");
                    numb.setSecondStr(newSecond);
                    String newThird = numb.getThirdStr().replaceAll("\\*", "9");
                    numb.setThirdStr(newThird);
                    String newFourth = numb.getFourthStr().replaceAll("\\*", "9");
                    numb.setFourthStr(newFourth);
                    String newFifth = numb.getFifthStr().replaceAll("\\*", "9");
                    numb.setFifthStr(newFifth);
                    String newSixth = numb.getSixthStr().replaceAll("\\*", "9");
                    numb.setSixthStr(newSixth);
                    String newSeventh = numb.getSeventh().replaceAll("\\*", "9");
                    numb.setSeventh(newSeventh);
                    numbLinkedList.add(numb);
                } else {
                    numbLinkedList.add(numb);
                }
            }
        }

        return numbLinkedList;
    }

    public static String getGraphicNumb() {
        String result = "";
        for (Numb el : numbLinkedList) {
            result += el.getFirstStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getSecondStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getThirdStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getFourthStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getFifthStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getSixthStr();
            result += "  ";
        }
        result += "\n";

        for (Numb el : numbLinkedList) {
            result += el.getSeventh();
            result += "  ";
        }
        return result;
    }

}
