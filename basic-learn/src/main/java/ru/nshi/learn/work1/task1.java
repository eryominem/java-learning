package ru.nshi.learn.work1;
import java.util.Scanner;
import java.security.spec.RSAOtherPrimeInfo;

/*Написать программу, которая определяет, является ли число «счастливым билетом».
 Осуществить проверку для шестизначных чисел. Число пользователь вводит с клавиатуры.
 */

public class task1 {

    public static void main(String[] args) {
        task1 task = new task1();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int number = in.nextInt();

        if (task.lucky(number) == true){
            System.out.print("Число является счастливым!");
        } else
            System.out.println("Число не является счастливым.");
    }

    public boolean lucky(int number) {
        int left = 0; int right = 0;
        boolean flag = false;

        for (int i = 0; i < 3; i++){
            right += number % 10;
            number /= 10;
        }

        for (int i = 0; i < 3; i++){
            left += number % 10;
            number /= 10;
        }

        if (left == right){
            flag = true;

        } else
            flag = false;

        return flag;
    }
}
