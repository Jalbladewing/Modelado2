package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bdgui.IAdministrador;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Eliminar_modalidad_administrador extends Eliminar_modalidad_administrador_ventana {
	/*private Label _diasTitulo;
	private TextArea _diasValor;*/
	public Modalidad_individual_modificacion _unnamed_Modalidad_individual_modificacion_;
	public Modalidad_oferta_television_modificar _unnamed_Modalidad_oferta_television_modificar_;
	private IAdministrador administrador = new BD_Principal();
	private boolean allowed = false;
	
	public Eliminar_modalidad_administrador()
	{
		if(!((NavigatorUI) UI.getCurrent()).getGestionModalidad().contratos.isEmpty())
		{
			mensajeL.setValue("Primero trasapase a los usuarios");
			diasL.setVisible(false);
			diasF.setVisible(false);
		}
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!allowed)
				{
					UI.getCurrent().removeWindow((Window) getParent());
				}
				
				
				
				if(!diasF.getValue().replaceAll("\\s+","").isEmpty())
				{
					eliminar_modalidad();
					doNavigate(Gestion_modalidades.VIEW_NAME);
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
	
	public void eliminar_modalidad()
	{
		administrador.eliminar_modalidad(((NavigatorUI) UI.getCurrent()).getGestionModalidad().getID(), Integer.parseInt(diasF.getValue()));
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}