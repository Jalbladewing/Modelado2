package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

public class Modalidades_eleccion extends Modalidades_eleccion_ventana implements View {
	/*private Object _buscarB_Button;
	private TextField _buscarT;
	private Label _seccion;
	private Button _cancelar;
	private List _modalidadesL;*/
	public Traspasar_usuarios_administrador _unnamed_Traspasar_usuarios_administrador_;
	public Vector<Modalidad_lista_eleccion> _modalidad = new Vector<Modalidad_lista_eleccion>();
	public static final String VIEW_NAME = "modalidades_eleccion";
	
	public Modalidades_eleccion()
	{
		modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String nombre = (String) modalidadesTabla.getContainerProperty(rowId, "Nombre").getValue();
				
				Window subWindow = new Window("Traspaso Usuarios");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Confirmacion_traspaso(nombre));
				UI.getCurrent().addWindow(subWindow);
				
			}
		});
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}