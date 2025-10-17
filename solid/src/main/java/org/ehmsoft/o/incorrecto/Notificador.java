package org.ehmsoft.o.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Abierto a expansión, cerrado a modificación
*/

class Notificador {

    public void enviarEmail(String mensaje){
        System.out.println("Enviando email para: " + mensaje);
    }

    public void enviarWhatsApp(String mensaje){
        System.out.println("Enviando whatsapp: " + mensaje);
    }

    public void enviar(String tipo, String mensaje) {
        if(tipo.equals("email")) enviarEmail(mensaje);
        else if(tipo.equals("whatsapp")) enviarWhatsApp(mensaje);
    }
}

