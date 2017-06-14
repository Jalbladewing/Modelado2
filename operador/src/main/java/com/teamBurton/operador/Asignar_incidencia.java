package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Comercial;
import bd.Incidencia;
import bdgui.IAdministrador;

public class Asignar_incidencia extends Asignar_incidencia_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;s*/
	public Gestion_incidencias_administrador _unnamed_Gestion_incidencias_administrador_;
	public Vector<Comercial_asignar_incidencia> _comercial = new Vector<Comercial_asignar_incidencia>();
	public Confirmacion_asignar_incidencia_comercial _confirmacion;
	public static final String VIEW_NAME = "asignar_incidencia";
	private IAdministrador administrador = new BD_Principal();
	private List<Comercial> comerciales;
	private List<Integer> incidenciasId;
	
	public Asignar_incidencia()
	{
		cargar_comerciales_asignar_incidencia();
		
		comercialesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id = (int)rowId;
				
				Window subWindow = new Window("Asignar incidencia");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Confirmacion_asignar_incidencia_comercial(comerciales.get(id-1),incidenciasId));
				UI.getCurrent().addWindow(subWindow);
				
			}
		});
	}
	
	public void cargar_comerciales_asignar_incidencia()
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
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		String cadena = event.getParameters();
		String[] parametros = cadena.split(";");
		incidenciasId = new ArrayList<Integer>();
		
		for(int i = 0; i < parametros.length; i++)
		{
			incidenciasId.add(Integer.parseInt(parametros[i]));
		}
		
	}
	
}