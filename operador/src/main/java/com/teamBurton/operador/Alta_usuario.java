package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.ClienteDAO;
import bdgui.IComercial;

public class Alta_usuario extends Alta_usuario_ventana implements View {
	/*private Label _seccion;
	private Label _tituloAltaUsuario;
	private Label _tituloNombre;
	private TextField _valorNombre;
	private Label _tituloApellidos;
	private TextField _valorApellidos;
	private Label _tituloNif;
	private TextField _valorNif;
	private Label _tituloDireccion;
	private TextField _valorDireccion;
	private Label _tituloTelefono;
	private TextField _valorTelefono;
	private Label _tituloEmail;
	private TextField _valorEmail;
	private Button _confirmar;
	private Button _cancelar;*/
	public Gestion_usuarios_comercial _unnamed_Gestion_usuarios_comercial_;
	public static final String VIEW_NAME = "alta_usuario";
	private IComercial comercial = new BD_Principal();

	public Alta_usuario()
	{
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!emailF.getValue().replaceAll("\\s+","").isEmpty())
				{
					alta_cliente();
					doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event)
			{
				doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
				
			}
		});
	}
	
	public void alta_cliente()
	{
		Cliente cliente = ClienteDAO.createCliente();
		cliente.setNombre(nombreF.getValue());
		cliente.setApellidos(apellidosF.getValue());
		cliente.setDireccion(direccionF.getValue());
		cliente.setEmail(emailF.getValue());
		cliente.setNombre(nombreF.getValue());
		cliente.setTelefono(telefonoF.getValue());
		cliente.setNif(dniF.getValue());
		
		comercial.registrar_cliente(cliente);
		//POR TERMINAR
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}