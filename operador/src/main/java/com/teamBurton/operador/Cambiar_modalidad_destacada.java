package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Cambiar_modalidad_destacada extends Cambiar_modalidad_destacada_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private List _modalidadesL;*/
	public Modalidad_individual_administrador _unnamed_Modalidad_individual_administrador_;
	public Modalidad_ofertas_administrador _unnamed_Modalidad_ofertas_administrador_;
	public Vector<Modalidad_lista_cambiar_modalidad> _modalidad = new Vector<Modalidad_lista_cambiar_modalidad>();
	public static final String VIEW_NAME = "cambiar_modalidad_destacada";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}