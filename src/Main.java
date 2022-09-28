import java.text.ParseException;
import java.util.*;

public class Main {

    static public int[] getArray(int length){
        int[] array = new int[length];

        for (int i = 0; i < length; i++){
            array[i] = i;
        }

        return array;
    }

    public static void main(String[] args) {
        Exception me = new Exception("me Error");
        Scanner jIn = new Scanner(System.in);

        try {
            int l = jIn.nextInt();
            int[] array = getArray(l);
            try {
                throw me;
//                int i = jIn.nextInt();
//                System.out.println(array[i]);
            } catch (Exception e){
                System.out.println(e);
            } finally {
                for (int i : array) {
                    System.out.print(i + " ");
                }
            }
        } catch (NegativeArraySizeException e){
            System.out.println(e);
        } catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}