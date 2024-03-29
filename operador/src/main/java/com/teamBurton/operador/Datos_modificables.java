package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window.CloseEvent;

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
				
				subWindow.addCloseListener(new Window.CloseListener() 
				{
					
					@Override
					public void windowClose(CloseEvent e) 
					{

						 if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
						 {
							 if(tituloL.getValue().equals("Nombre"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getNombre());
									
								}else if(tituloL.getValue().equals("Apellidos"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getApellidos());
									
								}else if(tituloL.getValue().equals("Dirección"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getDireccion());
									
								}else if(tituloL.getValue().equals("Telefono"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getTelefono());
									
								}else if(tituloL.getValue().equals("DNI/NIF/Pasaporte"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getNif());
								}
							 
						 }else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Comercial"))
						 {
							 
							 if(tituloL.getValue().equals("Nombre"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaComercial().getNombre());
									
								}else if(tituloL.getValue().equals("Apellidos"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaComercial().getApellidos());
									
								}else if(tituloL.getValue().equals("Dirección"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaComercial().getDireccion());
									
								}else if(tituloL.getValue().equals("Telefono"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaComercial().getTelefono());
									
								}else if(tituloL.getValue().equals("DNI/NIF/Pasaporte"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getVistaComercial().getNif());
								}
							 
						 }else
						 {
							 if(tituloL.getValue().equals("Nombre"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getUsuario().getNombre());
									
								}else if(tituloL.getValue().equals("Apellidos"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getUsuario().getApellidos());
									
								}else if(tituloL.getValue().equals("Dirección"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getUsuario().getDireccion());
									
								}else if(tituloL.getValue().equals("Telefono"))
								{
									valorL.setValue(((NavigatorUI) UI.getCurrent()).getUsuario().getTelefono());
								}
						 }
						
						
						
					}
				});
			}
		});
		
		
	}
}