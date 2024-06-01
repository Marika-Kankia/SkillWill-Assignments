package DataStructures;
import java.util.ArrayList;
class WordArray{

    public static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
    public static void findDigit(int[] arr, int digit) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == digit) {
                    System.out.println("The Index of number " +  digit + " "+ "is: " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Couldn't find " + digit);
            }
        }

    }





