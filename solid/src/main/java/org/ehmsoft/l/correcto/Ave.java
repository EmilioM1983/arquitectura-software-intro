package org.ehmsoft.l.correcto;

/*
    Autor: Emilio Mayer
    Titulo: Principio de sustitucion de Liskov
    Cada clase cumple lo que promete y no rompe la jerarquía lógica
*/

interface Ave {
    void comer();
}

interface AveVoladora extends Ave {
    void volar();
}

class Gorrion implements AveVoladora {
    public void comer() { System.out.println("Picoteando semillas"); }
    public void volar() { System.out.println("Volando alto"); }
}

class Pinguino implements Ave {
    public void comer() { System.out.println("Comiendo peces"); }
}



