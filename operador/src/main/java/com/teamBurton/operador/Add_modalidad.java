package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

public class Add_modalidad extends Add_modalidad_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Label _seccion;
	private List _modalidadesList;*/
	public Crear_modificar_comun _unnamed_Crear_modificar_comun_;
	public Vector<Modalidad_lista_add> _modalidad = new Vector<Modalidad_lista_add>();
	public static final String VIEW_NAME = "add_modalidad";
	
	public Add_modalidad()
	{
		modalidadesTabla.setImmediate(true);
		
		
		
		/*modalidadesTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				
				doNavigate(Crear_modalidad_administrador.VIEW_NAME);
				
			}
		});*/
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}