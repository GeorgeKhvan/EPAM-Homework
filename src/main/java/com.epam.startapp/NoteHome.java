package com.epam.startapp;

public class NoteHome extends Base {

    public static void main(String[] args) {
        Base base = new Base();
        CrudFunktion crudFunktion = new CrudFunktion();
        base.sayHallo();
        crudFunktion.fillNote(crudFunktion.createNote());

        String[] newMassive = crudFunktion.createNote();

        crudFunktion.adcValue(newMassive);







    }
}
