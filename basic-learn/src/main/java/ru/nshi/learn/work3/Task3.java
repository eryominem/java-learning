package ru.nshi.learn.work3;

//ЗАДАНИЕ 3: Осуществить проверку двумерного массива на "магический квадрат".

import ru.nshi.learn.work1.task1;

public class Task3 {
    public static void main(String[] args){
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix(5);
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);

        System.out.println();
        System.out.println("Сумма элементов главной диагонали = " + task3.sumMainDiagonal(array));
        System.out.println("Сумма элементов побочной диагонали = " + task3.sumCollateralDiagonal(array));

        if (task3.magicMatrix(array) == true){
            System.out.println("Матрица является магической");
        }
        else{
            System.out.println("Матрица не является магической");
        }

        //task3.magicMatrix(task3.sumMainDiagonal(array), task3.sumCollateralDiagonal(array));
    }

    public int sumMainDiagonal (int[][] array){
        int sumMain = 0; int element = -1;
        for (int i = 0; i < array.length; i++){
            element++;
            sumMain += array[i][element];
        }
        return sumMain;
    }

    public int sumCollateralDiagonal(int[][] array){
        int sumCollateral = 0; int element = array.length;
        for (int i = 0; i < array.length; i++){
            element--;
            sumCollateral += array[i][element];
        }
        return sumCollateral;
    }

    public int[] allSumValue(int[][] array){ //ВСЕ СУММЫ В ОДНОМ МАССИВЕ ДЛЯ ДАЛЬНЕЙШЕЙ ПРОВЕРКИ НА МАГ.МАТРИЦУ
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        int[] sumInArray = new int[array.length + array[0].length];
        int[] sumRows = task1.sumLinesArray(array);
        int[] sumColumns = task2.sumColumnsArray(array);

        int element = 0;
        for (int i = 0; i < sumRows.length; i++){
            sumInArray[element] = sumRows[i];
            element++;
        }

        for (int i = 0; i < sumColumns.length; i++){
            sumInArray[element] = sumRows[i];
            element++;
        }
        return sumInArray;
    }

    public boolean magicMatrix(int[][] array){
        Task3 task3 = new Task3();
        boolean flag = true;
        int[] sumInArray = allSumValue(array);
        if (task3.sumMainDiagonal(array) != task3.sumCollateralDiagonal(array))
            flag = false;

        if (flag != false) {
            for (int i = 0; i < sumInArray.length; i++) {
                for (int j = 0; j < sumInArray.length; j++) {
                    if (sumInArray[i] != sumInArray[j])
                        flag = false;
                }
            }
        }
        return flag;
    }
}