package com.teamBurton.operador;

public interface Gestor_correo {
	
	public Boolean enviar_correo_recuperacion(String email, String password);
	
	public boolean enviar_correo_registro_password(String email, String password);
}