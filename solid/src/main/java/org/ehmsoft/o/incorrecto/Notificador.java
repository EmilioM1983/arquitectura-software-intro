package org.ehmsoft.o.incorrecto;

/*
    Autor: Emilio Mayer
    Titulo: Abierto a expansión, cerrado a modificación
*/

class Notificador {

    //Metodos de clase
    public void enviarEmail(String mensaje){
        System.out.println("Enviando email: " + mensaje);
    }

    public void enviarWhatsApp(String mensaje){
        System.out.println("Enviando whatsapp: " + mensaje);
    }

    //Metodo que llama segun el tipo de plataforma a usar
    public void enviar(String tipo, String mensaje) {
        if(tipo.equals("email")) enviarEmail(mensaje);
        else if(tipo.equals("whatsapp")) enviarWhatsApp(mensaje);
    }


    //Metodo principal
    public static void main(String[] args) {
        //Explicacion lògica
    }
}

