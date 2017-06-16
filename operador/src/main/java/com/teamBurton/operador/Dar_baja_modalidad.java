package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bdgui.IAdministrador;
import bdgui.IComercial;

import com.vaadin.ui.Button.ClickEvent;

public class Dar_baja_modalidad extends Dar_baja_modalidad_ventana 
{
	public Mis_servicios_vista_usuario _unnamed_Mis_servicios_vista_usuario_;
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private int _modalidadId;
	private int _clienteId;
	
	public Dar_baja_modalidad(int modalidadId, int clienteId, String nombreModalidad)
	{
		_modalidadId = modalidadId;
		_clienteId = clienteId;
		
		mensajeL.setValue("¿Seguro que desea dar de baja la modalidad " +nombreModalidad +"?");
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				baja_modalidad_cliente();
				
				doNavigate(Mis_servicios_vista_usuario.VIEW_NAME);
				
				UI.getCurrent().removeWindow((Window) getParent());
				
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
	
	public void baja_modalidad_cliente()
	{
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			
			comercial.baja_modalidad_cliente(_clienteId, _modalidadId);
			
		}else 
		{
			
			administrador.baja_modalidad_cliente(_clienteId, _modalidadId);
			
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}