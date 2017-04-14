package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Modalidades_eleccion extends Modalidades_eleccion_ventana implements View {
	/*private Object _buscarB_Button;
	private TextField _buscarT;
	private Label _seccion;
	private Button _cancelar;
	private List _modalidadesL;*/
	public Traspasar_usuarios_administrador _unnamed_Traspasar_usuarios_administrador_;
	public Vector<Modalidad_lista_eleccion> _modalidad = new Vector<Modalidad_lista_eleccion>();
	public static final String VIEW_NAME = "modalidades_eleccion";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}