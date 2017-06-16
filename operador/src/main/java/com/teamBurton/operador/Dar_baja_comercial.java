package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.Comercial;
import bdgui.IAdministrador;

public class Dar_baja_comercial extends Dar_baja_comercial_ventana
{
	public Perfil_vista_comercial _unnamed_Perfil_vista_comercial_;
private IAdministrador administrador = new BD_Principal();
	
	public Dar_baja_comercial()
	{
		mensajeL.setValue("¿Seguro que desea darlo de baja? Se dará de baja a los 30 días de confirmarlo.");
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				baja_comercial();
				doNavigate(Modalidades_destacadas_vista_comercial.VIEW_NAME);
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
	
	public void baja_comercial()
	{
		Comercial comercial = (Comercial) ((NavigatorUI) UI.getCurrent()).getVistaComercial();
		
		administrador.baja_comercial(comercial.getID());
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}