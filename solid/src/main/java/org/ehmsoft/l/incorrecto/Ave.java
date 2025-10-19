package org.ehmsoft.l.incorrecto;
//Clase base
class Ave {
    void volar() {
        System.out.println("Volando...");
    }
}

//Clases hijas
class Pinguino extends Ave {
    @Override
    void volar() {
        throw new UnsupportedOperationException("El pingüino no puede volar");
    }
}

class Gorrion extends Ave{

}



