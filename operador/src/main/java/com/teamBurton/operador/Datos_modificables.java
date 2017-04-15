package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Datos_modificables extends Datos_modificables_ventana{
	/*private Label _titloCampo;
	private Label _valorCampo;
	private Button _modificarCampo;*/
	public Perfil_cliente _unnamed_Perfil_cliente_;
	public Modificar_datos _modifica;
	
	public Datos_modificables()
	{
		modificarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				Window subWindow = new Window("Modificación");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Modificar_datos(tituloL.getValue() , valorL.getValue()));
				UI.getCurrent().addWindow(subWindow);
			}
		});
	}
}