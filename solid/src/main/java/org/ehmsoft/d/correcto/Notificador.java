package org.ehmsoft.d.correcto;

/*
    Autor: Emilio Mayer
    Titulo: Inversión de dependencia

    PedidoService no depende de ninguna clase concreta.
    Puedo agregar más notificadores sin tocar el servicio.
    Código más extensible y testeable.
*/

// Abstracción
interface Notificador {
    void enviar(String mensaje);
}

// Implementaciones concretas
class EmailNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}

class WhatsAppNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}

// Módulo de alto nivel depende de la abstracción, no de la implementación
class PedidoService {
    private final Notificador notificador;

    public PedidoService(Notificador notificador) {
        this.notificador = notificador;
    }

    void procesarPedido() {
        System.out.println("Procesando pedido...");
        notificador.enviar("Pedido confirmado");
    }
}



