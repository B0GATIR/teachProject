//import javax.swing.JOptionPane;
import java.util.Scanner;

class InputCLass{

    private String field;

    public void print(){
        System.out.println(this.field);
    }
    public void getValue(){
        if (this.field.equals("")){
            Scanner jIn = new Scanner(System.in);
            this.field = jIn.nextLine();
            if (this.field.equals("")){
                System.out.println("Error! Message is null!");
                getValue();
            } else{
                print();
            }
        }
    }

    InputCLass(){
        this.field = "";
    }
    InputCLass(String field){
        this.field = field;

    }
}
public class Main {
    public static void main(String[] args) {
        InputCLass obj = new InputCLass();
        obj.getValue();
    }
}