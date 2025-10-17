package org.ehmsoft.o.correcto;

/*
    Autor: Emilio Mayer
    Titulo: Abierto a expansión, cerrado a modificación
    Puedo agregar Telegram, Slack, etc sin tocar el código existente.
*/


public class EmailNotificador implements Notificador {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email para: " + mensaje);
    }
}
