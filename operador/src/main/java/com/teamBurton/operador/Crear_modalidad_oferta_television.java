package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_modalidad_oferta_television extends Crear_modalidad_oferta_television_ventana
{
	public Crear_modalidad_administrador _unnamed_Crear_modalidad_administrador_;
	
	public Crear_modalidad_oferta_television()
	{
		addB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Add_modalidad.VIEW_NAME);
				
			}
		});
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}