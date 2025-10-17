package org.ehmsoft.s.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Principio de responsabilidad única
    Cada clase hace una sola cosa.
    Más simple, más fácil de probar.”
*/

class Reporte {
    void generarPDF() {
        System.out.println("Generando pdf");
    }
    void enviarEmail() {
        System.out.println("Enviando email");
    }

    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        reporte.enviarEmail();
        reporte.generarPDF();
    }
}
