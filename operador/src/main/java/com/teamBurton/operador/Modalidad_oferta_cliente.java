package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_oferta_cliente extends Modalidad_oferta_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _nombre;
	private Label _precio;
	private Label _tituloFechaContratacion;
	private Label _valorFechaContratacion;
	private Button _baja;*/
	public Servicio _unnamed_Servicio_;
	public Vector<Modalidad_individual_generico> _modalidad = new Vector<Modalidad_individual_generico>();
	public Crear_incidencia _creaIncidencia;
	public static final String VIEW_NAME = "modalidad_oferta_cliente";

	public Modalidad_oferta_cliente(){
		
	     
	       Modalidad_individual_generico mi = new Modalidad_individual_generico();
	       mi.tituloL.setValue("Llamadas baratas");
	       hLayoutModalidades.addComponent(mi);
	       mi = new  Modalidad_individual_generico();
	       mi.tituloL.setValue("100MB");
	       hLayoutModalidades.addComponent(mi);
	       
	       bajaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Crear_incidencia.VIEW_NAME);
			}
		});
	      	       
	}
	
	public void darBaja() {
		throw new UnsupportedOperationException();
	}

	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			tituloL.setValue(event.getParameters());
		}
	}
}