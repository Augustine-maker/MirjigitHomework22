package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите ваше имя - ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int age = generateRandomAge(0, 107);

        int weather = 25;

        if (age >= 20 && age <= 45 && weather <= 30 && weather >= -20) {
            System.out.println(name + " ,Вам " + age + " гулять можно");
        } else if (age <= 20 && weather >= 0 && weather <= 28) {
            System.out.println(name + " ,Вам " + age + " гулять можно");
        } else if (age >= 45 && weather >= -10 && weather <= 25) {
            System.out.println(name + " ,Вам " + age + " гулять можно");
        } else {
            System.out.println(" Вам гулять нельзя");
        }
    }

    public static int generateRandomAge(int min, int max) {
        Random randomAge = new Random();
        return randomAge.nextInt(max - min + 1) + min;
    }
}
