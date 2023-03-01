package Seminar5.hw.task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 */
public class Main {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null){
                hashMap.put(word, 1);
            }
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}

