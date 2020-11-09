import java.util.Scanner;

public class LexographicalSmallestLargest{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = largest = s.substring(0, k);

    for (int i=1; i<s.length()-k+1; i++) {
        String substr = s.substring(i, i+k);
        if (smallest.compareTo(substr) > 0)
            smallest = substr;
        if (largest.compareTo(substr) < 0)
            largest = substr;
    }
        return smallest + "\n" + largest;
    }

