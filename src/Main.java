//import javax.swing.JOptionPane;
import java.util.*;
//import Packages.ColoredFigure;

class BankAccount{
    class Person{
        String name;
        int startSum;
        int time;

        public double getSum(){
            double allSum = startSum;
            for (int i = 1; i <= time; i++){
                allSum *= (1 + rate/100);
            }
            return allSum;
        }

        Person(String name, int startSum, int time){
            this.name = name;
            this.startSum = startSum;
            this.time = time;
        }
    }

    double rate;
    Person fellow;

    private Person createPerson(){
        Scanner jIn = new Scanner(System.in);
        return new Person(jIn.nextLine(), Integer.parseInt(jIn.nextLine()), Integer.parseInt(jIn.nextLine()));
    }
    BankAccount(int rate){
        this.rate = rate;
        fellow = createPerson();
    }
}

abstract class Base{
    private String name;

    void show(){
        System.out.println("Object is: " + name);
    }

    abstract void hello();

    Base(String name){
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(8);
//        System.out.printf("All sum = %.3f\n", bank.fellow.getSum());

        //Темы для повторения 4.1 в эл.жур 25 апреля

        Base obj = new Base("Red") {
            @Override
            void hello() {
                System.out.println("It is no identified class");
            }
        }
    }
}