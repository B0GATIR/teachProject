@FunctionalInterface
interface MyInterface<A>{
    void echo(A smt);
}

class MyClass<A> implements MyInterface<A>{
    public void echo(A smt){
        System.out.println(smt);
    }
}

record Number(int num) {
//    @Override
//    public String toString() {
//        return Integer.toString(num);
//    }
}
public class Main {

    public static void main(String[] args) {
        Number num = new Number(1);
        MyInterface<Number> A = new MyClass<>();
        A.echo(num);
    }
}