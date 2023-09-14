package bai1;

import java.util.Scanner;

public class Bai1Main {
    public static void main(String[] args) {
        SinhVien[] mangSinhVien = inputStudentList();
        System.out.println("--------------------------");
        System.out.println("Thông tin sinh viên:");
        displayStudentList(mangSinhVien);
    }

    public static SinhVien[] inputStudentList() {
        System.out.print("Nhập số sinh viên: ");
        int n = new Scanner(System.in).nextInt();

        SinhVien[] mangSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
            mangSinhVien[i] = new SinhVien();
            mangSinhVien[i].inputStudentInfo();
        }

        return mangSinhVien;
    }

    public static void displayStudentList(SinhVien[] mangSinhVien) {
        for (int i = 0; i < mangSinhVien.length; i++) {
            System.out.println("-------------");
            System.out.println(mangSinhVien[i]);
            System.out.println("-------------");
        }

    }
}
