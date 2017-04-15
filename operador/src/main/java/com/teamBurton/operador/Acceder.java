package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

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
				
				//PARA PROBAR NAVEGABILIDAD
				if((usuarioF.getValue().toLowerCase()).equals("cliente"))
				{
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Cliente");
					NavigatorUI.getCurrent().setContent(new Cliente2());	
				}
				
				if((usuarioF.getValue().toLowerCase()).equals("comercial"))
				{
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Comercial");
					NavigatorUI.getCurrent().setContent(new Comercial2());	
				}
				
				if((usuarioF.getValue().toLowerCase()).equals("administrador"))
				{
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Administrador");
					NavigatorUI.getCurrent().setContent(new Administrador2());	
				}
				
			}
		});
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