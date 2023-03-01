package Seminar5.hw.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Main {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово");
        String searchWord = scanner.next();
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText){
            if (!searchWord.toLowerCase().equals(currentWord.toLowerCase())){
                continue;
            }

            int count = map.getOrDefault(searchWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Количество искомого слова: " + map.getOrDefault(searchWord.toLowerCase(), 0));

    }
}

