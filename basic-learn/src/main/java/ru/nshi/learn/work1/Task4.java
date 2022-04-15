package ru.nshi.learn.work1;

public class Task4 {

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.summaSimpleNumbers());
    }

    public int summaSimpleNumbers() {
        Task3 task3 = new Task3();
        int summa = 0;
        for (int i = 1000; i <= 2000; i++) {
            if (task3.simpleNumber(i) == true) {
                summa += i;
            } else
                continue;
        }
        return summa;
    }
}