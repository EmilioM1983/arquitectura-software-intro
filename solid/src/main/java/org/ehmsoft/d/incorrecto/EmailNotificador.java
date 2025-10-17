package org.ehmsoft.d.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Inversión de dependencia
    Problema: PedidoService depende directamente de una clase concreta (EmailNotificador).
    Si mañana quiero enviar por WhatsApp, tengo que modificar PedidoService.
*/

class EmailNotificador {
    void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}

class PedidoService {
    private EmailNotificador notificador = new EmailNotificador();

    void procesarPedido() {
        System.out.println("Procesando pedido...");
        notificador.enviar("Pedido confirmado");
    }
}

