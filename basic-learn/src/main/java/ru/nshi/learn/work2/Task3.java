package ru.nshi.learn.work2;

//ЗАДАНИЕ 3: Осуществить проверку двумерного массива на "магический квадрат".

public class Task3 {
    public static void main(String[] args){
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix();
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);

        System.out.println();
        System.out.println("Сумма элементов главной диагонали = " + task3.sumMainDiagonal(array));
        System.out.println("Сумма элементов побочной диагонали = " + task3.sumCollateralDiagonal(array));
        task3.magicMatrix(task3.sumMainDiagonal(array), task3.sumCollateralDiagonal(array));
    }

    public int sumMainDiagonal (int[][] array){
        int sumMain = 0; int element = -1;
        for (int i = 0; i < array.length; i++){
            element++;
            for (int j = element; j < array[i].length;){
                sumMain += array[i][j];
                break;
            }
        }
        return sumMain;
    }

    public int sumCollateralDiagonal(int[][] array){
        int sumCollateral = 0; int element = array.length; ;
        for (int i = 0; i < array.length; i++){
            element--;
            for (int j = element; j >= 0; j--){
                sumCollateral += array[i][j];
                break;
            }
        }
        return sumCollateral;
    }

    public void magicMatrix(int sumMain, int SumCollateral){
        boolean flag = false;
        if (sumMain == SumCollateral){
            flag = true;
            System.out.println("Матрица является магической!");
        } else
            System.out.println("Матрица не является магической!");
    }
}
