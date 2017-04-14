package com.teamBurton.operador;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

public class Mis_incidencias_comercial extends Mis_incidencias_comercial_ventana implements View {
	/*private Button _buscar_B;
	private TextField _buscarL;
	private Label _seccion;*/
	public Mi_cuenta_comercial _unnamed_Mi_cuenta_comercial_;
	public Incidencias_todas_comercial _todas;
	public Incidencias_llamadas_comercial _llamadas;
	public Incidencias_pendientes_comercial _pendientes;
	public Incidencias_resueltas_comercial _resueltas;
	public static final String VIEW_NAME = "mis_incidencias_comercial";
	
	public Mis_incidencias_comercial()
	{
		todasTab.setImmediate(true);
		llamadaTab.setImmediate(true);
		pendientesTab.setImmediate(true);
		resueltasTab.setImmediate(true);
		
		todasTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String numero = (String) todasTab.getContainerProperty(rowId, "Nº Incidencia").getValue();
				String asunto = (String) todasTab.getContainerProperty(rowId, "Asunto").getValue();
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + numero + "_" + asunto);
				
			}
		});
		
		llamadaTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String numero = (String) llamadaTab.getContainerProperty(rowId, "Nº Incidencia").getValue();
				String asunto = (String) llamadaTab.getContainerProperty(rowId, "Asunto").getValue();
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + numero + "_" + asunto);
				
			}
		});
		
		pendientesTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String numero = (String) pendientesTab.getContainerProperty(rowId, "Nº Incidencia").getValue();
				String asunto = (String) pendientesTab.getContainerProperty(rowId, "Asunto").getValue();
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + numero + "_" + asunto);
				
			}
		});
		
		resueltasTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String numero = (String) resueltasTab.getContainerProperty(rowId, "Nº Incidencia").getValue();
				String asunto = (String) resueltasTab.getContainerProperty(rowId, "Asunto").getValue();
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + numero + "_" + asunto);
				
			}
		});
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}