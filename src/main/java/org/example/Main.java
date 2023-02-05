package org.example;

public class Main {
    public static void main(String[] args) {
        // Напишите пример перехвата и обработки исключения в блоке try-catch метода.

        int[] numbers = new int[5];

        try {
            numbers[2] = 10;
            System.out.println("Значение добавлено в массив");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне предела");
        } finally {
            System.out.println("Данный блок выполнился полностью");
        }


    }
}

