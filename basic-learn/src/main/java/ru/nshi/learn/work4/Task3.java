package ru.nshi.learn.work4;

public class Task3 {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task3 task3 = new Task3();
        String str = task1.inputString();

        int count = task3.countNumbersInArray(str);
        char[] result = task3.numbersArray(str, count);
        task3.printCharArray(result);

    }

    public int countNumbersInArray(String str) {
        char[] chr = str.toCharArray();
        int countNumbers = 0;

        for (int i = 0; i < chr.length; i++) {
            if (Character.isDigit(chr[i])) {
                countNumbers++;
            }
        }
        return countNumbers;
    }

    public char[] numbersArray(String str, int countNumbers){
        char[] result = new char[countNumbers];
        char[] chr = str.toCharArray();
        int index = 0;

        for (int i = 0; i < chr.length && index < countNumbers; i++) {
            if (Character.isDigit(chr[i])) {
                result[index] = chr[i];
                index++;
            }
        }
        return result;
    }

    public void printCharArray(char[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
