package hw_06_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * В программе используются методы, которорые детерминированы и не обладают побочными эффектами.
 * Монады реализуется посредством Stream API.
 */

public class Main {
    public static void main(String[] args) {
        String strangersWords = strangersWords();
        List<String> dic = getDic(strangersWords);
        dic.forEach(System.out::println);
    }

    private static List<String> getDic(String strangersWords) {
        return Arrays.stream(strangersWords
                .replaceAll("\\p{P}", "")
                .split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private static String strangersWords() {
        return "Ee-e-e-oh-mum-a-weh" +
                "Ee-e-e-oh-mum-a-weh" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "In the jungle, the mighty jungle" +
                "The lion sleeps tonight" +
                "In the jungle, the quiet jungle" +
                "The lion sleeps tonight" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Near the village, the peaceful village" +
                "The lion sleeps tonight" +
                "Near the village, the quiet village" +
                "The lion sleeps tonight" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Hush my darling, don't fear my darling" +
                "The lion sleeps tonight" +
                "Hush my darling, don't fear my darling" +
                "The lion sleeps tonight" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Uyimbube, uyimbube, uyimbube, uyimbube" +
                "Ee-e-e-oh-mum-a-weh" +
                "Ee-e-e-oh-mum-a-weh";
    }
}