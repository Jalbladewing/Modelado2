package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mis_servicios extends Mis_servicios_ventana implements View {
	//private Label _seccion;
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Servicio> _servicio = new Vector<Servicio>();
	public static final String VIEW_NAME = "mis_servicios";
	
	public Mis_servicios(){
		Servicio s = new Servicio();
		List<Button> ofertas = new ArrayList<Button>();
		List<Button> modalidades = new ArrayList<Button>();
		
		ofertas.add(new Button("Llamadas baratas + 100MB"));
		modalidades.add(new Button("Amigos gratis"));
		
		ofertas.get(0).addStyleName("link");
		modalidades.get(0).addStyleName("link");
		 s.vLayoutModalidadesB.addComponent(ofertas.get(0));
		 s.vLayoutModalidadesB.addComponent(modalidades.get(0));
		 s.noServiciosL.setVisible(false);
		 serviciosGrid.addComponent(s);
		 
		 s = new Servicio();
		 s.tituloL.setValue("Televisión");
		 serviciosGrid.addComponent(s);
		 
		 s = new Servicio();
		 s.tituloL.setValue("Internet");
		 serviciosGrid.addComponent(s);
		
		 s = new Servicio();
		 s.tituloL.setValue("Móvil");
		 serviciosGrid.addComponent(s);
		
		for(int i = 0; i < ofertas.size(); i++)
		{
			ofertas.get(i).addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) 
				{
					doNavigate(Modalidad_oferta_cliente.VIEW_NAME + "/" + event.getButton().getCaption());
					
				}
			});
		}
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			modalidades.get(i).addClickListener(new Button.ClickListener() 
			{
				
				@Override
				public void buttonClick(ClickEvent event) 
				{
					// TODO Auto-generated method stub
					doNavigate(Modalidad_individual_cliente.VIEW_NAME + "/" + event.getButton().getCaption());
				}
			});
		}
	}
	
	//Esto debería estar en Cliente
	private void doNavigate(String viewName) {
		UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}