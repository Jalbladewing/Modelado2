package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Internet extends Internet_ventana implements View{
	//private Label _seccion;
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Modalidad_servicio> _modalidad = new Vector<Modalidad_servicio>();
	public static final String VIEW_NAME = "internet";
	
	public Internet(){
	    Modalidad_servicio ms = new Modalidad_servicio(); 
		modalidadesGrid.addComponent(ms);
		ms = new Modalidad_servicio(); 
	    modalidadesGrid.addComponent(ms);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}