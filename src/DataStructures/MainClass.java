package DataStructures;

import java.util.ArrayList;

import static DataStructures.WordArray.findDigit;
import static DataStructures.WordArray.printArrayList;

public class MainClass {

public static void main(String[] args) {
        // ArrayList-ს შექმნა
        ArrayList<String> words = new ArrayList<>();

        // 10 სიტყვის დამატება
        words.add("Num1");
        words.add("Num2");
        words.add("Num3");
        words.add("Num4");
        words.add("Num5");
        words.add("Num6");
        words.add("Num7");
        words.add("Num8");
        words.add("Num9");
        words.add("Num10");

        // თითოეული სიტყვის დაბეჭდვა for loop-ის გამოყენებით
//        for (int i = 0; i < words.size(); i++) {
//        System.out.println("Number" +" "+ (i + 1) +" "+ "Is : " + words.get(i));
//        }
        printArrayList(words);

// ციფრის პოვნა მასივში

        int[] arr = {6, 7, 1, 2,5};
        int digit = 5;
        findDigit(arr, digit);
        }
}
