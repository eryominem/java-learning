package ru.nshi.learn.work2;

//Задание 2: Вычислить сумму каждого столбца двумерного массива и записать результаты в одномерный массив.

public class Task2 {
    public static void main(String[] args){
        Task2 task2 = new Task2();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix();
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);
        System.out.println();

        int[] newArray = task2.sumColumnsArray(array);
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
            if (i+1 < array.length){
                System.out.print(", ");
            }
        }
    }

    public int[] sumColumnsArray(int[][] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int sum = 0;
            for (int j = 0; j < array[i].length; j++){
                sum += array[j][i];
            }
            newArray[i] = sum;
        }
        return newArray;
    }
}
