package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = scanner.nextInt();
        float[] array = new float[length];
        InputArray(array);
        CheckErrors(array);
    }
    public static void InputArray(float[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextFloat();
        }
    }
    public static void CheckErrors(float[] arr){
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                t = 1;
            }
        }
        if(t==1){
            System.out.println("Ошибка: отрицательные элементы отсутствуют");
        }
    }
}
