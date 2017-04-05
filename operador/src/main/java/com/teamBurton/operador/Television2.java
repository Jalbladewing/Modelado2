package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Television2 extends Television2_ventana implements View{
	/*private Label _seccion;
	private Button _buscarCanalB;
	private TextField _buscarCanalT;
	private Button _contratarCanales;
	private List _canalesL;*/
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Paquete2> _paquete = new Vector<Paquete2>();
	public Contratar_generico _contrata;
	public Vector<Canal_television> _canal = new Vector<Canal_television>();
	public static final String VIEW_NAME = "television2";
	

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}