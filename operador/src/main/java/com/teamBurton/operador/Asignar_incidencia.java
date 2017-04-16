package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

public class Asignar_incidencia extends Asignar_incidencia_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;s*/
	public Gestion_incidencias_administrador _unnamed_Gestion_incidencias_administrador_;
	public Vector<Comercial_asignar_incidencia> _comercial = new Vector<Comercial_asignar_incidencia>();
	public Confirmacion_asignar_incidencia_comercial _confirmacion;
	public static final String VIEW_NAME = "asignar_incidencia";
	
	public Asignar_incidencia()
	{
		comercialesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String correo = (String) comercialesTabla.getContainerProperty(rowId, "Correo").getValue();
				
				Window subWindow = new Window("Asignar incidencia");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Confirmacion_asignar_incidencia_comercial(correo));
				UI.getCurrent().addWindow(subWindow);
				
			}
		});
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}