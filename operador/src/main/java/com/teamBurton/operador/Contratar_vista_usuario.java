package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Cliente;
import bdgui.IAdministrador;
import bdgui.IComercial;

import com.vaadin.ui.Button.ClickEvent;

public class Contratar_vista_usuario extends Contratar_vista_usuario_ventana {
	public Mi_cuenta_vista_usuario _unnamed_Mi_cuenta_vista_usuario_;
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private int idModalidad;
	
	public Contratar_vista_usuario(String nombre, boolean contratada, int id)
	{
		idModalidad = id;
		
		if(contratada)
		{
			mensajeL.setValue("Usted ya posee la modalidad " +nombre);
			
		}else
		{
			mensajeL.setValue("¿Seguro que desea contratar la modalidad " +nombre +"?");
		}
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(contratada)
				{
					UI.getCurrent().removeWindow((Window) getParent());
				}else
				{
					contratar_modalidad();
					doNavigate(Mis_servicios_vista_usuario.VIEW_NAME);
					UI.getCurrent().removeWindow((Window) getParent());
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
		
		
	}
	
	public void contratar_modalidad()
	{
		Cliente cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			comercial.contratar_modalidad(cliente.getID(), idModalidad);
			
		}else 
		{
			administrador.contratar_modalidad(cliente.getID(), idModalidad);
			
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}