package ru.nshi.learn.work3;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args){
        Task4 task4 = new Task4();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix(3);
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);

        System.out.println();

        int[] buffArray = task4.matrixConvertToArray(array);

        task4.selectionSort(buffArray);

        int[][] sortArray = task4.convertArrayToMatrix(buffArray, array);
        task1.printMatrix(sortArray);
    }

    public int[] matrixConvertToArray(int[][] array){
        int[] buffArray = new int[array[0].length * array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                buffArray[index] = array[i][j];
                index++;
            }
        }
        return buffArray;
    }

    public int[] selectionSort(int[] buffArray){
        for (int i = 0; i < buffArray.length; i++){
            int min = buffArray[i];
            int minIndex = i;
            for (int j = i+1; j < buffArray.length; j++){
                if (buffArray[j] < min){
                    min = buffArray[j];
                    minIndex = j;
                }
            }
            int buff = buffArray[i];
            buffArray[i] = min;
            buffArray[minIndex] = buff;
        }
        return buffArray;
    }

    public int[][] convertArrayToMatrix(int[] buffArray, int[][] array ){
        int[][] sortArray =  new int[array[0].length][array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sortArray[i][j] = buffArray[index];
                index++;
            }
        }
        return sortArray;
    }
}