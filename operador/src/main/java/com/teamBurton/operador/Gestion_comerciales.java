package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

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
	
	public Gestion_comerciales()
	{
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
				UI.getCurrent().getNavigator().removeView(Gestion_comerciales.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setMainView("Vista_Comercial");
				NavigatorUI.getCurrent().setContent(new Comercial_administrador());
				
			}
		});
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