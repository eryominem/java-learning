package ru.nshi.learn.work4;

public class Task4 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task4 task4 = new Task4();

        String str = task1.inputString();
        int sum = task4.sumNumbersInString(str);
        System.out.println(sum);

    }

    public int sumNumbersInString(String str){
        int sum = 0;
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++){
            if (Character.isDigit(strArray[i])){
                sum += strArray[i] - '0';
            }
        }
        return sum;
    }
}
