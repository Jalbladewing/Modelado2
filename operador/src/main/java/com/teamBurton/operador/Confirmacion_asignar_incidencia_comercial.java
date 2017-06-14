package com.teamBurton.operador;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Comercial;
import bdgui.IAdministrador;

public class Confirmacion_asignar_incidencia_comercial extends Confirmacion_asignar_incidencia_comercial_ventana {
	public Asignar_incidencia _unnamed_Asignar_incidencia_;
	private Comercial _comercial;
	private List<Integer> _incidenciasId;
	private int incidenciaId;
	private IAdministrador administrador = new BD_Principal();
	
	public Confirmacion_asignar_incidencia_comercial(Comercial comercial, List<Integer> incidenciasId)
	{
		_comercial = comercial;
		_incidenciasId = incidenciasId;
		mensajeL.setValue("¿Seguro que desea asignarle la incidencia a " + _comercial.getEmail() + "?");
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				for(int i = 0; i < _incidenciasId.size(); i++)
				{
					incidenciaId = _incidenciasId.get(i);
					registrar_incidencia_asignada();
				}
				
				UI.getCurrent().removeWindow((Window) getParent());
				doNavigate(Gestion_incidencias_administrador.VIEW_NAME);
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
	
	public void registrar_incidencia_asignada()
	{
		administrador.registrar_incidencia_asignada(_comercial.getID(), incidenciaId);
	
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}