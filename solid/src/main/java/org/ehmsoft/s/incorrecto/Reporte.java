package org.ehmsoft.s.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Principio de responsabilidad única
    Cada clase hace una sola cosa.
    Más simple, más fácil de probar.”
*/

import java.time.LocalDate;
import java.util.List;

class Reporte {
    //Atributos de clase
    private String titulo;
    private LocalDate fecha;
    private List<String> nombres;

    //Metodos de clase
    public void generarPDF() {
        System.out.println("Generando pdf");
    }
    public void enviarEmail() {
        System.out.println("Enviando email");
    }


    //Funcion principal
    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        reporte.enviarEmail();
        reporte.generarPDF();
    }
}
