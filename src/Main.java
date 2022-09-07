//import javax.swing.JOptionPane;
//import java.util.*;
//import Packages.ColoredFigure;

//class Base{
//    String name;
//
//    Base(String name){
//        this.name = name;
//    }
//    Base(Base obj){
//        this.name = obj.name;
//    }
//}
//
//class First extends Base{
//    int code;
//
//    public void show(){
//        System.out.println(name + " " + code);
//    }
//
//    First(String name, int code){
//        super(name);
//        this.code = code;
//    }
//    First(First obj){
//        super(obj);
//        code = obj.code;
//    }
//}

class Binomial{
    private int[] binoms;


    Binomial(int n){
        binoms = new int[n + 1];
        binoms[0] = 1;
        for (int i = 0; i <= n; i++){
            binoms[i] = binoms[i + 1] * (n - i + 1) / i;
        }
    }

    @Override
    public String toString() {
        String text = "| ";
        for (int i = 0; i < binoms.length; i++){
            text += binoms[i] + " ";
        }
        return text;
    }
}
public class Main {
    public static void main(String[] args) {
//        First A = new First("a", 1);
//        First B = new First(A);
//        A.code = 2;
//        A.name = "b";
//        B.show();
//        A.show();

        Binomial objA = new Binomial(10);
        Binomial objB = new Binomial(100);
        System.out.println(objA.toString());
        System.out.println(objB.toString());
    }
}