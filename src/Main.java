//import javax.swing.JOptionPane;
//import java.nio.charset.Charset;
//import java.util.*;
//import Packages.ColoredFigure;

class Alpha{
    private final String name;

    Alpha(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bravo extends Alpha{
    Bravo(String name){
        super(name);
    }
}

class Charlie extends Bravo{
    Charlie(String name){
        super(name);
    }
}

class Delta extends Charlie{
    Delta(String name){
        super(name);
    }
}

class Echo extends Delta{
    Echo(String name){
        super(name);
    }
}

class MyClass<T>{
    private final T obj;

    @Override
    public String toString() {
        return obj.toString();
    }

    MyClass(T obj){
        this.obj = obj;
    }
}

public class Main {
    static void showDown(MyClass<? extends Charlie> obj){
        System.out.println(obj);
    }

    static void showUp(MyClass<? super Charlie> obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        MyClass<Alpha> A = new MyClass<>(new Alpha("Object A"));
        MyClass<Bravo> B = new MyClass<>(new Bravo("Object B"));
        MyClass<Charlie> C = new MyClass<>(new Charlie("Object C"));
        MyClass<Delta> D = new MyClass<>(new Delta("Object D"));
        MyClass<Echo> E = new MyClass<>(new Echo("Object E"));

        showUp(A);
        showUp(B);
        showUp(C);

        showDown(C);
        showDown(D);
        showDown(E);
    }
}