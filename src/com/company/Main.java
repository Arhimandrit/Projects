package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] original = new int[5];

        System.out.println("Введи 5 цифр в диапазоне от 1 до 10");

            for (int i = 0; i < 5; i++) {
                original[i] = input.nextInt();
            }

        System.out.print("Оригинальный массив: ");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(original[i] + " ");
        }
        Arrays.sort(original);

        System.out.print("\nОтсортированный массив ");
        for (int i = 0; i < 5; i++) {
            System.out.print(original[i]+ " ");
        }


    }
}
