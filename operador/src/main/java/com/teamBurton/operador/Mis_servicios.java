package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Mis_servicios extends Mis_servicios_ventana implements View {
	//private Label _seccion;
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Servicio> _servicio = new Vector<Servicio>();
	public static final String VIEW_NAME = "mis_servicios";
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}