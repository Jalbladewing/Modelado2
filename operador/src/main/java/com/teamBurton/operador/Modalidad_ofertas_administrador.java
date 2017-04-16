package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_ofertas_administrador extends Modalidad_ofertas_administrador_ventana {
	/*private Label _nombre;
	private Label _precio;
	private CheckBox _visibilidad;
	private Button _contratar;
	private Button _cambiar;*/
	public Modalidades_destacadas_administrador _unnamed_Modalidades_destacadas_administrador_;
	public Cambiar_visibilidad _cambiaVisibilidad;
	public Contratar_modalidad_oferta_administrador _contrata;
	public Cambiar_modalidad_destacada _cambiaModalidad;
	public Vector<Modalidad_individual_generico> _modalidad = new Vector<Modalidad_individual_generico>();
	
	public Modalidad_ofertas_administrador()
	{
		
		visibleCheckBx.addValueChangeListener(new Property.ValueChangeListener() {
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				// TODO Auto-generated method stub
				
				Window subWindow = new Window("Visibilidad");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Cambiar_visibilidad());
				UI.getCurrent().addWindow(subWindow);
				
			}
		});
		
		cambiarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Cambiar_modalidad_destacada.VIEW_NAME);
			}
		});
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}