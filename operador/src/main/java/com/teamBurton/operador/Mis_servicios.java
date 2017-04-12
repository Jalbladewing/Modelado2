package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;

public class Mis_servicios extends Mis_servicios_ventana implements View {
	//private Label _seccion;
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Servicio> _servicio = new Vector<Servicio>();
	public static final String VIEW_NAME = "mis_servicios";
	
	public Mis_servicios(){
		Servicio s = new Servicio();
		Button oferta = new Button("Llamadas baratas + 100MB");
		Button modalidad = new Button("Amigos gratis");
		oferta.addStyleName("link");
		modalidad.addStyleName("link");
		 s.vLayoutModalidadesB.addComponent(oferta);
		 s.vLayoutModalidadesB.addComponent(modalidad);
		 s.noServiciosL.setVisible(false);
		 serviciosGrid.addComponent(s);
		 
		 s = new Servicio();
		 s.tituloL.setValue("Televisión");
		 serviciosGrid.addComponent(s);
		 
		 s = new Servicio();
		 s.tituloL.setValue("Internet");
		 serviciosGrid.addComponent(s);
		
		 s = new Servicio();
		 s.tituloL.setValue("Móvil");
		 serviciosGrid.addComponent(s);
		
		
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}