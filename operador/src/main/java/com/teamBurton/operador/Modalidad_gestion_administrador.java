package com.teamBurton.operador;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window.CloseEvent;

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

public class Modalidad_gestion_administrador extends Modalidad_gestion_administrador_ventana implements View {
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
	private Button _confirmar;
	private Button _traspasarUsuario;
	private Button _eliminar;*/
	public Modalidad_lista_gestion_administrador _unnamed_Modalidad_lista_gestion_administrador_;
	public Modalidad_individual_modificacion _individual;
	public Modalidad_oferta_television_modificar _ofertaTelevision;
	public static final String VIEW_NAME = "modalidad_gestion_administrador";
	private IAdministrador administrador = new BD_Principal();
	private List<Modalidad> modalidades;
	private int idModalidad;
	private Modalidad modalidad;
	private String modalidadesIds = "";
		
	public Modalidad_gestion_administrador()
	{
		tipoModalidadComboBx.setNullSelectionAllowed(false);
		tipoModalidadComboBx.removeAllItems();
		tipoModalidadComboBx.addItems("movil", "television", "telefonoFijo", "internet", "oferta");
		_ofertaTelevision = new Modalidad_oferta_television_modificar();
		ofertasLayout.addComponent(_ofertaTelevision);
		
		tipoModalidadComboBx.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				
				if(tipoModalidadComboBx.getValue().equals("television")  || tipoModalidadComboBx.getValue().equals("oferta"))
				{
					ofertasLayout.setVisible(true);
					vLayoutDatos.setVisible(false);
					
					if(_ofertaTelevision.getTipo().equals("television") && tipoModalidadComboBx.getValue().equals("oferta") || _ofertaTelevision.getTipo().equals("oferta") && tipoModalidadComboBx.getValue().equals("television"))
					{
						_ofertaTelevision.clearModalidades();
					}
					
					_ofertaTelevision.setTipo((String) tipoModalidadComboBx.getValue());
					
				}else
				{
					_ofertaTelevision.clearModalidades();
					ofertasLayout.setVisible(false);
					
					if(tipoModalidadComboBx.getValue().equals("movil"))
					{
						vLayoutDatos.setVisible(true);
						consumoMaxF.setValue(((Movil) modalidad).getConsumoMax() +"");
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
				
				if(tipoModalidadComboBx.getValue() != null && !nombreF.getValue().replaceAll("\\s+","").isEmpty() && !precioF.getValue().replaceAll("\\s+","").isEmpty())
				{
					if(tipoModalidadComboBx.getValue().equals("movil"))
					{
						if(!consumoMaxF.getValue().replaceAll("\\s+","").isEmpty())
						{
							modificar_modalidad();
							((NavigatorUI) UI.getCurrent()).setGestionModalidad(null);
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}else
						{
							errorL.setValue("Campos vacios");
							errorL.setVisible(true);
						}
						
						
					}else if(tipoModalidadComboBx.getValue().equals("oferta"))
					{
						if(modalidades.size() >= 2)
						{
							modificar_modalidad();
							((NavigatorUI) UI.getCurrent()).setGestionModalidad(null);
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}else
						{
							errorL.setValue("Las ofertas deben tener al menos 2 modalidades");
							errorL.setVisible(true);
						}
						
						
					}else if(tipoModalidadComboBx.getValue().equals("television"))
					{
						if(modalidades.size() != 1)
						{
							modificar_modalidad();
							((NavigatorUI) UI.getCurrent()).setGestionModalidad(null);
							doNavigate(Gestion_modalidades.VIEW_NAME);
						}else
						{
							errorL.setValue("Las modalidades television deben tener 0 modalidades o más de 1");
							errorL.setVisible(true);
						}
						
						
					}else
					{
						modificar_modalidad();
						((NavigatorUI) UI.getCurrent()).setGestionModalidad(null);
						doNavigate(Gestion_modalidades.VIEW_NAME);
					}
					
				}else
				{
					errorL.setValue("Campos vacios");
					errorL.setVisible(true);
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				((NavigatorUI) UI.getCurrent()).setGestionModalidad(null);
				doNavigate(Gestion_modalidades.VIEW_NAME);
				
			}
		});
		
		_ofertaTelevision.addB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				modalidad.setNombre(nombreF.getValue());
				modalidad.setCaracteristicas(caracteristicasArea.getValue());
				
				if(!precioF.getValue().isEmpty())
				{
					modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
				}
				
				modalidad.setVisibilidad(visibleCheckBx.getValue());
				modalidad.setTipo(tipoModalidadComboBx.getValue().toString());
				
				if(checkBxDestacada.getValue())
				{
					modalidad.setAdministrador((Administrador) ((NavigatorUI) UI.getCurrent()).getUsuario()); 
				}else
				{
					modalidad.setAdministrador(null);
				}
				
				((NavigatorUI) UI.getCurrent()).setGestionModalidad(modalidad);
				
				_ofertaTelevision.navigateTo();
				
			}
		});
		
		eliminarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(modalidad.getFechaEliminacion() == null)
				{
					Window subWindow = new Window("Eliminar");	
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Eliminar_modalidad_administrador());
					UI.getCurrent().addWindow(subWindow);
					
				}else
				{
					cancelar_eliminacion_modalidad();
					eliminarB.setCaption("Eliminar");
				}
				
				
				
			}
		});
		
		traspasarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				
				modalidad.setNombre(nombreF.getValue());
				modalidad.setCaracteristicas(caracteristicasArea.getValue());
				modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
				modalidad.setVisibilidad(visibleCheckBx.getValue());
				modalidad.setTipo(tipoModalidadComboBx.getValue().toString());
				
				if(checkBxDestacada.getValue())
				{
					modalidad.setAdministrador((Administrador) ((NavigatorUI) UI.getCurrent()).getUsuario()); 
				}else
				{
					modalidad.setAdministrador(null);
				}
				
				((NavigatorUI) UI.getCurrent()).setGestionModalidad(modalidad);
				
				doNavigate(Traspasar_usuarios_administrador.VIEW_NAME + "/" +modalidadesIds);
			}
		});
	}
	
	public void modificar_modalidad()
	{
		
		modalidad.setNombre(nombreF.getValue());
		modalidad.setCaracteristicas(caracteristicasArea.getValue());
		modalidad.setPrecio(Double.parseDouble(precioF.getValue()));
		modalidad.setVisibilidad(visibleCheckBx.getValue());
		modalidad.setTipo(tipoModalidadComboBx.getValue().toString());
		
		if(checkBxDestacada.getValue())
		{
			modalidad.setAdministrador((Administrador) ((NavigatorUI) UI.getCurrent()).getUsuario()); 
		}else
		{
			modalidad.setAdministrador(null);
		}
		
		if(tipoModalidadComboBx.getValue().equals("television"))
		{
			if(!modalidades.isEmpty())
			{
				((Paquete) modalidad).modalidad.clear();
				for(int i = 0; i < modalidades.size(); i++)
				{
					((Paquete) modalidad).modalidad.add((Canal)modalidades.get(i));
				}
			}
			
		}else if(tipoModalidadComboBx.getValue().equals("oferta"))
		{
			((Oferta) modalidad).modalidad.clear();
			for(int i = 0; i < modalidades.size(); i++)
			{
				((Oferta) modalidad).modalidad.add(modalidades.get(i));
			}
			
			
		}else if(tipoModalidadComboBx.getValue().equals("movil"))
		{
			((Movil) modalidad).setConsumoActual(0.0);
			((Movil) modalidad).setConsumoMax(Double.parseDouble(consumoMaxF.getValue()));		
		}
		
		
		administrador.modificar_modalidad(modalidad);
		
	}
	
	public void cargar_modalidad_gestion_administrador()
	{
		modalidades.add(administrador.cargar_modalidad(idModalidad));
	}
	
	public void cancelar_eliminacion_modalidad()
	{
		administrador.cancelar_eliminacion_modalidad(modalidad.getID());
	}

	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		modalidades = new ArrayList<Modalidad>();
		modalidad = ((NavigatorUI) UI.getCurrent()).getGestionModalidad();
		leerModalidad();
		
		if(!event.getParameters().isEmpty())
		{
			String[] ids = event.getParameters().split(";");
			modalidades = new ArrayList<Modalidad>();
			_ofertaTelevision.clearModalidades();
			
			if(ids[0].equals("television"))
			{
				tipoModalidadComboBx.setValue("television");
			}else
			{
				tipoModalidadComboBx.setValue("oferta");
			}
			
			for(int i = 1; i < ids.length; i++)
			{
				idModalidad = Integer.parseInt(ids[i]);
				cargar_modalidad_gestion_administrador();
				modalidadesIds += ids[i];
				
				if(i < ids.length-1) modalidadesIds += ";";
			}
			
			
			_ofertaTelevision.setModalidades(modalidades);
		}
		
		if(modalidad.getFechaEliminacion() != null)
		{
			eliminarB.setCaption("Cancelar eliminacion (" +getDifferenceDays(new Date(),modalidad.getFechaEliminacion())+")");
		}
		
	}
	
	public void leerModalidad()
	{
		nombreF.setValue(modalidad.getNombre());
		caracteristicasArea.setValue(modalidad.getCaracteristicas());
		precioF.setValue(modalidad.getPrecio()+"");
		visibleCheckBx.setValue(modalidad.getVisibilidad());
		tipoModalidadComboBx.setValue(modalidad.getTipo());
		
		if(modalidad.getAdministrador() == null)
		{
			checkBxDestacada.setValue(false);
		}else
		{
			checkBxDestacada.setValue(true);
		}
		
		if(modalidad.getTipo().equals("oferta"))
		{
			List<Modalidad> modalidadOferta = Arrays.asList(((Oferta) modalidad).modalidad.toArray());
			for(int i = 0; i < modalidadOferta.size(); i++)
			{
				modalidades.add(modalidadOferta.get(i));
			}
			
			_ofertaTelevision.setModalidades(modalidades);
		
		}else if(modalidad instanceof Paquete)
		{
			List<Modalidad> modalidadPaquete = Arrays.asList(((Paquete) modalidad).modalidad.toArray());
			for(int i = 0; i < modalidadPaquete.size(); i++)
			{
				modalidades.add(modalidadPaquete.get(i));
			}
			
			_ofertaTelevision.setModalidades(modalidades);
		}
	}
	
	public long getDifferenceDays(Date d1, Date d2)
	{
		long diff = d2.getTime() - d1.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
}