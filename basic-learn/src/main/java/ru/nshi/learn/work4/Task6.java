package ru.nshi.learn.work4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        String[] strArray = task6.returnStringArray();
        String result = task6.maxUniqueSymbolsInString(strArray);
        System.out.println(result);

    }

    public String[] returnStringArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arrayLength = in.nextInt();

        String[] strArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.printf("Заполните элемент массива №%d: ", i+1);
            strArray[i] = in.next();
        }
        return strArray;
    }


    public String maxUniqueSymbolsInString(String[] str){
        Task5 task5 = new Task5();
        String result = "";
        String[] arrayUnique = new String[str.length];

        for (int i = 0; i < arrayUnique.length; i++) {
            arrayUnique[i] = task5.uniqueSymbols(str[i]);
        }

        for (int i = 1; i < arrayUnique.length; i++){
            if (arrayUnique[i].length() > arrayUnique[i-1].length()){
                result = str[i];
            } else{
                result = str[i-1];
            }
        }
    return result;
    }
}
