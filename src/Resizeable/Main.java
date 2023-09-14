package Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(5, 2);
        shapes[2] = new Square(6);
        System.out.println("trước khi tăng");
        for (Shape item : shapes) {
            if (item instanceof Circle) {
                Circle cicle1 = (Circle) item;
                System.out.println(cicle1.getArea());
            }
            if (item instanceof Rectangle) {
                Rectangle rectangle1 = (Rectangle) item;
                System.out.println(rectangle1.getArea());
            }
            if (item instanceof Square) {
                Square square1 = (Square) item;
                System.out.println(square1.getArea());
            }
        }
        System.out.println("sau khi tăng");
        for (Shape item : shapes) {
            if (item instanceof Circle) {
                Circle cicle1 = (Circle) item;
                cicle1.resize(Math.random() * 100);
                System.out.println(cicle1.getArea());
            }
            if (item instanceof Rectangle) {
                Rectangle rectangle1 = (Rectangle) item;
                rectangle1.resize(Math.random() * 100);
                System.out.println(rectangle1.getArea());
            }
            if (item instanceof Square) {
                Square square1 = (Square) item;
                square1.resize(Math.random() * 100);
                System.out.println(square1.getArea());
            }

        }
    }
}
