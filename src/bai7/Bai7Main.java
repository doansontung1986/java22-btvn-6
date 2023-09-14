package bai7;

import java.util.Scanner;

public class Bai7Main {
    public static void main(String[] args) {
        SinhVien[] mangSinhVien = inputStudentList();
        sortArray(mangSinhVien);
        displayStudentList(mangSinhVien);
    }

    public static void sortArray(SinhVien[] mangSinhVien) {
        for (int i = 0; i < mangSinhVien.length - 1; i++) {
            for (int j = i + 1; j < mangSinhVien.length; j++) {
                if (mangSinhVien[i].maSinhVien < mangSinhVien[j].maSinhVien) {
                    swapElement(mangSinhVien, i, j);
                }
            }
        }
    }

    public static void swapElement(SinhVien[] mangSinhVien, int i, int j) {
        SinhVien temp = mangSinhVien[i];
        mangSinhVien[i] = mangSinhVien[j];
        mangSinhVien[j] = temp;
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
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
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
