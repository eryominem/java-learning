package ru.nshi.learn.work1;

/*Написать программу, которая вычисляет, сумму всех шестизначных «счастливых» чисел.*/

public class task2 {
    public static void main(String[] args){
        task2 task_2 = new task2();
        System.out.println(task_2.summaAllLuckyNumbers());
    }

    public int summaAllLuckyNumbers() {
        int summa = 0;
        task1 task = new task1();
        for (int i = 100000; i <= 999999; i++){
            if (task.lucky(i) == true){
                summa += i;
            } else
                continue;
        }
        return summa;
    }
}
