package org.ehmsoft.l.correcto;

public class Main {
    public static void main(String[] args) {
        AveVoladora gorrion = new Gorrion();
        gorrion.volar();

        Ave pinguino = new Pinguino();
        pinguino.comer();
    }
}
