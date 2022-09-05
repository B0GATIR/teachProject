//import javax.swing.JOptionPane;
//import java.util.*;
import InputClass.*;
import static InputClass.InputClass.getSum; //Импортируем статический метод
class InputClassB extends InputClass{
    @Override //Аннотация об переопределении метода класса print()
    public void print(){
        super.print(); //Вызов метода print() суперкласса InputClass
        getSum(1, 2);
    }

    InputClassB(){
        super("text"); //Вызов конструктора суперкласса перед определением констурктора подкласса
    }
}
public class Main {
    public static void main(String[] args) {
        InputClassB obj = new InputClassB();
        obj.print();
        getSum(100, 100);
    }
}