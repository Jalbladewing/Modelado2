package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Incidencia;
import bd.Incidencia_administrador;
import bdgui.IAdministrador;

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
	private IAdministrador administrador = new BD_Principal();
	private List<Incidencia_administrador> incidencias;
	private List incidenciasSeleccionadas;
	private boolean invalida = false;
	
	public Gestion_incidencias_administrador()
	{
		cargar_incidencias();
	
		todasTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				if(event.isDoubleClick())
				{
					Object rowId = event.getItemId();
					int id =  Integer.parseInt(todasTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
					
					
					doNavigate(Incidencia_administrador2.VIEW_NAME + "/" + id );
				}
				
				
			}
		});
		
		llamadaTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				if(event.isDoubleClick())
				{
					Object rowId = event.getItemId();
					int id =  Integer.parseInt(llamadaTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
					doNavigate(Incidencia_administrador2.VIEW_NAME + "/" + id );
				}
				
			}
		});
		
		asignadasTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				if(event.isDoubleClick())
				{
					Object rowId = event.getItemId();
					int id =  Integer.parseInt(asignadasTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
					doNavigate(Incidencia_administrador2.VIEW_NAME + "/" + id );
				}
				
			}
		});
		
		sinAsignarTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				if(event.isDoubleClick())
				{
					Object rowId = event.getItemId();
					int id =  Integer.parseInt(sinAsignarTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
					doNavigate(Incidencia_administrador2.VIEW_NAME + "/" + id );
				}
				
			}
		});
		
		resueltasTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				if(event.isDoubleClick())
				{
					Object rowId = event.getItemId();
					int id =  Integer.parseInt(resueltasTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString());
				
					doNavigate(Incidencia_administrador2.VIEW_NAME + "/" + id );
				}
				
			}
		});
		
		
		asignarB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 			
				String ids = "";
				Object rowId;
				String estado;
				incidenciasSeleccionadas = Arrays.asList(((com.vaadin.ui.Grid) tabsTabSheet.getSelectedTab()).getSelectedRows().toArray());
				
				
				
				for(int i = 0; i < incidenciasSeleccionadas.size(); i++)
				{
					rowId = incidenciasSeleccionadas.get(i);
					estado =  ((com.vaadin.ui.Grid) tabsTabSheet.getSelectedTab()).getContainerDataSource().getItem(rowId).getItemProperty("Estado").getValue().toString();
					ids += ((com.vaadin.ui.Grid) tabsTabSheet.getSelectedTab()).getContainerDataSource().getItem(rowId).getItemProperty("Nº Incidencia").getValue().toString();
					
					if(i < incidenciasSeleccionadas.size()-1) ids += ";";
					
					if(!estado.equals("pendiente"))
					{
						invalida = true;
						break;
					}
				}
				
				if(!invalida && !incidenciasSeleccionadas.isEmpty())
				{
					doNavigate(Asignar_incidencia.VIEW_NAME + "/" + ids);
					
				}else
				{
					errorL.setVisible(true);
				}
				
				invalida = false;
				ids = "";
			} 
		}); 
	}
	
	public void cargar_incidencias()
	{

		incidencias = administrador.cargar_incidencias_administrador();
		
		
		for(int i = 0; i < incidencias.size(); i++)
		{
			//Tabla con todas las incidencias
			todasTabla.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(), incidencias.get(i).getCorreoComercial(),incidencias.get(i).getEstado());
			
			//Si es una incidencia de tipo llamada se añade a su tabla
			if(incidencias.get(i).getTipoIncidencia().equals("llamada") && incidencias.get(i).getEstado().equals("pendiente"))
			{
				llamadaTabla.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(), incidencias.get(i).getCorreoComercial(),incidencias.get(i).getEstado());
			}
			
			//Si la incidencia está asignada se añade a la tabla correspondiente
			if(incidencias.get(i).getComercial() != null && !incidencias.get(i).getTipoIncidencia().equals("llamada") && incidencias.get(i).getEstado().equals("pendiente"))
			{
				asignadasTabla.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(), incidencias.get(i).getCorreoComercial(),incidencias.get(i).getEstado());
			
				//Si está sin asignar se añade a su tabla
			}else if(incidencias.get(i).getComercial() == null && !incidencias.get(i).getTipoIncidencia().equals("llamada") && incidencias.get(i).getEstado().equals("pendiente"))
			{
				sinAsignarTabla.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(), incidencias.get(i).getCorreoComercial(),incidencias.get(i).getEstado());
			}
			
			//Si está resuelta
			if(incidencias.get(i).getEstado().equals("resuelta"))
			{
				resueltasTabla.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getCorreoCliente(), incidencias.get(i).getCorreoComercial(),incidencias.get(i).getEstado());
			}
		}
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