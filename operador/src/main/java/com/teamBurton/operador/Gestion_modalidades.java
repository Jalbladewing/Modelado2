package com.teamBurton.operador;

import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Modalidad;
import bd.ModalidadDAO;
import bd.Oferta;
import bdgui.IAdministrador;

public class Gestion_modalidades extends Gestion_modalidades_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private Button _crearModalidad;
	private List _modalidadesL;*/
	public Mi_cuenta_administrador _unnamed_Mi_cuenta_administrador_;
	public Crear_modalidad_administrador _creaModalidad;
	public Vector<Modalidad_lista_gestion_administrador> _modalidad = new Vector<Modalidad_lista_gestion_administrador>();
	public static final String VIEW_NAME = "gestion_modalidades";
	private IAdministrador administrador = new BD_Principal();
	private List<Modalidad> modalidades;
	
	public Gestion_modalidades()
	{
		
		modalidadesTabla.setImmediate(true);
		
		cargar_modalidades_gestion_modalidades();
		
		modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id = (int) rowId;

				((NavigatorUI) UI.getCurrent()).setGestionModalidad(modalidades.get(id-1));
				
				doNavigate(Modalidad_gestion_administrador.VIEW_NAME);
				
			}
		});
		
		crearB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Crear_modalidad_administrador.VIEW_NAME);
			} 
		}); 
	}
	
	public void cargar_modalidades_gestion_modalidades()
	{
		String visible = "No";
		modalidades = administrador.cargar_modalidades();
		
		for(int i = 0; i < modalidades.size(); i++)
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
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}