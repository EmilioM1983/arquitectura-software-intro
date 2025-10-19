package org.ehmsoft.s.correcto;

import org.ehmsoft.s.correcto.entities.EnviadorDeEmail;
import org.ehmsoft.s.correcto.entities.GeneradorDeReporte;

import java.time.LocalDate;
import java.util.List;

/*
    Autor: Emilio Mayer
    Titulo: Principio de responsabilidad única
    Cada clase hace una sola cosa.
    Más simple, más fácil de probar.”
*/

public class Reporte {
    //Atributos de clase
    private String titulo;
    private LocalDate fecha;
    private List<String> nombres;


    //Metodo principal
    public static void main(String[] args) {
        //Generar pdf
        GeneradorDeReporte generadorDeReporte = new GeneradorDeReporte();
        generadorDeReporte.generarPDF();

        //Enviar mail
        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        enviadorDeEmail.enviarEmail();
    }
}
