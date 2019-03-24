package com.epam.startapp;

import java.util.Scanner;

public class NoteBook {
    Scanner sc = new Scanner(System.in);

    public Note[] createNote() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne name of massive:");
        String data = sc.nextLine();
        System.out.println("Enter the size:");
        int quantity = sc.nextInt();
        System.out.println("Massive " + data + " will be created with size " + quantity);

        Note[] note = new NoteBook[quantity];
        for (int i = 0; i < quantity; i++) {
            note[i] = new Note();
        }
        return note;
    }

    public Note[] getFirstMassive() {
        return createNote();
    }

    public Note[] fillNote(Note[] massive) {

        System.out.println("Plese fill te massive with " + massive.length + " values");

        Note[] newMassive = new Note[massive.length];

        for (int i = 0; i < massive.length; i++) {
            Note note1 = new Note();
            System.out.println("Input name");
            note1.name = sc.nextLine();
            System.out.println("Input phone");
            note1.phone = sc.nextLine();
            System.out.println("Input id");
            note1.id = sc.nextInt();

            newMassive[i] = note1;

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
//
//    //This method do delete, change and add
//    public String[] adcValue(String[] oldmassive) {
//        System.out.println("If you want to delete value from massive press 1\n " +
//                "If you want to add new value press 2\n " +
//                "If you want to delete whole massive press 3");
//        int choose = sc.nextInt();
//        if (choose == 1) {
//            System.out.println("Input number of element which you want to delete");
//            int elementNum = sc.nextInt();
//            for (int i = elementNum; i < oldmassive.length - 1; i++) {
//                oldmassive[i] = oldmassive[i + 1];
//                }
//            int[] newArr = new int[oldmassive.length - 1];
//            System.arraycopy(oldmassive, 0, newArr, 0, oldmassive.length - 1);
//            return oldmassive;
//            }
//
//        if (choose == 2) {
//            System.out.println("Input value of element which you want to add");
//            String newElement = sc.nextLine();
//
//            int length = oldmassive.length;
//            String[] note = new String[length + 1];
//            for (int i = 0; i < length + 1; i++) {
//                note[i - 1] = oldmassive[i];
//                note[i + 1] = newElement;
//            }
//            return note;
//        }
//        if (choose == 3) {
//            System.out.println("Massive will be deleted");
//
//            int length = oldmassive.length;
//            String[] note = new String[length];
//            for (int i = 0; i < length + 1; i++) {
//                note[i - 1] = "";
//            }
//            return note;
//        }
//        return oldmassive;
//    }
}


