package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;


public class Crear_modalidad_administrador extends Crear_modalidad_administrador_ventana implements View {
	/*private Label _seccion;
	private Label _titulo;
	private ComboBox _tipoServicio;
	private Label _nombreTitulo;
	private TextField _nombreValor;
	private Label _caracteristicasTitulo;
	private TextArea _caracteristicasValor;
	private Label _precioTitulo;
	private TextField _precioValor;
	private CheckBox _visibilidad;
	private Button _cancelar;
	private Button _confirmar;*/
	public Gestion_modalidades _unnamed_Gestion_modalidades_;
	public Crear_Modalidad_individual _individual;
	public Crear_modalidad_oferta_television _ofertaTelevision;
	public static final String VIEW_NAME = "crear_modalidad_administrador";
	
	public Crear_modalidad_administrador()
	{
		tipoComboBx.setNullSelectionAllowed(false);
		ofertasLayout.addComponent(new Crear_modalidad_oferta_television());
		
		tipoComboBx.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				// TODO Auto-generated method stub
				if(tipoComboBx.getValue().equals("Individual"))
				{
					ofertasLayout.setVisible(false);
				}else if(tipoComboBx.getValue().equals("Oferta"))
				{
					ofertasLayout.setVisible(true);
				}
			}
		});
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}