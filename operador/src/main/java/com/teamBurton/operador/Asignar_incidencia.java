package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Asignar_incidencia extends Asignar_incidencia_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;s*/
	public Gestion_incidencias_administrador _unnamed_Gestion_incidencias_administrador_;
	public Vector<Comercial_asignar_incidencia> _comercial = new Vector<Comercial_asignar_incidencia>();
	public Confirmacion_asignar_incidencia_comercial _confirmacion;
	public static final String VIEW_NAME = "asignar_incidencia";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}