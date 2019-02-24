package com.epam.startapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Base {
    public void sayHallo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! Please, enter your name!");
        String name = sc.nextLine();
        System.out.println(name + " !" + " Welcome to the HomeWork!");
        ArrayList arrayList = new ArrayList();
    }
}
