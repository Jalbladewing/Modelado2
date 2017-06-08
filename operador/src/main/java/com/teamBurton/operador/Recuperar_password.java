package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bdgui.ICibernauta;

public class Recuperar_password extends Recuperar_password_ventana implements View {
	/*private Label _seccion;
	private Label _recuperarPasswordL;
	private TextField _recuperarPasswordT;
	private Button _enviarCorreo;*/
	public Acceder _unnamed_Acceder_;
	public Gestor_correo _unnamed_Gestor_correo_;
	public static final String VIEW_NAME = "recuperar_password";
	private ICibernauta cibernauta = new BD_Principal();

	public Recuperar_password()
	{
		enviarCorreoB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!usuarioF.getValue().replaceAll("\\s+","").isEmpty())
				{
					recuperar_password();	
				}
				
			}
		});
		
	}
	
	public void recuperar_password() 
	{
		cibernauta.recuperar_password(usuarioF.getValue());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}