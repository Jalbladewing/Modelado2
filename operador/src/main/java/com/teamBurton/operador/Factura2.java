package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Factura2 extends Factura2_ventana implements View {
	/*private Label _seccion;
	private Label _tituloFactura;
	private Label _tituloFecha;
	private Label _valorFecha;
	private Label _tituloNombre;
	private Label _valorNombre;
	private Label _tituloApellidos;
	private Label _valorApellidos;
	private Label _tituloNif;
	private Label _valorNif;
	private Label _tituloTelefono;
	private Label _valorTelefono;
	private Label _tituloDireccion;
	private Label _valorDireccion;
	private Label _tituloPrecioTotal;
	private Label _valorPrecioTotal;
	private Button _imprimir;
	private List _modalidadesContratadas;*/
	public Factura_Lista _unnamed_Factura_Lista_;
	public Vector<Modalidad_contratada> _modalidad = new Vector<Modalidad_contratada>();
	public static final String VIEW_NAME = "factura2";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			tituloL.setValue(event.getParameters());
		}
		
	}
}