package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Modalidades_destacadas_administrador extends Modalidades_destacadas_administrador_ventana implements View {
	public Administrador2 _unnamed_Administrador2_;
	public Vector<Modalidad_individual_administrador> _modalidad = new Vector<Modalidad_individual_administrador>();
	public Vector<Modalidad_ofertas_administrador> _oferta = new Vector<Modalidad_ofertas_administrador>();
	public static final String VIEW_NAME = "modalidades_destacadas_administrador";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}