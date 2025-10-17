package org.ehmsoft.s.correcto;

import org.ehmsoft.s.correcto.entities.EnviadorDeEmail;
import org.ehmsoft.s.correcto.entities.GeneradorDeReporte;

/*
    Autor: Emilio Mayer
    Titulo: Principio de responsabilidad única
    Cada clase hace una sola cosa.
    Más simple, más fácil de probar.”
*/

public class Reporte {

    public static void main(String[] args) {
        //Generar pdf
        GeneradorDeReporte generadorDeReporte = new GeneradorDeReporte();
        generadorDeReporte.generarPDF();

        //Enviar mail
        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        enviadorDeEmail.enviarEmail();
    }
}
