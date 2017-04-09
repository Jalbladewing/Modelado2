package com.teamBurton.operador;

import java.util.Set;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Gestion_incidencias_administrador extends Gestion_incidencias_administrador_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Button _asignarIncidencia;*/
	public Mi_cuenta_administrador _unnamed_Mi_cuenta_administrador_;
	public Incidencias_todas_administrador _todas;
	public Incidencias_llamadas_administrador _llamadas;
	public Incidencias_resueltas_administrador _resueltas;
	public Incidencias_sin_asignar_administrador _sinAsignar;
	public Asignar_incidencia _asignaIncidencia;
	public Incidencias_asignadas_administrador _asignadas;
	public static final String VIEW_NAME = "gestion_incidencias_administrador";
	
	public Gestion_incidencias_administrador()
	{
	
		asignarB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				if(!((Set) todasTabla.getValue()).isEmpty() || !((Set) llamadaTabla.getValue()).isEmpty() || !((Set) asignadasTabla.getValue()).isEmpty() || !((Set) sinAsignarTabla.getValue()).isEmpty())
				{
					
					doNavigate(Asignar_incidencia.VIEW_NAME);
					
				}else
				{
					errorL.setVisible(true);
				}
			} 
		}); 
	}
	
	//Esto debería estar en Administrador
	private void doNavigate(String viewName) 
	{
		UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}