package bai3;

import java.util.Scanner;

public class Rectangle {

    public double width;
    public double height;
    public String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public void inputRectangleInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        this.width = input.nextDouble();

        System.out.print("Nhập chiều dài: ");
        this.height = input.nextDouble();

        System.out.print("Nhập màu: ");
        input.nextLine();
        this.color = input.nextLine();
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Width: : " + width + "\n" + "Height: " + height + "\n" + "Color: " + color;
    }
}
