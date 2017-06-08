package com.teamBurton.operador;

public class Gestor_correos_prueba {

	public static void main(String args[]) {
		Gestor_Correos gestor = new Gestor_Correos();
		if (gestor.enviar_correo_recuperacion("abordesgimenez@gmail.com", "JimCarrey777")) {
			System.out.println("mensaje enviado con exito");
		}else{
			System.out.println("Fallo al enviar el mensaje");
		}
	}
}
