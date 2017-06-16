package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Desconectar_comercial extends Desconectar_comercial_ventana {
	public Mi_cuenta_comercial _unnamed_Mi_cuenta_comercial_;
	
	public Desconectar_comercial()
	{
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setMainView("Cibernauta");
				((NavigatorUI) UI.getCurrent()).setParentView("");
				NavigatorUI.getCurrent().setContent(new Cibernauta());	
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