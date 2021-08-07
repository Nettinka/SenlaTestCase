package case_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindBetterVariant {

    public static void findBetterVar(Item[] items, Vault vault) {
        int n = items.length;  //
        int k = vault.getValue();  //
        //массив промежуточных состояний
        Backpack[][] bp = new Backpack[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) { //нулевую строку и столбец заполняем нулями
                    bp[i][j] = new Backpack(new Item[]{}, 0);
                } else if (i == 1) {
                    bp[1][j] = items[0].getValue() <= j ? new Backpack(new Item[]{items[0]}, items[0].getPrice())
                            : new Backpack(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getValue() > j)
                        bp[i][j] = bp[i - 1][j];
                    else {
                        int newPrice = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getValue()].getPrice();
                        if (bp[i - 1][j].getPrice() > newPrice)
                            bp[i][j] = bp[i - 1][j];
                        else {
                            bp[i][j] = new Backpack(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getValue()].getItems())).toArray(Item[]::new), newPrice);
                        }
                    }
                }
            }
        }
        //Перебор массива и поиск подходящего сочетания цена/объём
        List<Backpack> lastColumn = Arrays.stream(bp).map(row -> row[row.length - 1]).collect(Collectors.toList());
        Backpack backpackWithMax = lastColumn.stream().max(Comparator.comparing(Backpack::getPrice)).orElse(new Backpack(null, 0));
        System.out.println(backpackWithMax.getDescription());

    }
}
