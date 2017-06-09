package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Modalidad;
import bd.Movil;
import bd.Television;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

public class Mis_servicios extends Mis_servicios_ventana implements View {
	//private Label _seccion;
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Servicio> _servicio = new Vector<Servicio>();
	public static final String VIEW_NAME = "mis_servicios";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Mis_servicios()
	{

		cargar_modalidades_mis_servicios();
		
		/*for(int i = 0; i < ofertas.size(); i++)
		{
			ofertas.get(i).addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) 
				{
					doNavigate(Modalidad_oferta_cliente.VIEW_NAME + "/" + event.getButton().getCaption());
					
				}
			});
		}*/
		
	}
	
	public void cargar_modalidades_mis_servicios()
	{
		List<Modalidad> modalidades;
		
		//Según si estamos en vista cliente o en cliente.
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			modalidades = comercial.cargar_modalidades_mis_servicios(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Administrador"))
		{
			
			modalidades = administrador.cargar_modalidades_mis_servicios(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else
		{
			modalidades = cliente.cargar_modalidades_mis_servicios(((NavigatorUI) UI.getCurrent()).getUsuario().getID());
		}
		
		Servicio television = new Servicio();
		Servicio internet = new Servicio();
		Servicio telefono = new Servicio();
		Servicio movil = new Servicio();
		Button boton;
		
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
				//FALTA LA PARTE DE OFERTAS
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