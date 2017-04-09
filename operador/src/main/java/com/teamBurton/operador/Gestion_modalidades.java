package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

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
	
	public Gestion_modalidades()
	{
		crearB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Crear_modalidad_administrador.VIEW_NAME);
			} 
		}); 
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}