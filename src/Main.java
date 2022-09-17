import Packages.MathForProgramming;
import Packages.LeetCode;
import java.util.*;

public class Main {
    public static boolean canBeConstruct(String ransomNote, String magazine){
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        int counter = 0;
        for (int i = 0; i < ransomNoteArray.length; i++){
            for (int j = 0; j < magazineArray.length; j++){
                if (ransomNoteArray[i] == magazineArray[j]){
                    counter++;
                    magazineArray[j] = ' ';
                    System.out.println(magazine);
                    break;
                }
            }
        }


        if (counter == ransomNote.length())
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(canBeConstruct("aa", "ab"));
    }
}