//import javax.swing.JOptionPane;
//import java.util.*;
import Packages.ColoredFigure;

//class Base{
//    int number;
//    String text;
//
//    Base(int number, String text){
//        this.number = number;
//        this.text = text;
//    }
//}
//
//interface Alpha{
//    default void printSome(int number, String text){
//        System.out.println(number + " " + text);
//    }
//}
//
//interface Bravo{
//    default int getSum(int number){
//        return number + 100;
//    }
//}
//
//class New extends Base implements Alpha, Bravo{
//    public void printSome(){
//        System.out.println(number + " " + text);
//    }
//    New(int number, String text){
//        super(number, text);
//    }
//}
class Base{
    String name;

    Base(String name){
        this.name = name;
    }
    Base(Base obj){
        this.name = obj.name;
    }
}

class First extends Base{
    int code;

    public void show(){
        System.out.println(name + " " + code);
    }

    First(String name, int code){
        super(name);
        this.code = code;
    }
    First(First obj){
        super(obj);
        code = obj.code;
    }
}
public class Main {
    public static void main(String[] args) {
        First A = new First("a", 1);
        First B = new First(A);
        A.code = 2;
        A.name = "b";
        B.show();
        A.show();
    }
}