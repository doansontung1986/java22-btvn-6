package bai7;

import java.util.Scanner;

public class SinhVien {
    public static int autoId;
    public int maSinhVien;
    public String ten;
    public String queQuan;
    public String gioiTinh;
    public double diemTrungBinh;
    public String khoa;

    public SinhVien() {
        this.maSinhVien = ++autoId;
    }

    public void inputStudentInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        ten = sc.nextLine();

        System.out.print("Nhập quê quán: ");
        queQuan = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = sc.nextDouble();

        System.out.print("Nhập khoa: ");
        sc.nextLine();
        khoa = sc.nextLine();
    }

    public void displayStudentInfo() {
        System.out.printf("%-12s | %-16s | %-12s | %-8s | %-20s | %-8s |\n", this.maSinhVien, this.ten, this.queQuan, this.gioiTinh, this.diemTrungBinh, this.khoa);
    }
}
