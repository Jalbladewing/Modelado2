package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.Administrador;
import bd.BD_Principal;
import bd.Canal;
import bd.CanalDAO;
import bd.Modalidad;
import bd.ModalidadDAO;
import bd.Movil;
import bd.MovilDAO;
import bd.Oferta;
import bd.OfertaDAO;
import bd.Paquete;
import bd.PaqueteDAO;
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
	private List<Modalidad> modalidades;
	private int idModalidad;
	private Modalidad modalidad;
	
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
					
					if(_ofertaTelevision.getTipo().equals("television") && tipoComboBx.getValue().equals("oferta") || _ofertaTelevision.getTipo().equals("oferta") && tipoComboBx.getValue().equals("television"))
					{
						_ofertaTelevision.clearModalidades();
					}
					
					_ofertaTelevision.setTipo((String) tipoComboBx.getValue());
					
				}else
				{
					_ofertaTelevision.clearModalidades();
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
				modalidades = _ofertaTelevision.getModalidades();
				
				if(tipoComboBx.getValue() != null && !nombreF.getValue().replaceAll("\\s+","").isEmpty() && !precioF.getValue().replaceAll("\\s+","").isEmpty())
				{
					if(tipoComboBx.getValue().equals("movil"))
					{
						if(!consumoMaxF.getValue().replaceAll("\\s+","").isEmpty())
						{
							crear_modalidad();
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}
						
						
					}else if(tipoComboBx.getValue().equals("oferta"))
					{
						if(modalidades.size() >= 2)
						{
							crear_modalidad();
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}
						
						
					}else if(tipoComboBx.getValue().equals("television"))
					{
						if(modalidades.size() != 1)
						{
							crear_modalidad();
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}
						
						
					}else
					{
						crear_modalidad();
						doNavigate(Gestion_modalidades.VIEW_NAME);
					}
					
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				doNavigate(Gestion_modalidades.VIEW_NAME);
				
			}
		});
		
		_ofertaTelevision.addB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				modalidad.setNombre(nombreF.getValue());
				modalidad.setCaracteristicas(caracteristicasArea.getValue());
				modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
				modalidad.setVisibilidad(checkBx.getValue());
				modalidad.setTipo(tipoComboBx.getValue().toString());
				
				((NavigatorUI) UI.getCurrent()).setGestionModalidad(modalidad);
				
				_ofertaTelevision.navigateTo();
				
			}
		});
	}
	
	public void crear_modalidad()
	{
		
		if(tipoComboBx.getValue().equals("television"))
		{
			if(modalidades.isEmpty())
			{
				Canal modalidad = CanalDAO.createCanal();
				modalidad.setNombre(nombreF.getValue());
				modalidad.setCaracteristicas(caracteristicasArea.getValue());
				modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
				modalidad.setVisibilidad(checkBx.getValue());
				modalidad.setTipo(tipoComboBx.getValue().toString());
				
				administrador.crear_modalidad(modalidad);
				
			}else
			{
				Paquete modalidad = PaqueteDAO.createPaquete();
				modalidad.setNombre(nombreF.getValue());
				modalidad.setCaracteristicas(caracteristicasArea.getValue());
				modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
				modalidad.setVisibilidad(checkBx.getValue());
				modalidad.setTipo(tipoComboBx.getValue().toString());
				
				for(int i = 0; i < modalidades.size(); i++)
				{
					modalidad.modalidad.add((Canal)modalidades.get(i));
				}
				
				administrador.crear_modalidad(modalidad);
			}
			
		}else if(tipoComboBx.getValue().equals("oferta"))
		{
			Oferta modalidad = OfertaDAO.createOferta();
			modalidad.setNombre(nombreF.getValue());
			modalidad.setCaracteristicas(caracteristicasArea.getValue());
			modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
			modalidad.setVisibilidad(checkBx.getValue());
			modalidad.setTipo(tipoComboBx.getValue().toString());
			
			for(int i = 0; i < modalidades.size(); i++)
			{
				modalidad.modalidad.add(modalidades.get(i));
			}
			
			administrador.crear_modalidad(modalidad);
			
			
		}else if(tipoComboBx.getValue().equals("movil"))
		{
			Movil modalidad = MovilDAO.createMovil();
			modalidad.setNombre(nombreF.getValue());
			modalidad.setCaracteristicas(caracteristicasArea.getValue());
			modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
			modalidad.setVisibilidad(checkBx.getValue());
			modalidad.setTipo(tipoComboBx.getValue().toString());
			modalidad.setConsumoActual(0.0);
			modalidad.setConsumoMax(Double.parseDouble(consumoMaxF.getValue()));
			
			administrador.crear_modalidad(modalidad);
			
		}else
		{
			Modalidad modalidad = ModalidadDAO.createModalidad();
			modalidad.setNombre(nombreF.getValue());
			modalidad.setCaracteristicas(caracteristicasArea.getValue());
			modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
			modalidad.setVisibilidad(checkBx.getValue());
			modalidad.setTipo(tipoComboBx.getValue().toString());
			
			administrador.crear_modalidad(modalidad);
		}
		
		
		
		
	}
	
	public void cargar_modalidad()
	{
		modalidades.add(administrador.cargar_modalidad(idModalidad));
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	@Override
	public void enter(ViewChangeEvent event) 
	{
		modalidades = new ArrayList<Modalidad>();
		modalidad = ModalidadDAO.createModalidad();
		
		if(!event.getParameters().isEmpty())
		{
			String[] ids = event.getParameters().split(";");
			modalidad = ((NavigatorUI) UI.getCurrent()).getGestionModalidad();
			
			leerModalidad();
			
			if(ids[0].equals("television"))
			{
				tipoComboBx.setValue("television");
			}else
			{
				tipoComboBx.setValue("oferta");
			}
			
			for(int i = 1; i < ids.length; i++)
			{
				idModalidad = Integer.parseInt(ids[i]);
				cargar_modalidad();
			}
			
			
			_ofertaTelevision.setModalidades(modalidades);
		}
		
	}
	
	public void leerModalidad()
	{
		nombreF.setValue(modalidad.getNombre());
		caracteristicasArea.setValue(modalidad.getCaracteristicas());
		precioF.setValue(modalidad.getPrecio()+"");
		checkBx.setValue(modalidad.getVisibilidad());
		tipoComboBx.setValue(modalidad.getTipo());
	}
}