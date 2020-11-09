import java.io.*;
import java.util.*;
//import org.apache.commons.lang3.StringUtils;

public class Solution {

    public static void main(String[] args) {
        
        // Scanner scans 2 lines (Line 1 = hello) (Line 2 = java)
        Scanner sc=new Scanner(System.in);
        
        // Scanner assigns variables for each line and goes to next line
        String A=sc.next();
        String B=sc.next();
         
        // variable to capture the length of the two strings from Scanner
        int lengthTotal = (A.length()+B.length());

        // variable to compare the two strings from Scanner.  
        int S = A.compareTo(B);

        // print out the length of variables A and B
        System.out.println(lengthTotal);
               
        // If Statement to compare if A is lexographically higher than B and print yes,          // no, or equal  
            if (S < 0) { System.out.println("No");
                    } else if (S == 0) {
            System.out.println("Values are equal");
                    } else if (S > 0) {
            System.out.println("Yes");
                    }
        // Assign 2 new string variables for lines A, B        
        String cap1  = A;
        String cap2  = B; 
        
        // Convert the string variables to capitalize the first letter of each string
        cap1 = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        cap2 = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        
        // Print out the string values concatenated with a space in between
        System.out.println(cap1+" "+cap2);           
    }
}





