package org.ehmsoft.antes;

/*
 * Hace demasiadas cosas (calcula, aplica descuento, imprime).
 * No hay nombres claros ni separación de responsabilidades.
 * Es difícil de probar en una unidad.
 */

public class CarritoService {

    public double calcularTotal(double[] precios, double descuento) {
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            total += precios[i];
        }

        if (descuento > 0) {
            total = total - (total * descuento / 100);
        }

        System.out.println("El total del carrito es: " + total);
        return total;
    }
}
