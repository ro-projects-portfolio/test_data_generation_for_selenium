package fabricator;

import java.util.Arrays;

public class WordsExamples {
    public static void main(String[] args) {
        Words words = Fabricator.words();

        System.out.println(words.word()); // random word
        System.out.println(Arrays.toString(words.words(10))); // array with 10 words
        System.out.println(words.sentence(20)); // sentence out of 20 words
        System.out.println(words.paragraph());// 100 chars length block of text
        System.out.println(words.paragraph(2000)); // 2000 chars length block of text
    }

}
