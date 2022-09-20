import java.text.ParseException;
import java.util.*;


public class Main {

    static public int toZero(int step, int num){
        if (num == 0){
            return step;
        } else if (num % 2 == 0){
            step++;
            return toZero(step, num / 2);
        } else {
            step++;
            return toZero(step, num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner jIn = new Scanner(System.in);

        int input = Integer.parseInt(jIn.nextLine());

        System.out.println(toZero(0, input));
    }
}