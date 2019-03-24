package com.epam.startapp;

public class NoteHome extends Note {


    public static void main(String[] args) {

        NoteBook crudFunktion = new NoteBook();
        base.sayHallo();
        Note[] myMassive = crudFunktion.getFirstMassive();
        Note[] newMassive = crudFunktion.fillNote(myMassive);

        crudFunktion.adcValue(newMassive);







    }
}
