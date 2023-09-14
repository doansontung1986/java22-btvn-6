package bai4;

import java.util.Scanner;

public class Bai4Main {
    public static void main(String[] args) {
        MyPoint[] points = inputPointList();
        System.out.printf("Khoảng cách lớn nhất là: %.2f", findMaxDistance(points));
    }

    public static double findMaxDistance(MyPoint[] points) {
        double maxDistance = Double.MIN_VALUE;
        MyPoint pointA = null;
        MyPoint pointB = null;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].distance(points[j]) > maxDistance) {
                    maxDistance = points[i].distance(points[j]);
                    pointA = points[i];
                    pointB = points[j];
                }
            }
        }

        System.out.println("Hai điểm có khoảng cách lớn nhất là " + pointA + " và " + pointB);

        return maxDistance;
    }

    public static MyPoint[] inputPointList() {
        System.out.println("Nhập số điểm: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] points = new MyPoint[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Điểm thứ " + (i + 1));
            points[i] = new MyPoint();
            points[i].inputPoint();
        }

        return points;
    }
}
