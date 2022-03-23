package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size does not exceed 20");

        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }
        System.out.println("\n" + "Nhap X: ");
        int X = scanner.nextInt();
        int index = vitri(array, X);
        if (index == -1) {
            System.out.println("khoong thay");
        } else System.out.println("tim thay tai vi tri: " + index);

        for (i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }
        System.out.printf("sau khi xoa: ");
        for (int k=0;k<array.length-1;k++){
            System.out.printf(array[k] + "\t");
        }
    }

    static int vitri(int[] array, int X) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == X)
                return i;
        }
        return -1;
    }

    static int xoa(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return array.length - 1;

    }
}


