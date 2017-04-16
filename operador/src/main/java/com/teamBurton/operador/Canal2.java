package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Canal2 extends Canal2_ventana implements View
{
	/*private Label _seccion;
	private Button _contratar;*/
	public Paquete2 _unnamed_Paquete2_;
	public Contratar_generico _contrata;
	public static final String VIEW_NAME = "canal2";

	
	public Canal2()
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

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			canalL.setValue(event.getParameters());
		}
	}
}