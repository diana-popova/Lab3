package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int length = scanner.nextInt();
            float[] array = new float[length];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextFloat();
            }

            int t = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    t = 1;
                }
            }
            if(t==1){
                System.out.println("Ошибка: отрицательные элементы отсутствуют");
            }
        }
    }


