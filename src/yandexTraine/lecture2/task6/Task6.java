package yandexTraine.lecture2.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Вывести все самые короткие слова через пробел
 */
public class Task6 {

    public static String fetchAllMinWords(String[] words) {
        int minLength = words[0].length();
        for (String word : words) {
            if (word.length() < minLength)
                minLength = word.length();
        }

        var answer = new StringBuilder();
        for (String word : words) {
            if (word.length() == minLength) {
                answer.append(word);
            }
        }
        answer.deleteCharAt(answer.length()-1);
        return answer.toString();
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void check_fetchAllMinWords() {
            String[] words = {"aaa", "bb", "b", "cc", "c", "d"};
            System.out.println(fetchAllMinWords(words));
            Assertions.assertEquals("b c d", fetchAllMinWords(words));
        }
    }

}
