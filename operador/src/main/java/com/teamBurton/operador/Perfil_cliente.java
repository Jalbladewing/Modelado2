package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Perfil_cliente extends Perfil_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _tituloPerfil;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Datos_modificables> _datosModificables = new Vector<Datos_modificables>();
	public Vector<Datos_no_modificables> _datosNoModificables = new Vector<Datos_no_modificables>();
	public static final String VIEW_NAME = "perfil_cliente";
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}