package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_servicio extends Modalidad_servicio_Ventana {
	//private Button _contratar;
	public Telefono_fijo _unnamed_Telefono_fijo_;
	public Movil2 _unnamed_Movil2_;
	public Internet _unnamed_Internet_;
	public Modalidades_destacadas_generico _unnamed_Modalidades_destacadas_generico_;
	public Contratar_generico _contrata;
	
	public Modalidad_servicio()
	{
		Window subWindow = new Window("Contratar");	
		
		
		
		contratarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
				{

					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_cibernauta());
					UI.getCurrent().addWindow(subWindow);
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
				{
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_vista_usuario());
					UI.getCurrent().addWindow(subWindow);
				}
				
			}
		});
		
	}
}