package com.bsamuel.exercise.string;

public class ReversingWords {

    public static final String WHITESPACE = " ";

    public static void main(String[] args) {
        ReversingWords rw = new ReversingWords();
        String str = rw.reverseString("Hello World");
        System.out.println(str);
    }

    public String reverseString(String str) {
        String[] words = str.split(WHITESPACE);

        StringBuilder reversedString = new StringBuilder();

        for(String word: words) {
            StringBuilder reverseWords = new StringBuilder();

            for (int i = word.length() -1; i >= 0 ; i--) {
                reverseWords.append(word.charAt(i));
            }

            reversedString.append(reverseWords).append(WHITESPACE);
        }
        return reversedString.toString();


    }
}
