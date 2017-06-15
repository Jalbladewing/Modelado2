package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.Modalidad;
import bdgui.IAdministrador;

public class Modalidades_eleccion extends Modalidades_eleccion_ventana implements View {
	/*private Object _buscarB_Button;
	private TextField _buscarT;
	private Label _seccion;
	private Button _cancelar;
	private List _modalidadesL;*/
	public Traspasar_usuarios_administrador _unnamed_Traspasar_usuarios_administrador_;
	public Vector<Modalidad_lista_eleccion> _modalidad = new Vector<Modalidad_lista_eleccion>();
	public static final String VIEW_NAME = "modalidades_eleccion";
	private IAdministrador administrador = new BD_Principal();
	private List<Modalidad> modalidades;
	private String ids = "";
	
	public Modalidades_eleccion()
	{
		cargar_modalidades_traspaso();
		
		modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int idNuevaModalidad =  Integer.parseInt(modalidadesTabla.getContainerDataSource().getItem(rowId).getItemProperty("ID").getValue().toString());
				String nombre = modalidadesTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nombre").getValue().toString();
				
				Window subWindow = new Window("Traspaso Usuarios");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Confirmacion_traspaso(((NavigatorUI) UI.getCurrent()).getGestionModalidad().getID(), idNuevaModalidad, Arrays.asList(((NavigatorUI) UI.getCurrent()).getGestionModalidad().getClientes()),nombre, ids));
				UI.getCurrent().addWindow(subWindow);
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +ids);
				
			}
		});
	}
	
	public void cargar_modalidades_traspaso()
	{
		String visible = "No";
		modalidades = administrador.cargar_modalidades();
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			if(!((NavigatorUI) UI.getCurrent()).getGestionModalidad().getTipo().equals(modalidades.get(i).getTipo())) continue;
			
			if(((NavigatorUI) UI.getCurrent()).getGestionModalidad().getID() == modalidades.get(i).getID()) continue;
			
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
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		ids = event.getParameters();
		
	}
}