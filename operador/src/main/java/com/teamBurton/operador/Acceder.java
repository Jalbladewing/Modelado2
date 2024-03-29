package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.Administrador;
import bd.BD_Principal;
import bd.Cliente;
import bd.Comercial;
import bd.Usuario;
import bdgui.ICibernauta;

public class Acceder extends Acceder_ventana implements View {
	/*private Label _seccion;
	private Label _acceso;
	private Label _usuarioL;
	private TextField _usuarioT;
	private Label _passwordL;
	private TextField _passwordT;
	private CheckBox _recordarC;
	private Label _recordarL;
	private Button _iniciarSesion;*/
	public Cabecera_cibernauta _unnamed_Cabecera_cibernauta_;
	public static final String VIEW_NAME = "acceder";
	private ICibernauta cibernauta = new BD_Principal();
	
	public Acceder()
	{
		//Esto debería estar en Cibernauta
		recuperarPassB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Recuperar_password.VIEW_NAME);
			} 
		}); 
		
		iniciarSesionB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				
				iniciarSesion();
				
			}
		});
	}
	
	public void iniciarSesion()
	{
		Usuario usuario = cibernauta.iniciar_sesion(usuarioF.getValue().toLowerCase(), passwordF.getValue());
		
		if(usuario instanceof Cliente)
		{
			((NavigatorUI) UI.getCurrent()).setUsuario(usuario);
			UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
			UI.getCurrent().getNavigator().destroy();
			((NavigatorUI) UI.getCurrent()).setMainView("Cliente");
			((NavigatorUI) UI.getCurrent()).setParentView("");
			NavigatorUI.getCurrent().setContent(new Cliente2());	
		
		}else if(usuario instanceof Comercial)
		{
			((NavigatorUI) UI.getCurrent()).setUsuario(usuario);
			UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
			UI.getCurrent().getNavigator().destroy();
			((NavigatorUI) UI.getCurrent()).setMainView("Comercial");
			((NavigatorUI) UI.getCurrent()).setParentView("Comercial");
			NavigatorUI.getCurrent().setContent(new Comercial2());	
			
		}else if(usuario instanceof Administrador)
		{
			((NavigatorUI) UI.getCurrent()).setUsuario(usuario);
			UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
			UI.getCurrent().getNavigator().destroy();
			((NavigatorUI) UI.getCurrent()).setMainView("Administrador");
			((NavigatorUI) UI.getCurrent()).setParentView("Administrador");
			NavigatorUI.getCurrent().setContent(new Administrador2());	
		}
		else{
			errorL.setVisible(true);
		}
	}
	
	//Esto debería estar en Cibernauta
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}