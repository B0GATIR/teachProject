package Packages;

import java.util.*;

class RomanNumeral{
    char sym;
    int num;

    static public int findNum(RomanNumeral[] array, char s){
        int result = 0;
        for (RomanNumeral obj: array) {
            if (obj.sym == s){
                result =  obj.num;
            }
        }
        return result;
    }

    static RomanNumeral[] getAllRomanNumerals(){
        RomanNumeral[] array = new RomanNumeral[7];

        array[0] = new RomanNumeral('I', 1);
        array[1] = new RomanNumeral('V', 5);
        array[2] = new RomanNumeral('X', 10);
        array[3] = new RomanNumeral('L', 50);
        array[4] = new RomanNumeral('C', 100);
        array[5] = new RomanNumeral('D', 500);
        array[6] = new RomanNumeral('M', 1000);

        return array;
    }

    static int getArabianNum(RomanNumeral[] array, char[] string){
        int result = 0;
        for (int i = 0; i < string.length - 1; i++){
            if (RomanNumeral.findNum(array, string[i]) <
                    RomanNumeral.findNum(array, string[i + 1])){
                result += RomanNumeral.findNum(array, string[i]) * -1;
            } else {
                result += RomanNumeral.findNum(array, string[i]);
            }
        }
        return result  + RomanNumeral.findNum(array, string[string.length - 1]);
    }

    RomanNumeral(char sym, int num){
        this.num = num;
        this.sym = sym;
    }

    @Override
    public String toString(){
        return sym + " " + num;
    }
}
public class LeetCode {
    static public void RomanInInteger(){
        RomanNumeral[] arrayRomanNumerals = RomanNumeral.getAllRomanNumerals();

        Scanner jIn = new Scanner(System.in);
        char[] string = jIn.nextLine().toCharArray();

        System.out.println(RomanNumeral.getArabianNum(arrayRomanNumerals, string));
    }
}
