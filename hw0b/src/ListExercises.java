import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum =0;
        int i=0;
        while ( i<L.size()){
            sum += L.get(i);
            i++;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0 ; i<L.size();i++){
            if (L.get(i)%2==0){
                evenNumbers.add((L.get(i)));
                
            }
        }
        return evenNumbers;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commonNumbers = new ArrayList<>();
        for(int i=0 ; i<L1.size();i++){
            if (L2.contains(L1.get(i))){
                commonNumbers.add(L1.get(i));
            }
        }

        return commonNumbers;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count =0;
        for (int i=0; i<words.size();i++){
            String word= words.get(i);
            for (int j=0;j <word.length();j++){
                if (word.charAt(j)==c){
                    count++;
                }
            }
        }
        return count;
    }
}
