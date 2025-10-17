package org.ehmsoft.Despues;

/*
Ahora el código se lee como una historia:
Calcular total → sumar precios → aplicar descuento → mostrar total.
Cada método tiene una única responsabilidad.
*/

public class CarritoService {

    public double calcularTotal(double[] precios, double descuento) {
        double subtotal = sumarPrecios(precios);
        double totalConDescuento = aplicarDescuento(subtotal, descuento);
        mostrarTotal(totalConDescuento);
        return totalConDescuento;
    }

    private double sumarPrecios(double[] precios) {
        double total = 0;
        for (double p : precios) {
            total += p;
        }
        return total;
    }

    private double aplicarDescuento(double subtotal, double descuento) {
        return descuento > 0 ? subtotal - (subtotal * descuento / 100) : subtotal;
    }

    private void mostrarTotal(double total) {
        System.out.println("El total del carrito es: " + total);
    }
}

