package Packages;

abstract public class ColoredFigure{
    public String color;
    public int size;

    public String getSizeName(){
        return "сторона";
    }

    abstract public String getName();
    abstract public double getArea();

    public void show(){
        System.out.println("Фигура: " + color + " " + getName());
        System.out.println("Характерный размер (" + getSizeName() + "): " + size);
        System.out.printf("Площадь %.3f\n", getArea());
        System.out.println("-----------------------------");
    }

    public ColoredFigure(String clr, int s){
        this.color = clr;
        this.size = s;
    }
}
