package DataStructuresPart2;

import java.util.ArrayList;
import java.util.Collections;

import static DataStructuresPart2.WordArray.largestNumber;


public class MainClass {

    public static void main(String[] args) {
        // ArrayList-ს შექმნა
        ArrayList<String> words = new ArrayList<>();

        // 10 სიტყვის დამატება
        words.add("word1");
        words.add("word2");
        words.add("word3");
        words.add("word4");
        words.add("word5");
        words.add("word6");
        words.add("word7");
        words.add("word8");
        words.add("word9");
        words.add("word10");


        for (int i = 0; i < words.size(); i++) {
            System.out.println("Word #" + (i + 1) + " in the massive is: \"" + words.get(i));
        }

    // რიცხვების ორი ArrayList-ის შექმნა და შევსება
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 5, 2, 1, 2, 6);
        Collections.addAll(list2, 8, 5, 8, 6, 4);

    // უდიდესი რიცხვის პოვნა და დაბეჭდვა
    int largestNumber = largestNumber(list1, list2);
        System.out.println("The largest number in both lists is: " + largestNumber);



}
}
