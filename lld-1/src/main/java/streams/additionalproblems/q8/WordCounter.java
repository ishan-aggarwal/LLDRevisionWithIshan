package streams.additionalproblems.q8;

import java.util.Arrays;
import java.util.List;

public class WordCounter {
    public static long countWords(List<String> sentences) {
        long wordCount = sentences.stream()
                .filter(sentence -> !sentence.contains("Java"))
                .map(sentence -> sentence.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .count();

        return wordCount;
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity."
        );

        long wordCount = WordCounter.countWords(sentences);
        System.out.println(wordCount);
    }
}
