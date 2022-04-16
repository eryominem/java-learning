package ru.nshi.learn.work4;

public class Task5 {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task5 task5 = new Task5();
        String str = task1.inputString();

        String result = task5.uniqueSymbols(str);
        System.out.println(result);
    }

    public String uniqueSymbols(String str){
        StringBuilder builder = new StringBuilder("");
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++){
            if (builder.toString().contains(String.valueOf(strArray[i])) == false){
                builder.append(strArray[i]);
            }
        }
        String result = builder.toString();
        return result;
    }
}
