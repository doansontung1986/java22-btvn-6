package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinhVien[] mangSinhVien = inputStudentList();
        String strChoice;
        int choice = -1;
        boolean notExited = true;

        do {
            displayMenu();
            do {
                System.out.print("Lựa chọn của bạn: ");
                strChoice = input.next();
                if (!isValidNumber(strChoice)) {
                    System.out.println("Vui lòng nhập giá trị số từ 1 đến 3");
                    continue;
                }
                choice = Integer.parseInt(strChoice);
            } while (!isValidNumber(strChoice));

            switch (choice) {
                case 1:
                    displayStudentList(mangSinhVien);
                    break;
                case 2:
                    SinhVien[] sortedStudentList = sortStudentList(mangSinhVien);
                    displayStudentList(sortedStudentList);
                    break;
                case 3:
                    System.out.print("Nhập thông tin lớp: ");
                    String lop = new Scanner(System.in).nextLine();
                    SinhVien[] filteredArray = filteredByClass(mangSinhVien, lop);
                    displayStudentList(filteredArray);
                    break;
                case 4:
                    notExited = false;
                    System.out.println("Hẹn gặp lại");
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (notExited);
    }

    public static SinhVien[] filteredByClass(SinhVien[] mangSinhVien, String lop) {
        SinhVien[] filteredArray = new SinhVien[mangSinhVien.length];

        for (int i = 0; i < mangSinhVien.length; i++) {
            if (mangSinhVien[i].lop.equals(lop)) {
                filteredArray[i] = mangSinhVien[i];
            }
        }

        return filteredArray;
    }

    public static SinhVien[] sortStudentList(SinhVien[] mangSinhVien) {
        SinhVien[] sortedArray = Arrays.copyOf(mangSinhVien, mangSinhVien.length);

        for (int i = 0; i < sortedArray.length - 1; i++) {
            boolean isSwap = false;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i].tenSinhVien.compareToIgnoreCase(sortedArray[i + 1].tenSinhVien) > 0) {
                    swapElement(sortedArray, i, j);
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }

        return sortedArray;
    }

    public static void swapElement(SinhVien[] mangSinhVien, int i, int j) {
        SinhVien temp = mangSinhVien[i];
        mangSinhVien[i] = mangSinhVien[j];
        mangSinhVien[j] = temp;
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
        System.out.printf("%-12s | %-20s | %-4s | %-8s\n", "Mã sinh viên", "Tên sinh viên", "Lớp", "Khoa");
        System.out.println("---------------------------------------");
        for (int i = 0; i < mangSinhVien.length; i++) {
            if (mangSinhVien[i] != null) {
                mangSinhVien[i].displayStudentInfo();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("-------------------------------------------");
        System.out.printf("%-30s", "| 1. In toàn bộ danh sách ra màn hình     |\n");
        System.out.printf("%-30s", "| 2. Sắp xếp danh sách theo tên sinh viên |\n");
        System.out.printf("%-30s", "| 3. In danh sách sinh viên theo lớp      |\n");
        System.out.printf("%-30s", "| 4. Thoát chương trình                   |");
        System.out.println();
        System.out.println("-------------------------------------------");
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
