package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

public class Cambiar_visibilidad extends Cambiar_visibilidad_ventana{
	public Modalidad_individual_administrador _unnamed_Modalidad_individual_administrador_;
	public Modalidad_ofertas_administrador _unnamed_Modalidad_ofertas_administrador_;
	
	public Cambiar_visibilidad()
	{
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
	}
}