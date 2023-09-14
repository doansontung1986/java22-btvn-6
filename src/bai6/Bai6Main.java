package bai6;

import java.util.Random;
import java.util.Scanner;

public class Bai6Main {
    public static void main(String[] args) {
        SinhVien[] mangSinhVien = inputStudentList();
        displayStudentList(mangSinhVien);
        System.out.println("Sửa thông tin 1 sinh viên ngẫu nhiên");
        editRandomStudent(mangSinhVien);
        displayStudentList(mangSinhVien);

        System.out.println("Xóa 1 sinh viên ngẫu nhiên");
        removeRandomStudent(mangSinhVien);
        displayStudentList(mangSinhVien);
    }

    public static void removeRandomStudent(SinhVien[] mangSinhVien) {
        int randomNumber = new Random().nextInt(mangSinhVien.length);
        mangSinhVien[randomNumber] = null;
    }

    public static void editRandomStudent(SinhVien[] mangSinhVien) {
        int randomNumber = new Random().nextInt(mangSinhVien.length);
        mangSinhVien[randomNumber].inputStudentInfo();
    }

    public static int inputNumberOfStudents() {
        int numberStudent = -1;
        String numberStr;

        do {
            System.out.print("Nhập số sinh viên: ");
            numberStr = new Scanner(System.in).nextLine();
            if (!isValidNumber(numberStr)) {
                System.out.println("Vui lòng nhập giá trị số");
                continue;
            }

            if (!(Integer.parseInt(numberStr) > 0 && Integer.parseInt(numberStr) <= 10)) {
                System.out.println("Vui lòng nhập giá trị số từ 1 đến 10");
                continue;
            }

            numberStudent = Integer.parseInt(numberStr);
        } while (!isValidNumber(numberStr) || !(Integer.parseInt(numberStr) > 0 && Integer.parseInt(numberStr) <= 10));

        return numberStudent;
    }

    public static SinhVien[] inputStudentList() {
        int n = inputNumberOfStudents();

        SinhVien[] mangSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
            mangSinhVien[i] = new SinhVien();
            mangSinhVien[i].inputStudentInfo();
        }

        return mangSinhVien;
    }

    public static void displayStudentList(SinhVien[] mangSinhVien) {
        System.out.printf("%-12s | %-16s | %-12s | %-8s | %-20s | %-8s |\n", "Mã sinh viên", "Tên sinh viên", "Quê quán", "Giới tính", "Điểm trung bình", "Khoa");
        System.out.println("---------------------------------------");
        for (int i = 0; i < mangSinhVien.length; i++) {
            if (mangSinhVien[i] != null) {
                mangSinhVien[i].displayStudentInfo();
            }
        }
    }

    private static boolean isValidNumber(String strNumber) {
        if (strNumber == null) {
            return false;
        }

        try {
            Double.parseDouble(strNumber);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
