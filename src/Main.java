//import javax.swing.JOptionPane;
import java.util.*;

//class InputCLass{
//
//    private String field;
//
//    public void print(){
//        System.out.println(this.field);
//    }
//    public void getValue(){
//        if (this.field.equals("")){
//            Scanner jIn = new Scanner(System.in);
//            this.field = jIn.nextLine();
//            if (this.field.equals("")){
//                System.out.println("Error! Message is null!");
//                getValue();
//            } else{
//                print();
//            }
//        }
//    }
//
//    InputCLass(){
//        this.field = "";
//    }
//    InputCLass(String field){
//        this.field = field;
//
//    }
//}
public class Main {
    public static void main(String[] args) {
//        InputCLass obj = new InputCLass();
//        obj.getValue();

//        String input, title = "Биноминальные коэфиценты";
//        input = JOptionPane.showInputDialog(null,
//                "Укажите значение нижнего индекса",
//                title,
//                JOptionPane.QUESTION_MESSAGE);
//        if (input == null){
//            System.exit(0);
//        }
//        int n;
//        n = Integer.parseInt(input);
//        if (n < 0){
//            JOptionPane.showMessageDialog(null,
//                    "Указан неверный параметр",
//                    title,
//                    JOptionPane.ERROR_MESSAGE);
//            System.exit(0);
//        }
//        int[] binoms = new int[n + 1];
//        binoms[0] = 1;
//        String text = "Содержание массива: \n|" + binoms[0] + " |";
//        for (int m = 1; m < binoms.length; m++){
//            binoms[m] = binoms[m - 1] * (n - m + 1)/m;
//            text += " " + binoms[m] + " |";
//        }
//        JOptionPane.showMessageDialog(null,
//                text,
//                title,
//                JOptionPane.INFORMATION_MESSAGE);

        Random rnd = new Random();

        int[][] masA = new int[9][9];

        for (int i = 0; i < masA.length; i++){
            for (int j = 0; j < masA[0].length; j++){
                if (i == j){
                    masA[i][j] = 0;
                } else{
                    masA[i][j] = rnd.nextInt(89) + 11;
                }
            }
        }

        for (int i = 0; i < masA.length; i++){
            for (int j = 0; j < masA[0].length; j++){
                System.out.print(masA[i][j] == 0 ? "   " : masA[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}