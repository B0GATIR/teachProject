//import javax.swing.JOptionPane;
import java.util.Scanner;

class MyClass{
    private int num;
    private char sym;
    static boolean bool = true;

    public void set(int num) {
        this.num = num;
    }

    public void set(char sym) {
        this.sym = sym;
    }

    public void set(){
        Scanner jIn = new Scanner(System.in);
        this.set(Integer.parseInt(jIn.nextLine()));
        this.set(jIn.nextLine().toCharArray()[0]);
    }
    public char getSym() {
        return sym;
    }

    public int getNum() {
        return num;
    }

    static int getSum(int a, int b){
        return a + b;
    }
    MyClass(){
        this.set();
    }

    MyClass(int num, char sym){
        this.num = num;
        this.sym = sym;
    }
}
public class Main {
    public static void main(String[] args) {
//        Scanner jIn = new Scanner(System.in);
//        System.out.printf("Число %5.3f\n", Double.parseDouble(jIn.nextLine()));

//        int a = Integer.parseInt(jIn.nextLine());
//        int b = Integer.parseInt(jIn.nextLine());
//        System.out.println("Больше число " + ((a > b)?"a: ":"b: ") + ((a > b)?a:b));

//        String title = "Сообщение";
//        String text = JOptionPane.showInputDialog("Введите текст");
//        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text, title, JOptionPane.WARNING_MESSAGE);

//        Scanner jIn = new Scanner(System.in);
        MyClass objA = new MyClass();
        MyClass objB = new MyClass(1, 'A');

//        obj.set();

        System.out.println(objA.getNum() + " " + objA.getSym() + " " + objA.bool + "\n" +
                objB.getNum() + " " + objB.getSym() + " " + objB.bool);

        System.out.println(MyClass.getSum(1, 2));
    }
}