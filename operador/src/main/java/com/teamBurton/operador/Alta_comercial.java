package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.ClienteDAO;
import bd.Comercial;
import bd.ComercialDAO;
import bdgui.IAdministrador;

public class Alta_comercial extends Alta_comercial_ventana implements View {
	public Gestion_comerciales _unnamed_Gestion_comerciales_;
	public static final String VIEW_NAME = "alta_comercial";
	private IAdministrador administrador = new BD_Principal();
	
	public Alta_comercial()
	{
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!emailF.getValue().replaceAll("\\s+","").isEmpty())
				{
					alta_cliente();
					doNavigate(Gestion_comerciales.VIEW_NAME);
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event)
			{
				doNavigate(Gestion_comerciales.VIEW_NAME);
				
			}
		});
	}
	
	public void alta_cliente()
	{
		Comercial comercial = ComercialDAO.createComercial();
		comercial.setNombre(nombreF.getValue());
		comercial.setApellidos(apellidosF.getValue());
		comercial.setDireccion(direccionF.getValue());
		comercial.setEmail(emailF.getValue());
		comercial.setNombre(nombreF.getValue());
		comercial.setTelefono(telefonoF.getValue());
		comercial.setNif(dniF.getValue());
		
		administrador.registrar_comercial(comercial);
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}