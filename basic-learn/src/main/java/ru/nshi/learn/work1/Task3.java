package ru.nshi.learn.work1;
import java.util.Scanner;
//Написать программу, которая определяет, является ли число простым. Число пользователь вводит с клавиатуры.

public class Task3 {

    public static void main(String[] args){
        Task3 task3 = new Task3();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int number = in.nextInt();

        if(task3.simpleNumber(number) == true){
            System.out.println("Число является простым");
        } else
            System.out.println("Число не является простым");
    }

    public boolean simpleNumber(int number) {
        boolean flag = false;
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            flag = true;
        } else
            flag = false;

        return flag;
    }
}
