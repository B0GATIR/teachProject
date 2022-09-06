//import javax.swing.JOptionPane;
//import java.util.*;
import Packages.ColoredFigure;

class Tringle extends ColoredFigure{
    public String getName(){
        return "треугольник";
    }

    public double getArea(){
        double k = Math.sqrt(3)/4;
        return size*size*k;
    }

    Tringle(String clr, int s){
        super(clr, s);
    }
}

public class Main {
    public static void main(String[] args) {
        Tringle T = new Tringle("красный", 2);
        T.show();
        ColoredFigure F;
        F = T;
        F.show();
    }
}