package com.teamBurton.operador;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Cliente;
import bdgui.IAdministrador;

import com.vaadin.ui.Button.ClickEvent;

public class Traspasar_usuarios_administrador extends Traspasar_usuarios_administrador_ventana implements View {
	/*private Label _seccion;
	private Button _cancelar;
	private Button _elegirModalidad;
	private List _usuariosL;*/
	public Modalidad_individual_modificacion _unnamed_Modalidad_individual_modificacion_;
	public Modalidad_oferta_television_modificar _unnamed_Modalidad_oferta_television_modificar_;
	public Modalidades_eleccion _modalidadesEleccion;
	public Usuario_lista _unnamed_Usuario_lista_;
	public static final String VIEW_NAME = "traspasar_usuarios_administrador";
	private IAdministrador administrador = new BD_Principal();
	private List<Cliente> clientes;
	private String ids = "";
	
	public Traspasar_usuarios_administrador()
	{
		cargar_clientes_traspaso();
		
		elegirModalidadB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Modalidades_eleccion.VIEW_NAME + "/" +ids);
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +ids);
				
			}
		});
	}
	
	public void cargar_clientes_traspaso()
	{
		clientes = administrador.cargar_clientes_traspaso(((NavigatorUI) UI.getCurrent()).getGestionModalidad().getID());
	
		for(int i = 0; i < clientes.size(); i++)
		{
			usuariosTabla.addRow(clientes.get(i).getNombre(), clientes.get(i).getApellidos(), clientes.get(i).getEmail());
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		ids = event.getParameters();
		
	}
}