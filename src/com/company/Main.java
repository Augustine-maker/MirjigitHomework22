package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя - ");
        Scanner name =new Scanner(System.in);
        String string = name.nextLine();

        System.out.println("Введите ваш возраст - ");
        Scanner age = new Scanner(System.in);
        String string1 = age.nextLine();

        System.out.println("Введите в градусах погоду на улице - ");
        Scanner weather = new Scanner(System.in);


        System.out.println(name.next() + age.next() + weather.next());

    }
}
