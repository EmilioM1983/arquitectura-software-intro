package org.ehmsoft.l.incorrecto;

class Ave {
    void volar() {
        System.out.println("Volando...");
    }
}

class Pinguino extends Ave {
    @Override
    void volar() {
        throw new UnsupportedOperationException("El pingüino no puede volar");
    }
}



