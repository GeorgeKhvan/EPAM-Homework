package com.epam.startapp;

import java.util.Scanner;

public class CrudFunktion {
    Scanner sc = new Scanner(System.in);

    public String[] createNote(int n) {

        String[] note = new String[n];
        for (int i = 0; i < n; i++) {
            note[i] = "";
        }
        return note;
    }

    public String[] addNote(String[] massive) {

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

    public String[] deleteValue(String[] oldmassive, int number) {
        int length = oldmassive.length;
        for (int i = 0; i < length; i++) {
            if (oldmassive[i] == oldmassive[number]) {
                String[] newMassive = new String[length - 1];
                System.arraycopy(oldmassive, 0, newMassive, 0, i);
                System.arraycopy(oldmassive, i + 1, newMassive, i, newMassive.length - i - 1);
                return newMassive;
            }
        }
        System.out.print("Entered values are: ");
        for (int j = 0; j < oldmassive.length; j++)
            System.out.print(oldmassive[j] + " ");
        System.out.println(" ");
        return oldmassive;

    }

}

