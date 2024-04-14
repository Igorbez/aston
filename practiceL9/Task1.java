import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "orange", "strawberry", "kiwi", "grape"};

        List<String> wordsList = Arrays.asList(wordsArray);


        Set<String> uniqueWordsSet = new HashSet<>(wordsList);


        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : wordsList) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Уникальные слова и их количество:");
        for (String word : uniqueWordsSet) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}