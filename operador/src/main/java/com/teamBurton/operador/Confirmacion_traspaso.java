package com.teamBurton.operador;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.Modalidad;
import bdgui.IAdministrador;

public class Confirmacion_traspaso extends Confirmacion_traspaso_ventana {
	public Modalidad_lista_eleccion _unnamed_Modalidad_lista_eleccion_;
	private IAdministrador administrador = new BD_Principal();
	private int _idAntiguaModalidad;
	private int _idNuevaModalidad;
	private List<Cliente> _clientes;
	
	public Confirmacion_traspaso(int idAntiguaModalidad, int idNuevaModalidad, List<Cliente> clientes, String nombre, String ids)
	{
		_idAntiguaModalidad = idAntiguaModalidad;
		_idNuevaModalidad = idNuevaModalidad;
		_clientes = clientes;
		
		mensajeL.setValue("¿Está seguro que desea traspasar los usuarios a " + nombre + "?");
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				Traspasar_usuarios();
				doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +ids);
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
		
		
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event)
			{
				doNavigate(Modalidad_gestion_administrador.VIEW_NAME +"/" +ids);	
				UI.getCurrent().removeWindow((Window) getParent());
			}
		});
	}
	
	public void Traspasar_usuarios()
	{
		administrador.traspasar_usuarios(_idAntiguaModalidad, _idNuevaModalidad, _clientes);
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}