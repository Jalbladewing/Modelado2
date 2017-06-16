package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Contratar_cliente extends Contratar_cliente_ventana {
	public Cliente2 _unnamed_Cliente2_;
	public Crear_incidencia _creaIncidencia;
	
	public Contratar_cliente(String nombre)
	{
		
		mensajeL.setValue("Usted ya posee la modalidad " +nombre);
			
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{

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
}