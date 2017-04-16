package com.teamBurton.operador;

public class Confirmacion_asignar_incidencia_comercial extends Confirmacion_asignar_incidencia_comercial_ventana {
	public Asignar_incidencia _unnamed_Asignar_incidencia_;
	
	public Confirmacion_asignar_incidencia_comercial(String correo)
	{
		mensajeL.setValue("¿Seguro que desea asignarle la incidencia a " + correo + "?");
	}
}