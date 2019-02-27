package com.epam.startapp;

import java.util.Scanner;

public class CrudFunktion {
    Scanner sc = new Scanner(System.in);

    public String[] createNote() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne name of massive:");
        String data = sc.nextLine();
        System.out.println("Enter the size:");
        int quantity = sc.nextInt();
        System.out.println("Massive " + data + " will be created with size " + quantity);

        String[] note = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            note[i] = "";
        }
        return note;
    }

    public String[] fillNote(String[] massive) {

        System.out.println("Plese fill te massive with " + massive.length + " values");

        String[] newMassive = new String[massive.length];
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Type the String value");
            String value = sc.nextLine();
            if (value.isEmpty()) {
                System.out.println("Value can't be null");
            } else {
                newMassive[i] = value;
            }
        }
        System.out.print("Entered values are: ");
        for (int j = 0; j < newMassive.length; j++)
            System.out.print(newMassive[j] + " ");
        System.out.println(" ");
        return newMassive;

    }

    //This method do delete, change and add
    public String[] adcValue(String[] oldmassive) {
        System.out.println("If you want to delete value from massive press 1\n " +
                "If you want to add new value press 2\n " +
                "If you want to delete whole massive press 3");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("Input number of element");
            int elementNum = sc.nextInt();

            int length = oldmassive.length;
            for (int i = 0; i < length; i++) {
                if (oldmassive[i] == oldmassive[elementNum]) {
                    String[] newMassive = new String[length - 1];
                    System.arraycopy(oldmassive, 0, newMassive, 0, i);
                    System.arraycopy(oldmassive, i + 1, newMassive, i, newMassive.length - i - 1);
                    return newMassive;
                }
            }
            System.out.print("Values after delete are: ");
            for (int j = 0; j < oldmassive.length; j++)
                System.out.print(oldmassive[j] + " ");
            System.out.println(" ");
            return oldmassive;
        }

        System.out.print("Entered values are: ");
        for (int j = 0; j < oldmassive.length; j++)
            System.out.print(oldmassive[j] + " ");
        System.out.println(" ");
        return oldmassive;
    }
}

