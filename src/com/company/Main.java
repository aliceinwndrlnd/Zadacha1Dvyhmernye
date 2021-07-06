package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы) */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        Random rnd = new Random();
        for (int[] row : array) {
            for (int i = 0; i < array.length; i++) {
                row[i] = rnd.nextInt(50);
            }
        }
        for (int[] row : array) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        /*1)Поcчитать сумму четных элементов стоящих на главной диагонали.*/
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array.length; j++) {
                if (array[i][j] % 2 == 0)
                {
                    summ += array [i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов, стоящих на главной диагонали, равна: " + summ);

    }
}
