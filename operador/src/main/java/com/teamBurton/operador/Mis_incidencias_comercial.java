package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Mis_incidencias_comercial extends Mis_incidencias_comercial_ventana implements View {
	/*private Button _buscar_B;
	private TextField _buscarL;
	private Label _seccion;*/
	public Mi_cuenta_comercial _unnamed_Mi_cuenta_comercial_;
	public Incidencias_todas_comercial _todas;
	public Incidencias_llamadas_comercial _llamadas;
	public Incidencias_pendientes_comercial _pendientes;
	public Incidencias_resueltas_comercial _resueltas;
	public static final String VIEW_NAME = "mis_incidencias_comercial";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}