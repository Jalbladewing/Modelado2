package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.Administrador;
import bd.BD_Principal;
import bd.Modalidad;
import bd.ModalidadDAO;
import bd.Movil;
import bd.MovilDAO;
import bdgui.IAdministrador;


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
	private IAdministrador administrador = new BD_Principal();
	
	public Crear_modalidad_administrador()
	{
		tipoComboBx.setNullSelectionAllowed(false);
		tipoComboBx.removeAllItems();
		tipoComboBx.addItems("movil", "television", "telefonoFijo", "internet", "oferta");
		_ofertaTelevision = new Crear_modalidad_oferta_television();
		ofertasLayout.addComponent(_ofertaTelevision);
		
		tipoComboBx.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				
				if(tipoComboBx.getValue().equals("television")  || tipoComboBx.getValue().equals("oferta"))
				{
					ofertasLayout.setVisible(true);
					vLayoutDatos.setVisible(false);
					
				}else
				{
					ofertasLayout.setVisible(false);
					
					if(tipoComboBx.getValue().equals("movil"))
					{
						vLayoutDatos.setVisible(true);
					}else
					{
						vLayoutDatos.setVisible(false);
					}
				}
			}
		});
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(tipoComboBx.getValue() != null && !nombreF.getValue().replaceAll("\\s+","").isEmpty() && !precioF.getValue().replaceAll("\\s+","").isEmpty())
				{
					if(tipoComboBx.getValue().equals("movil") && !consumoMaxF.getValue().replaceAll("\\s+","").isEmpty())
					{
						crear_modalidad();
						doNavigate(Gestion_modalidades.VIEW_NAME);
					}
					
				}
				
			}
		});
	}
	
	public void crear_modalidad()
	{
		
		if(tipoComboBx.getValue().equals("television"))
		{
			
		}else if(tipoComboBx.getValue().equals("oferta"))
		{
			
		}else if(tipoComboBx.getValue().equals("movil"))
		{
			Movil modalidad = MovilDAO.createMovil();
			modalidad.setNombre(nombreF.getValue());
			modalidad.setCaracteristicas(caracteristicasArea.getValue());
			modalidad.setPrecio(Integer.parseInt(precioF.getValue()));
			modalidad.setVisibilidad(checkBx.getValue());
			modalidad.setTipo(tipoComboBx.getValue().toString());
			modalidad.setConsumoActual(0.0);
			modalidad.setConsumoMax(Integer.parseInt(consumoMaxF.getValue()));
			
			administrador.crear_modalidad(modalidad);
			
		}else
		{
			Modalidad modalidad = ModalidadDAO.createModalidad();
			modalidad.setNombre(nombreF.getValue());
			modalidad.setCaracteristicas(caracteristicasArea.getValue());
			modalidad.setPrecio(Integer.parseInt(precioF.getValue()));
			modalidad.setVisibilidad(checkBx.getValue());
			modalidad.setTipo(tipoComboBx.getValue().toString());
			
			administrador.crear_modalidad(modalidad);
		}
		
		
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}