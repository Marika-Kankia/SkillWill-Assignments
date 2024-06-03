package DataStructuresPart2;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class WordArray {

    public static int largestNumber(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // ორივე სიას ვაერთიანებთ ერთ სიაში
        ArrayList<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        // უდიდესი რიცხვის პოვნა
        return Collections.max(combinedList);
    }


}
