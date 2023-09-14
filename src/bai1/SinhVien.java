package bai1;

import java.util.Scanner;

public class SinhVien {
    public String maSinhVien;
    public String tenSinhVien;
    public String lop;
    public String khoa;

    public void inputStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = sc.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        tenSinhVien = sc.nextLine();

        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();

        System.out.print("Nhập khoa: ");
        khoa = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSinhVien + "\n"
                + "Tên sinh viên: " + tenSinhVien + "\n"
                + "Lớp: " + lop + "\n"
                + "Khóa: " + khoa;

    }
}
