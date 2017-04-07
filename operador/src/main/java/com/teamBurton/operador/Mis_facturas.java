package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Mis_facturas extends Mis_facturas_ventana implements View {
	/*private Label _seccion;
	private List _facturasL;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Factura_Lista> _factura = new Vector<Factura_Lista>();
	public static final String VIEW_NAME = "mis_facturas";
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}