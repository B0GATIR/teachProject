import java.awt.*;
import java.text.ParseException;
import java.util.*;

enum Size{Small, Medium, Large}

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Size size = Size.Medium;
//        switch (size) {
//            case Small -> System.out.println(Size.Small);
//            case Medium -> System.out.println(Size.Medium);
//            case Large -> System.out.println(Size.Large);
//            default -> System.out.println("IDK");
//        }

        int i = 1;
        LabelOne:
        while (true){
            Thread.sleep(10);
            System.out.print(i + " ");
            if(i % 200 == 0){
                System.out.println();
            }
            LabelTwo:
            while (true){
                i++;
                if (i % 5 == 0){
                    continue LabelOne;
                }
            }
        }
    }
}