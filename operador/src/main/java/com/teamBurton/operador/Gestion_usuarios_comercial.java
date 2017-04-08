package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Gestion_usuarios_comercial extends Gestion_usuarios_comercial_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Button _altaUsuario;
	private List _usuariosL;*/
	public Mi_cuenta_comercial _unnamed_Mi_cuenta_comercial_;
	public Alta_usuario _daAlta;
	public Vector<Usuario_lista_gestion_comercial> _cliente = new Vector<Usuario_lista_gestion_comercial>();
	public static final String VIEW_NAME = "gestion_usuarios_comercial";
	
	public Gestion_usuarios_comercial()
	{
		altaB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Alta_usuario.VIEW_NAME);
			} 
		}); 
		
		usuariosTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				UI.getCurrent().getNavigator().removeView(Gestion_usuarios_comercial.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				NavigatorUI.getCurrent().setContent(new Usuario_gestion_comercial());
				
			}
		});
	}
	
	//Esto debería estar en Comercial
	private void doNavigate(String viewName) 
	{
		UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}