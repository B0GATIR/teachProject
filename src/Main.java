//import javax.swing.JOptionPane;
import java.nio.charset.Charset;
import java.util.*;
//import Packages.ColoredFigure;

//class BankAccount{
//    class Person{
//        String name;
//        int startSum;
//        int time;
//
//        public double getSum(){
//            double allSum = startSum;
//            for (int i = 1; i <= time; i++){
//                allSum *= (1 + rate/100);
//            }
//            return allSum;
//        }
//
//        Person(String name, int startSum, int time){
//            this.name = name;
//            this.startSum = startSum;
//            this.time = time;
//        }
//    }
//
//    double rate;
//    Person fellow;
//
//    private Person createPerson(){
//        Scanner jIn = new Scanner(System.in);
//        return new Person(jIn.nextLine(), Integer.parseInt(jIn.nextLine()), Integer.parseInt(jIn.nextLine()));
//    }
//    BankAccount(int rate){
//        this.rate = rate;
//        fellow = createPerson();
//    }
//}

interface MyInterface<X>{
    X get();
    void set(X arg);
}

class Alpha implements MyInterface<Integer>{
    private Integer value;

    public Integer get(){
        return value;
    }

    public void set(Integer arg){
        this.value = arg;
    }

    void show(){
        System.out.println(value + "!");
    }

    Alpha(Integer arg){
        set(arg);
    }
}

public class Main {
    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(8);
//        System.out.printf("All sum = %.3f\n", bank.fellow.getSum());

        MyInterface intf;
        Alpha A = new Alpha(1);
        A.show();
        intf = A;
        intf.set(0);
        A.show();
    }
}