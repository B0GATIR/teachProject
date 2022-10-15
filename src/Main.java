import java.text.ParseException;
import java.util.*;
import static javax.swing.JOptionPane.*;

class MyNumber{
    public int number;

    MyNumber(int number){
        this.number = number;
    }
}

class MyThread extends Thread{
    private MyNumber obj;
    private int time;
    private int count;
    private boolean state;
    MyThread(String name, MyNumber obj, int time, int count, boolean state){
        super(name);
        this.obj = obj;
        this.time = time;
        this.count = count;
        this.state = state;
        start();
    }

    @Override
    public void run(){
        for (int i = 0; i < count; i++){
            synchronized (obj){
                System.out.println("--------------------------------------------");
                System.out.println(getName() + " has " + obj.number + " as value of field obj");
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e){
                    System.out.println(e);
                }
                if (state){
                    obj.number++;
                } else {
                    obj.number--;
                }
                System.out.println(getName() + " get new value for field obj: " + obj.number);
                System.out.println("--------------------------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyNumber n = new MyNumber(5);
        MyThread tA = new MyThread("Alpha", n, 1000, 200, true);
        MyThread tB = new MyThread("Bravo", n, 1000, 200, false);
        try {
            if (tA.isAlive()){
                tA.join();
            }
            if (tB.isAlive()){
                tB.join();
            }
        } catch (InterruptedException e){}
    }
}