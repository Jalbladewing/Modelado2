package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Salir_vista_comercial extends Salir_vista_comercial_ventana {
	public Mi_cuenta_vista_comercial _unnamed_Mi_cuenta_vista_comercial_;
	
	public Salir_vista_comercial()
	{
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				
				((NavigatorUI) UI.getCurrent()).setVistaComercial(null);
				UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setParentView("Administrador");
				((NavigatorUI) UI.getCurrent()).setMainView("Administrador");
				NavigatorUI.getCurrent().setContent(new Administrador2());	
				UI.getCurrent().removeWindow((Window) getParent());
				
				
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().removeWindow((Window) getParent());
				
			}
		});
	}
}