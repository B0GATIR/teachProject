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

class Base{
    String data;

    void show(){
        System.out.println(data);
    }

    Base(String data){
        this.data = data;
    }
}

class Alpha extends Base{
    int number;

    void show(){
        super.show();
        System.out.println("This " + number);
    }

    Alpha(String x, int number){
        super(x);
        this.number =  number;
    }
}

class Bravo extends Base{
    String string;

    void show(){
        super.show();
        System.out.println("This " + string);
    }

    Bravo(String x, String string){
        super(x);
        this.string =  string;
    }
}

class MyClass<X extends Base>{
    X obj;

    void show(){
        System.out.println("MyClass object");
        obj.show();
    }

    MyClass(X obj){
        this.obj = obj;
    }
}

public class Main {

    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(8);
//        System.out.printf("All sum = %.3f\n", bank.fellow.getSum());
        MyClass<Alpha> obj = new MyClass<>(new Alpha("Alpha", 1));
        obj.show();
    }
}