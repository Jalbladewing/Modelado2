package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_oferta_generico extends Modalidad_oferta_generico_ventana {
/*	private Label _nombre;
	private Label _precio;
	private Button _contratar;*/
	public Oferta2 _unnamed_Oferta2_;
	public Modalidades_destacadas_generico _unnamed_Modalidades_destacadas_generico_;
	public Vector<Modalidad_individual_generico> _modalidad = new Vector<Modalidad_individual_generico>();
	public Contratar_generico _contrata;
	
	public Modalidad_oferta_generico()
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