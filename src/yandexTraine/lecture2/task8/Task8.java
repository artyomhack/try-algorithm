package yandexTraine.lecture2.task8;

/*
    Дана строка (возможно, пустая) состоящая из букв A-Z
    AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB

    Ответ: A4B3C2XYZD4E3F3A6B28
    Нужно написать функцию RLE, которая на выходе даст строку вида A4B3C2XYZD4E3F3A6B28
    И сгенерирует ошибку, если на вход пришла невалидная строка.
    Пояснение:
    Если символ встречается 1 раз, он остаётся без изменений.
    Если символ повторяется более 1 раза, к нему добавляется кол-во повторений
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task8 {

    public static String RLE(String line) {
        if (!line.replaceAll("[A-Z]", "").isEmpty())
            throw new IllegalArgumentException("Не валидная строка");

        for (int i = 0; i < line.length(); i++) {
            if (!Character.isUpperCase(line.charAt(i)))
                throw new IllegalArgumentException("Не валидная строка");
        }

        var count = 1;
        var answer = new StringBuilder();

        for (int i = 0; i < line.length()-1; i++) {
            if (line.charAt(i) == line.charAt(i+1)) {
                count++;
            }
            else if (count > 1 && line.charAt(i) != line.charAt(i+1)) {
                answer.append(line.charAt(i)).append(count);
                count = 1;
            }
            else
                answer.append(line.charAt(i));
        }
        answer.append(line.charAt(line.length()-1)).append(count);
        return answer.toString();
    }

    static class Test {

        @org.junit.jupiter.api.Test
        public void check_RLE_stringValid() {
            var test = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
            var expected = "A4B3C2XYZD4E3F3A6B28";
            var answer = RLE(test);
            System.out.println(answer);
            Assertions.assertEquals(expected, answer );
        }

    }

}
