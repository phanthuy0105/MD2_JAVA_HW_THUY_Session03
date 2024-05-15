package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số của mảng 1 chiều:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arrNumbers = new int[n];
        System.out.println("Nhập giá trị các phần tử trong mảng");

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            arrNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("%6d", arrNumbers[i]);
        }
        System.out.printf("\n");

        System.out.println("Nhập số cần thêm: ");
        int j = Integer.parseInt(scanner.nextLine());

        int[] arr_newNumbers = new int[arrNumbers.length + 1];

        for (int i = 0, k = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] != j) {
                arr_newNumbers[k] = arrNumbers[i];
                k++;
            }
        }

        arr_newNumbers[arr_newNumbers.length - 1] = j;

        System.out.println("Mảng sau khi thêm phần tử " + j + " là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d\t", arr_newNumbers[i]);
        }
    }
}
