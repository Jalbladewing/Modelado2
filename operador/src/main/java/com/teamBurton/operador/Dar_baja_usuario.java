package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Cliente;
import bdgui.IAdministrador;
import bdgui.IComercial;

import com.vaadin.ui.Button.ClickEvent;

public class Dar_baja_usuario extends Dar_baja_usuario_ventana 
{
	public Perfil_vista_usuario _unnamed_Perfil_vista_usuario_;
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Dar_baja_usuario()
	{
		mensajeL.setValue("¿Seguro que desea darlo de baja? Se dará de baja a los 30 días de confirmarlo.");
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				baja_cliente();
				doNavigate(Modalidades_destacadas_vista_usuario.VIEW_NAME);
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
	
	public void baja_cliente()
	{
		Cliente cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			comercial.baja_cliente(cliente.getID());
			
		}else 
		{
			administrador.baja_cliente(cliente.getID());
			
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}