import java.text.ParseException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner jIn = new Scanner(System.in);

        String input = jIn.nextLine();
        int num = 0;

        try {
            num = Integer.parseInt(input);

            System.out.println(num - 1 + " " + num + " " + num + 1);
        } catch (Exception e){
            System.out.println("Error! " + e.getLocalizedMessage());
        }
    }
}