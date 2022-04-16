package ru.nshi.learn.work4;

public class Task7 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task7 task7 = new Task7();

        String str = task1.inputString();
        String resultStr = task7.maxUniqueSymbolsTrim(str);
        System.out.println(resultStr);
    }
    public String maxUniqueSymbolsTrim(String str){
        Task1 task1 = new Task1();
        Task6 task6 = new Task6();
        String result = task6.maxUniqueSymbolsInString(str.trim().split("\\s+"));
        return result;
    }
}
