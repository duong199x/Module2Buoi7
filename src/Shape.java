public abstract class Shape { // có thuộc tính và phương thức như lớp bình thường nhưng có thêm phương thức abstract
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea(); // phương thức abstract không triển khai cụ thể và chỉ ở mức khai báo

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    //khi 1 lớp kế thừa lớp acstract phải triển khai tất cảphuwuowng thức của abstract
    //không bắt buộc pải ghi đè các phwuong thức none abstract
}
//không sử dụng chung từ khóa final với abstract
class Main {
    public static void main(String[] args) {
        //lớp abstract không thể khởi tạo đối tượng
        Circle c = new Circle("đỏ", true, 5.6);
        c.getArea();
    }
}