package org.ehmsoft.d.correcto;

public class Main {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        PedidoService servicio1 = new PedidoService(email);
        servicio1.procesarPedido();

        Notificador whatsapp = new WhatsAppNotificador();
        PedidoService servicio2 = new PedidoService(whatsapp);
        servicio2.procesarPedido();
    }
}
