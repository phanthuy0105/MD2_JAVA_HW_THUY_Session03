package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số của mảng 1 chiều thứ nhất:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arrNumbers = new int[n];
        System.out.println("Nhập giá trị các phần tử trong mảng thứ nhất");

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            arrNumbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập vào số của mảng 1 chiều thứ hai:");
        int n2 = Integer.parseInt(scanner.nextLine());

        int[] arrNumbers2 = new int[n2];
        System.out.println("Nhập giá trị các phần tử trong mảng thứ hai");

        for (int i = 0; i < arrNumbers2.length; i++) {
            System.out.printf("numbers[%d]=", i);
            arrNumbers2[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Các phần tử trong mảng thứ nhất là:");
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("%6d", arrNumbers[i]);
        }
        System.out.printf("\n");

        System.out.println("Các phần tử trong mảng thứ hai là:");
        for (int i = 0; i < arrNumbers2.length; i++) {
            System.out.printf("%6d", arrNumbers2[i]);
        }
        System.out.printf("\n");

        int[] arr_newNumbers = new int[arrNumbers.length + arrNumbers2.length];

        for (int i = 0; i < arrNumbers.length; i++) {
            arr_newNumbers[i] = arrNumbers[i];
        }
        for (int i = 0; i < arrNumbers2.length; i++) {
            arr_newNumbers[i] = arrNumbers2[i];
        }

        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < (n + n2); i++) {
            System.out.print(arr_newNumbers[i] + "\t");
        }
    }
}
