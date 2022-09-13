//import javax.swing.JOptionPane;
//import java.nio.charset.Charset;
//import java.util.*;
//import Packages.ColoredFigure;

class MyClass{
    private int num;

    void show(){
        System.out.println(num + " - field num from MyClass");
    }

    void set(){
        this.num = 0;
    }

    void set(int num){
        this.num = num;
    }

    MyClass(int num){
        this.num = num;
    }
}

@FunctionalInterface
interface MyInterfaceA{
    void set(int num);
}

@FunctionalInterface
interface MyInterfaceB{
    void set();
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(1);
        MyInterfaceA refA = obj::set;
        MyInterfaceB refB = obj::set;

        refA.set(100);
        obj.show();

        refB.set();
        obj.show();
    }
}