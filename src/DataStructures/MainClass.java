package DataStructures;

import java.util.ArrayList;

import static DataStructures.WordArray.findDigit;


public class MainClass {

public static void main(String[] args) {

        String[] words = new String[10];

        // 10 სიტყვის დამატება მასივში
        words[0] = "word1";
        words[1] = "word2";
        words[2] = "word3";
        words[3] = "word4";
        words[4] = "word5";
        words[5] = "word6";
        words[6] = "word7";
        words[7] = "word8";
        words[8] = "word9";
        words[9] = "word10";


 //        თითოეული სიტყვის დაბეჭდვა for loop-ის გამოყენებით
        for (int i = 0; i < words.length; i++) {
          System.out.println("Word #" + (i + 1) + " in the massive is: \"" + words[i] + "\"");
        }


// ციფრის პოვნა მასივში

        int[] arr = {6, 7, 1, 2,5};
        int digit = 5;
        findDigit(arr, digit);
        }
}
