package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_gestion_administrador extends Modalidad_gestion_administrador_ventana implements View {
	/*private Label _seccion;
	private Label _titulo;
	private ComboBox _tipoServicio;
	private Label _nombreTitulo;
	private TextField _nombreValor;
	private Label _caracteristicasTitulo;
	private TextArea _caracteristicasValor;
	private Label _precioTitulo;
	private TextField _precioValor;
	private CheckBox _visibilidad;
	private Button _cancelar;
	private Button _confirmar;
	private Button _traspasarUsuario;
	private Button _eliminar;*/
	public Modalidad_lista_gestion_administrador _unnamed_Modalidad_lista_gestion_administrador_;
	public Modalidad_individual_modificacion _individual;
	public Modalidad_oferta_television_modificar _ofertaTelevision;
	public static final String VIEW_NAME = "modalidad_gestion_administrador";
		
	public Modalidad_gestion_administrador()
	{
		tipoModalidadComboBx.setNullSelectionAllowed(false);
		ofertasLayout.addComponent(new Crear_modalidad_oferta_television());
		
		tipoModalidadComboBx.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				// TODO Auto-generated method stub
				if(tipoModalidadComboBx.getValue().equals("Individual"))
				{
					ofertasLayout.setVisible(false);
				}else if(tipoModalidadComboBx.getValue().equals("Oferta"))
				{
					ofertasLayout.setVisible(true);
				}
			}
		});
		
		eliminarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				Window subWindow = new Window("Eliminar");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Eliminar_modalidad_administrador());
				UI.getCurrent().addWindow(subWindow);
			}
		});
		
		traspasarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Traspasar_usuarios_administrador.VIEW_NAME);
			}
		});
	}

	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			nombreF.setValue(event.getParameters());
		}
	}
	
}