package InputClass;

import java.util.Scanner;

/*final*/ public class InputClass{

    private String field;

    public void print(){
        System.out.println(this.field);
    }
    protected void getValue(){
        if (this.field.equals("")){
            Scanner jIn = new Scanner(System.in);
            this.field = jIn.nextLine();
            if (this.field.equals("")){
                System.out.println("Error! Message is null!");
                getValue();
            } else{
                print();
            }
        } else{
            print();
        }
    }

    public static void getSum(int a, int b){
        System.out.println(a + b);
    }

    public InputClass(){
        this.field = "";
    }
    public InputClass(String field){
        this.field = field;

    }
}