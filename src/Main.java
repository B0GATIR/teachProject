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

class Based<X>{
    private X sm;

    Based(X sm){
        set(sm);
    }

    void set(X sm){
        this.sm = sm;
    }

    X get(){
        return sm;
    }
}

class Alpha<X, Y>{
    Based<X> obj;
    Y second;

    Alpha(X first, Y second){
        obj = new Based<>(first);
        this.second = second;
    }

    void show(){
        System.out.println(obj.get() + " " + second);
    }
}
public class Main {
    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(8);
//        System.out.printf("All sum = %.3f\n", bank.fellow.getSum());

        //Темы для повторения 4.1 в эл.жур 25 апреля

        Alpha<Integer, Character> A = new Alpha<>(100, 'A');
        A.show();
    }
}