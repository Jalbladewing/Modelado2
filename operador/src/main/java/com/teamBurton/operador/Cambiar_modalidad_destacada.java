package com.teamBurton.operador;

import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Grid.SingleSelectionModel;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Modalidad;
import bdgui.IAdministrador;

public class Cambiar_modalidad_destacada extends Cambiar_modalidad_destacada_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private List _modalidadesL;*/
	public Modalidad_individual_administrador _unnamed_Modalidad_individual_administrador_;
	public Modalidad_ofertas_administrador _unnamed_Modalidad_ofertas_administrador_;
	public Vector<Modalidad_lista_cambiar_modalidad> _modalidad = new Vector<Modalidad_lista_cambiar_modalidad>();
	public static final String VIEW_NAME = "cambiar_modalidad_destacada";
	private IAdministrador administrador = new BD_Principal();
	private List<Modalidad> modalidades;
	private int idModalidadAntigua;
	private int idModalidadNueva;
	
	public Cambiar_modalidad_destacada()
	{
		cargar_modalidades();
		
		modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				idModalidadNueva =  Integer.parseInt(modalidadesTabla.getContainerDataSource().getItem(rowId).getItemProperty("ID").getValue().toString());
				cambiar_modalidad_destacada();
				
				doNavigate(Modalidades_destacadas_administrador.VIEW_NAME);
				
			}
		});
	}
	
	public void cargar_modalidades()
	{
		String visible = "No";
		modalidades = administrador.cargar_modalidades();
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			if(modalidades.get(i).getAdministrador() != null) continue;
			
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
	
	public void cambiar_modalidad_destacada()
	{
		administrador.cambiar_modalidad_destacada(idModalidadAntigua, idModalidadNueva);
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			idModalidadAntigua = Integer.parseInt(event.getParameters());
		}
		
	}
}