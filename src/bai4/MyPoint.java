package bai4;

import java.util.Scanner;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void inputPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        this.x = sc.nextDouble();
        System.out.print("Nhập y: ");
        this.y = sc.nextDouble();
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt(Math.pow((this.x - secondPoint.x), 2) + Math.pow((this.y = secondPoint.y), 2));
    }

    public double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y = p2.y), 2));
    }
}
