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
import bd.Cliente;
import bdgui.IComercial;

public class Gestion_usuarios_comercial extends Gestion_usuarios_comercial_ventana implements View {
	/*private Button _buscarB;
	private TextField _buscarT;
	private Button _altaUsuario;
	private List _usuariosL;*/
	public Mi_cuenta_comercial _unnamed_Mi_cuenta_comercial_;
	public Alta_usuario _daAlta;
	public Vector<Usuario_lista_gestion_comercial> _cliente = new Vector<Usuario_lista_gestion_comercial>();
	public static final String VIEW_NAME = "gestion_usuarios_comercial";
	private IComercial comercial = new BD_Principal();
	private List<Cliente> clientes;
	
	public Gestion_usuarios_comercial()
	{
		cargar_cliente();
		
		//Pulsar el botón de alta cliente
		altaB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Alta_usuario.VIEW_NAME);
			} 
		}); 
		
		//Pulsar en un cliente de la tabla
		usuariosTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				
				((NavigatorUI) UI.getCurrent()).setVistaCliente(clientes.get((int)rowId));
				UI.getCurrent().getNavigator().removeView(Gestion_usuarios_comercial.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setMainView("Vista_Cliente");
				NavigatorUI.getCurrent().setContent(new Usuario_gestion_comercial());
				
			}
		});
	}
	
	public void cargar_cliente()
	{
		clientes = comercial.cargar_clientes();
		int numIncidencias;
		
		for(int i = 0; i < clientes.size(); i++)
		{
			numIncidencias = clientes.get(i).incidencia.size();
			usuariosTabla.addRow(clientes.get(i).getNombre(),clientes.get(i).getApellidos(),clientes.get(i).getEmail(),numIncidencias+"");
		}
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