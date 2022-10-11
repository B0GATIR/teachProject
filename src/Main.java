import java.text.ParseException;
import java.util.*;

//class MyThread implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++){
//            System.out.println("Second thread " + i);
//            try {
//                Thread.sleep(1200);
//            } catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}

//class MyThread extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++){
//            System.out.println("Second thread " + i);
//            try {
//                Thread.sleep(1200);
//            } catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++){
//                    System.out.println("Second thread " + i);
//                    try {
//                        Thread.sleep(1200);
//                    } catch (InterruptedException e){
//                        System.out.println(e.getMessage());
//                    }
//                }
//            }
//        });

//        Runnable r = ()->{
//            for (int i = 0; i < 5; i++){
//                System.out.println("Second thread " + i);
//                try {
//                    Thread.sleep(1200);
//                } catch (InterruptedException e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        };
//        Thread t = new Thread(r);

//        MyThread t = new MyThread();

        t.start();
        for (int i = 0; i < 5; i++){
            System.out.println("Main thread " + (char)('A' + i));
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        try {
            if (t.isAlive()){
                t.join();
            }
            System.out.println("It`s all");
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}