package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bdgui.IAdministrador;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

public class Cambiar_visibilidad extends Cambiar_visibilidad_ventana{
	public Modalidad_individual_administrador _unnamed_Modalidad_individual_administrador_;
	public Modalidad_ofertas_administrador _unnamed_Modalidad_ofertas_administrador_;
	private IAdministrador administrador = new BD_Principal();
	private int idModalidad;
	
	public Cambiar_visibilidad(CheckBox checkbox, int id)
	{
		idModalidad = id;
		
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				
				if(checkbox.getValue())
				{
					checkbox.setValue(false);
				}else
				{
					checkbox.setValue(true);
				}
				
				cambiar_visibilidad_modalidad_destacada();
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
	}
	
	public void cambiar_visibilidad_modalidad_destacada()
	{
		administrador.cambiar_visibilidad_modalidad_destacada(idModalidad);
	}
}