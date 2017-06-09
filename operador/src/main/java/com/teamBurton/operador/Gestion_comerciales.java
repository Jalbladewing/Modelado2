package com.teamBurton.operador;

import java.util.Arrays;
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
import bd.Comercial;
import bd.Incidencia;
import bdgui.IAdministrador;

public class Gestion_comerciales extends Gestion_comerciales_ventana implements  View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private Button _altaComercial;
	private List _comercialesL;*/
	public Mi_cuenta_administrador _unnamed_Mi_cuenta_administrador_;
	public Vector<Comecial_lista_administrador> _comercial = new Vector<Comecial_lista_administrador>();
	public Alta_comercial _daAlta;
	public static final String VIEW_NAME = "gestion_comerciales";
	private IAdministrador administrador = new BD_Principal();
	List<Comercial> comerciales;
	
	public Gestion_comerciales()
	{
		cargar_comerciales_gestion_comerciales();
		
		altaB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Alta_comercial.VIEW_NAME);
			} 
		}); 
		
		comercialesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id = (int)rowId;
				
				((NavigatorUI) UI.getCurrent()).setVistaComercial(comerciales.get(id-1));
				UI.getCurrent().getNavigator().removeView(Gestion_comerciales.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setMainView("Vista_Comercial");
				((NavigatorUI) UI.getCurrent()).setParentView("Vista_Comercial");
				NavigatorUI.getCurrent().setContent(new Comercial_administrador());
				
			}
		});
	}
	
	public void cargar_comerciales_gestion_comerciales()
	{
		comerciales = administrador.cargar_comerciales();
		
		int numIncidenciasActivas;
		int numIncidenciasTotales;
		List<Incidencia> incidencias;
		
		for(int i = 0; i < comerciales.size(); i++)
		{
			incidencias = Arrays.asList(comerciales.get(i).incidencia.toArray());
			numIncidenciasTotales = incidencias.size();
			numIncidenciasActivas = 0;
			
			for(int j = 0; j < incidencias.size(); j++)
			{
				if(incidencias.get(j).getEstado().equals("pendiente"))
				{
					numIncidenciasActivas++;
				}
			}
			
			comercialesTabla.addRow(comerciales.get(i).getNombre(),comerciales.get(i).getApellidos(),comerciales.get(i).getEmail(), numIncidenciasActivas+"", numIncidenciasTotales+"");
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