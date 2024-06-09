package DataStructuresPart3;
import java.util.HashSet;
import java.util.Set;

public class GetElements {
    public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
            //ახალი სეტი, რომელიც ინახავს საერთო ელემენტებს
            Set<Integer> commonElements = new HashSet<>();

            // ვამოწმებთ set1-ის არსებობას set2-ში
            for (Integer element : set1) {
                if (set2.contains(element)) {
                    commonElements.add(element);
                }
            }

            return commonElements;
        }
    }

