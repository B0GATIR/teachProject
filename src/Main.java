//import javax.swing.JOptionPane;
//import java.util.*;
import Packages.ColoredFigure;

//class Tringle extends ColoredFigure{
//    public String getName(){
//        return "треугольник";
//    }
//
//    public double getArea(){
//        double k = Math.sqrt(3)/4;
//        return size*size*k;
//    }
//
//    Tringle(String clr, int s){
//        super(clr, s);
//    }
//}
//
//interface TestInterface{
//    int number = 100;
//    default int getDefaultNumber(){
//        return this.number;
//    }
//    int getNumber(double num);
//    char getString(int sym);
//}
//
//interface AnotherTestInterface{
//    char symbol = 'A';
//    default int getDefaultNumber(){
//        return this.symbol;
//    }
//    int getSum(int a, int b);
//}
//
//class TestClass implements TestInterface, AnotherTestInterface{
//    @Override
//    public int getDefaultNumber(){
//        return this.symbol + this.number
//                + TestInterface.super.getDefaultNumber() + AnotherTestInterface.super.getDefaultNumber();
//    }
//    @Override
//    public int getNumber(double num) {
//        return (int)num;
//    }
//    @Override
//    public char getString(int sym){
//        return (char)('A' + sym);
//    }
//    @Override
//    public int getSum(int a, int b){
//        return a + b;
//    }
//}
//
//interface Alpha{
//    default int getSum(int a, int b){
//        return a + b;
//    }
//    String getString(char a, char b);
//}
//
//interface Bravo extends Alpha{
//    int getSum(int a, int b);
//    default String getString(char a, char b){
//        return a + " " + b;
//    }
//}
//abstract class Class implements Bravo{
//    public int a;
//    public int b;
//
//    Class(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//}
//
//class ClassB extends Class{
//    public int getSum(int a, int b){
//        return a - b;
//    }
//
//    ClassB(){
//        super(2, 1);
//    }
//}

class Base{
    int number;
    String text;

    Base(int number, String text){
        this.number = number;
        this.text = text;
    }
}

interface Alpha{
    default void printSome(int number, String text){
        System.out.println(number + " " + text);
    }
}

interface Bravo{
    default int getSum(int number){
        return number + 100;
    }
}

class New extends Base implements Alpha, Bravo{
    public void printSome(){
        System.out.println(number + " " + text);
    }
    New(int number, String text){
        super(number, text);
    }
}
public class Main {
    public static void main(String[] args) {
//        Tringle T = new Tringle("красный", 2);
//        T.show();
//        ColoredFigure F;
//        F = T;
//        F.show();

//        TestClass obj = new TestClass();
//        System.out.println(obj.getString(1));
//        System.out.println(obj.getNumber(2.3));
//        System.out.println(obj.getSum(1, 2));
//        System.out.println(/*TestClass.number*/ obj.getDefaultNumber() + " " + TestClass.symbol);

//        Class obj;
//        obj = new ClassB();
//        System.out.println(obj.getSum(obj.a, obj.b));
//        System.out.println(obj.getString('1', '2'));

        New obj = new New(1, "txt");
        System.out.println(obj.getSum(1));
        obj.printSome();
    }
}