package com.teamBurton.operador;

import java.util.List;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Incidencia;
import bdgui.IAdministrador;
import bdgui.IComercial;

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
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private List<Incidencia> incidencias;
	
	public Mis_incidencias_comercial()
	{
		todasTab.setImmediate(true);
		llamadaTab.setImmediate(true);
		pendientesTab.setImmediate(true);
		resueltasTab.setImmediate(true);
		
		cargar_incidencias();
		
		todasTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id =  Integer.parseInt(todasTab.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + id );
				
			}
		});
		
		llamadaTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id =  Integer.parseInt(llamadaTab.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + id );
				
			}
		});
		
		pendientesTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id =  Integer.parseInt(pendientesTab.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" + id );
				
			}
		});
		
		resueltasTab.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id =  Integer.parseInt(resueltasTab.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
				doNavigate(Incidencia_comercial.VIEW_NAME + "/" +  id );
				
			}
		});
	}
	
	public void cargar_incidencias()
	{
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Comercial"))
		{
			incidencias = comercial.cargar_incidencias_comercial(((NavigatorUI) UI.getCurrent()).getUsuario().getID());
		}else
		{
			incidencias = administrador.cargar_incidencias_comercial(((NavigatorUI) UI.getCurrent()).getVistaComercial().getID());
		}
		
		
		for(int i = 0; i < incidencias.size(); i++)
		{
			//Tabla con todas las incidencias
			todasTab.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(),incidencias.get(i).getEstado());
			
			//Si es una incidencia de tipo llamada se añade a su tabla
			if(incidencias.get(i).getTipoIncidencia().equals("llamada"))
			{
				llamadaTab.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(),incidencias.get(i).getEstado());
			}
			
			//Si la incidencia está sin resolver se añade a la tabla correspondiente
			if(incidencias.get(i).getEstado().equals("pendiente"))
			{
				pendientesTab.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCliente().getEmail(),incidencias.get(i).getEstado());
			
			}else if(incidencias.get(i).getEstado().equals("resuelta"))//Si está resuelta se añade a su tabla
			{
				resueltasTab.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCliente().getEmail(),incidencias.get(i).getEstado());
			}
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}