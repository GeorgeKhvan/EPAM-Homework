package com.epam.startapp;

public class NoteHome extends Base {


    public static void main(String[] args) {
        Base base = new Base();
        CrudFunktion crudFunktion = new CrudFunktion();
        base.sayHallo();
        String[] myMassive = crudFunktion.getFirstMassive();
        String[] newMassive = crudFunktion.fillNote(myMassive);

        crudFunktion.adcValue(newMassive);







    }
}
