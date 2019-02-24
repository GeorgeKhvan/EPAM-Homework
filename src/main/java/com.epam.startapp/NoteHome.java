package com.epam.startapp;

import java.util.Scanner;

public class NoteHome {
    Base base = new Base();

    public static void main(String[] args) {
        Base base = new Base();
        CrudFunktion crudFunktion = new CrudFunktion();
        base.sayHallo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne name of massive:");
        String data = sc.nextLine();
        System.out.println("Enter the size:");
        int quantity = sc.nextInt();
        System.out.println("Massive " + data + " will be created with size " + quantity);

        crudFunktion.createNote(quantity);

        System.out.println("Plese fill te massive with " + quantity + " values");

        crudFunktion.addNote(crudFunktion.createNote(quantity));

        System.out.println("If you want to delete value from massive press 1\n " +
                "If you want to add new value press 2\n " +
                "If you want to delete whole massive press 3");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("Imput number of element");
            int elementNum = sc.nextInt();
            crudFunktion.deleteValue(crudFunktion.createNote(quantity), elementNum);
        }

    }
}
