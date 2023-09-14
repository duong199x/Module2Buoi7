public interface Flyable {
    static final int A = 10;// mặc định thuộc tính trong interface là static final

    String fly(); // các phương thức ở trong interface là abstract và public

    static void go() {
        System.out.println("helo");
    }

    default void run() {
        System.out.println("run");
    }
    // từ java8 có thể khai báo các phương thức có triển khai để với static hoặc default

}

interface Animalfly {
    String fly();
}

class Plane implements Flyable, Animalfly { // một class có thể triển khai nhiều interface

    @Override
    public String fly() {
        return "null";
    }

}

class Main2 {
    public static void main(String[] args) {
        //không thể khởi tạo dối tượng từ interface
        Plane plane = new Plane(); //interface định nghĩa thêm kiểu dữ liệu mới
        plane.fly();
    }
}
