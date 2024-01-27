package com.company;

import java.util.Scanner;

public class Main {

    public static void ifMoreThanSeven(int number){
        if(number > 7){
            System.out.println("Привет");
        } else {
            System.out.println("Введённое число меньше или равно семи");
        }
    }

    public static void ifNameIsVyacheslav(String name){
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void multiplesOfThree(int[] array){
        System.out.println("Элементы массива кратные трём:");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isQuit = false;

        while (!isQuit){
            System.out.println("\nВведите номер действия, которое хотите совершить:\n" +
                    "1 - Если число больше семи\n" +
                    "2 - Если имя Вячеслва\n" +
                    "3 - Элементы массива кратные трём\n" +
                    "0 - Завершить работу\n");

            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Введите число");
                    String number = sc.nextLine();
                    if(number.matches("\\d+")){
                        ifMoreThanSeven(Integer.parseInt(number));
                    } else {
                        System.out.println("Вы ввели не число");
                    }
                    break;
                case "2":
                    System.out.println("Введите имя");
                    ifNameIsVyacheslav(sc.nextLine());
                    break;
                case "3":
                    System.out.println("Введите длину массива");
                    String arrayLenght = sc.nextLine();
                    if(arrayLenght.matches("\\d+")){
                        int[] array = new int[Integer.parseInt(arrayLenght)];
                        System.out.println("Введите массив");
                        for (int i = 0;i < array.length;i++){
                            String arrayElement = sc.nextLine();
                            if(arrayElement.matches("\\d+")){
                                array[i] = Integer.parseInt(arrayElement);
                            } else {
                                array = null;
                                System.out.println("Вы ввели не число");
                                break;
                            }
                        }
                        if (array != null){
                            multiplesOfThree(array);
                        }
                    } else {
                        System.out.println("Вы ввели не число");
                    }
                    break;
                case "0":
                    isQuit = true;
                    break;
                default:
                    System.out.println("Такого варианта в меню нет");
                    break;
            }
        }
        sc.close();
    }
}
