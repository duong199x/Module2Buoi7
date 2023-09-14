package Resizeable;

public class Square extends Shape implements Resizeable {
    private double width = 1.0;

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    @Override
    public void resize(double percent) {
        width = width + width * percent / 100;
    }
}
