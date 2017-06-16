package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Modalidad;
import bd.Oferta;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

public class Mis_servicios_vista_usuario extends Mis_servicios_vista_usuario_ventana implements View {
	public Mi_cuenta_vista_usuario _unnamed_Mi_cuenta_vista_usuario_;
	public Dar_baja_modalidad _daBaja;
	public static final String VIEW_NAME = "mis_servicios_vista_usuario";
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Mis_servicios_vista_usuario()
	{

		cargar_modalidades_mis_servicios();
		
	}
	
	public void cargar_modalidades_mis_servicios()
	{
		List<Modalidad> modalidades;
		
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			modalidades = comercial.cargar_modalidades_mis_servicios(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else 
		{
			
			modalidades = administrador.cargar_modalidades_mis_servicios(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}
		
		Oferta oferta;
		List<Modalidad> modalidadesOferta;
		Servicio television = new Servicio();
		Servicio internet = new Servicio();
		Servicio telefono = new Servicio();
		Servicio movil = new Servicio();
		Button boton;
		boolean ofertaTelevision = false;
		boolean ofertaInternet = false;
		boolean ofertaTelefono = false;
		boolean ofertaMovil = false;
		
		television.tituloL.setValue("Televisión");
		internet.tituloL.setValue("Internet");
		telefono.tituloL.setValue("Teléfono Fijo");
		movil.tituloL.setValue("Móvil");
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			boton = new Button(modalidades.get(i).getNombre());
			boton.addStyleName("link");
			
			if(modalidades.get(i).getTipo().equals("television"))
			{
				television.noServiciosL.setVisible(false);
				television.vLayoutModalidadesB.addComponent(boton);
				
			}else if(modalidades.get(i).getTipo().equals("internet"))
			{
				internet.noServiciosL.setVisible(false);
				internet.vLayoutModalidadesB.addComponent(boton);
				
			}else if(modalidades.get(i).getTipo().equals("telefonoFijo"))
			{
				telefono.noServiciosL.setVisible(false);
				telefono.vLayoutModalidadesB.addComponent(boton);
				
			}else if(modalidades.get(i).getTipo().equals("movil"))
			{
				movil.noServiciosL.setVisible(false);
				movil.vLayoutModalidadesB.addComponent(boton);
				
			}else
			{
				oferta = (Oferta) modalidades.get(i);
				modalidadesOferta = Arrays.asList(oferta.modalidad.toArray());
				
				for(int j = 0; j < modalidadesOferta.size(); j++)
				{
					boton = new Button(modalidades.get(i).getNombre());
					boton.addStyleName("link");
					
					if(modalidadesOferta.get(j).getTipo().equals("television") && !ofertaTelevision)
					{
						television.noServiciosL.setVisible(false);
						television.vLayoutModalidadesB.addComponent(boton);
						ofertaTelevision = true;
						
					}else if(modalidadesOferta.get(j).getTipo().equals("internet") && !ofertaInternet)
					{
						internet.noServiciosL.setVisible(false);
						internet.vLayoutModalidadesB.addComponent(boton);
						ofertaInternet = true;
						
					}else if(modalidadesOferta.get(j).getTipo().equals("telefonoFijo") && !ofertaTelefono)
					{
						telefono.noServiciosL.setVisible(false);
						telefono.vLayoutModalidadesB.addComponent(boton);
						ofertaTelefono = true;
						
					}else if(modalidadesOferta.get(j).getTipo().equals("movil") && !ofertaMovil)
					{
						movil.noServiciosL.setVisible(false);
						movil.vLayoutModalidadesB.addComponent(boton);
						ofertaMovil = true;
					}
					
					boton.addClickListener(new Button.ClickListener() {
						
						@Override
						public void buttonClick(ClickEvent event)
						{
							doNavigate(Modalidad_oferta_cliente.VIEW_NAME + "/" + event.getButton().getCaption());
						
						}
					});
				}
				
				ofertaTelevision = false;
				ofertaInternet = false;
				ofertaTelefono = false;
				ofertaMovil = false;
			}
			
			if(!modalidades.get(i).getTipo().equals("oferta"))
			{
				boton.addClickListener(new Button.ClickListener() {
				
					@Override
					public void buttonClick(ClickEvent event)
					{
						doNavigate(Modalidad_individual_cliente.VIEW_NAME + "/" + event.getButton().getCaption());
					
					}
				});
			}
		}
		
		serviciosGrid.addComponent(television);
		serviciosGrid.addComponent(internet);
		serviciosGrid.addComponent(telefono);
		serviciosGrid.addComponent(movil);
	}
	
	//Esto debería estar en Cliente
	private void doNavigate(String viewName) {
		UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}