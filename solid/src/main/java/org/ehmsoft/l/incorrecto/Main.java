package org.ehmsoft.l.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Principio de sustitucion de Liskov
*/


public class Main {
    public static void main(String[] args) {
        Ave ave = new Pinguino();
        ave.volar(); // Rompe la expectativa: Los pinguinos no pueden volar
    }
}
