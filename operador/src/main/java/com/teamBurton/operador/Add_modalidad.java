package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Canal;
import bd.Modalidad;
import bdgui.IAdministrador;

public class Add_modalidad extends Add_modalidad_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private List _modalidadesList;*/
	public Crear_modificar_comun _unnamed_Crear_modificar_comun_;
	public Vector<Modalidad_lista_add> _modalidad = new Vector<Modalidad_lista_add>();
	public static final String VIEW_NAME = "add_modalidad";
	private IAdministrador administrador = new BD_Principal();
	private List<Modalidad> modalidades;
	private List<Integer> modalidadesId;
	private String idsResultado = "";
	private String tipo;
	private boolean creacion = false;
	
	public Add_modalidad()
	{
		modalidadesTabla.setImmediate(true);
		
		modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String id =  modalidadesTabla.getContainerDataSource().getItem(rowId).getItemProperty("ID").getValue().toString();
				
				if(creacion)
				{
					doNavigate(Crear_modalidad_administrador.VIEW_NAME +"/" +tipo +";" +idsResultado +id);
				}else
				{
					doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +tipo +";" +idsResultado +id);
				}
				
			}
		});
		
		atrasB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event)
			{
				if(creacion)
				{
					doNavigate(Crear_modalidad_administrador.VIEW_NAME +"/" +tipo +";" +idsResultado);
				}else
				{
					doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +tipo +";" +idsResultado);
				}
				
			}
		});
	}
	
	public void cargar_modalidades_add_modalidad()
	{
		modalidades = administrador.cargar_modalidades();
		String visible = "No";
		
		if(tipo.equals("television"))
		{
			
			for(int i = 0; i < modalidades.size(); i++)
			{
				if(modalidades.get(i).getTipo().equals("television") && modalidades.get(i) instanceof Canal)
				{
					if(!modalidadesId.contains(modalidades.get(i).getID()))
					{
						if(modalidades.get(i).getVisibilidad())
						{
							visible = "Si";
						}else
						{
							visible = "No";
						}
						
						modalidadesTabla.addRow(modalidades.get(i).getID()+"", modalidades.get(i).getTipo(), modalidades.get(i).getNombre(), visible, modalidades.get(i).getPrecio() +"€");
					}
				}
			}
			
		}else
		{
			
			for(int i = 0; i < modalidades.size(); i++)
			{
				if(!modalidades.get(i).getTipo().equals("oferta"))
				{
					if(!modalidadesId.contains(modalidades.get(i).getID()))
					{
						if(modalidades.get(i).getVisibilidad())
						{
							visible = "Si";
						}else
						{
							visible = "No";
						}
						
						modalidadesTabla.addRow(modalidades.get(i).getID()+"", modalidades.get(i).getTipo(), modalidades.get(i).getNombre(), visible, modalidades.get(i).getPrecio() +"€");
					}
					
				}
			}
			
		}
		
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		if(event.getParameters() != null)
		{
			String[] ids = event.getParameters().split(";");
			modalidadesId = new ArrayList<Integer>();
			
			for(int i = 2; i < ids.length; i++)
			{
				modalidadesId.add(Integer.parseInt(ids[i]));
				idsResultado += ids[i] + ";";
			}
			
			tipo = ids[0];
			
			if(ids[1].equals("creacion")) creacion = true;
			
			cargar_modalidades_add_modalidad();
		}
		
	}
}