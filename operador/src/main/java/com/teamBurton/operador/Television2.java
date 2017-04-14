package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.w3c.dom.stylesheets.LinkStyle;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Television2 extends Television2_ventana implements View{
	/*private Label _seccion;
	private Button _buscarCanalB;
	private TextField _buscarCanalT;
	private Button _contratarCanales;
	private List _canalesL;*/
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Paquete2> _paquete = new Vector<Paquete2>();
	public Contratar_generico _contrata;
	public Vector<Canal_television> _canal = new Vector<Canal_television>();
	public static final String VIEW_NAME = "television2";
	
	public Television2(){
		  Paquete2 p = new Paquete2(); 
		  List<Button> canales = new ArrayList<Button>();
		  
		  canales.add(new Button("canal 2"));
		  canales.get(0).addStyleName("link");
		  p.canalesGrid.addComponent(canales.get(0));
		  canales.add(new Button("canal 8"));
		  canales.get(1).addStyleName("link");
		  p.canalesGrid.addComponent(canales.get(1));
		  paquetesGrid.addComponent(p);
		  p = new Paquete2(); 
		  canales.add(new Button("canal 8"));
		  canales.get(2).addStyleName("link");
		  p.canalesGrid.addComponent(canales.get(2));
		  paquetesGrid.addComponent(p);
		  
		  for(int i = 0; i < canales.size(); i++)
		  {
			  canales.get(i).addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) 
				{
					// TODO Auto-generated method stub
					doNavigate(Canal2.VIEW_NAME + "/" + event.getButton().getCaption());
					
				}
			});
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