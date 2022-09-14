//import javax.swing.JOptionPane;
//import java.nio.charset.Charset;
//import java.util.*;
//import Packages.ColoredFigure;

@FunctionalInterface
interface MyFunction{
    double f(double x);
}
public class Main {

    static MyFunction Devirative(MyFunction ref){
        double dx = 1e-5;
        return (double x) -> {return (ref.f(x + dx)- ref.f(x))/dx;};
    }
    public static void main(String[] args) {
        MyFunction A = Devirative((double x) -> {return x*(3 - x);});
        System.out.println(A.f(1));
    }
}