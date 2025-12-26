import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum = 0;
        for(int n : L){
            sum += n;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (int i : L){
            if(isEven(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isEven(int i){
        return (i % 2 == 0);
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        Set<Integer> set = new HashSet<>(L2);
        List<Integer> result = new ArrayList<>();
        for(int i : L1){
            if(set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }
}
