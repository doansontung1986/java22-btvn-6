package bai3;

public class Bai3Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.inputRectangleInfo();
        System.out.println("----------------");
        System.out.println(rectangle);
        System.out.println("----------------");
        System.out.printf("Chu vi hình chữ nhật: %.2f\n", rectangle.findPerimeter());
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", rectangle.findArea());
    }
}
