package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Paquete2 extends Paquete2_ventana {
	/*private Label _listaCanalLabel;
	private Button _contratar;
	private List<Button> _canalesL;*/
	public Television2 _unnamed_Television2_;
	public Vector<Canal2> _canal = new Vector<Canal2>();
	public Contratar_generico _contrata;
	
	public Paquete2()
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