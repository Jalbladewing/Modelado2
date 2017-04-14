package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Incidencia_comercial extends Incidencia_comercial_ventana implements View {
	/*private Label _seccion;
	private Label _tituloIncidencia;
	private Label _tituloTipoIncidencia;
	private ComboBox _valorTipoIncidencia;
	private Label _tituloCorreo;
	private TextField _valorCorreo;
	private Label _tituloAsunto;
	private TextField _valorAsunto;
	private Label _tituloDescripcion;
	private TextArea _valorDescripcion;
	private Label _tituloObservacion;
	private TextArea _valorObservacion;
	private Label _tituloEstado;
	private Label _valorEstado;
	private Button _resolver;
	private Button _atras;*/
	public Incidencia_lista_comercial _unnamed_Incidencia_lista_comercial_;
	public static final String VIEW_NAME = "incidencia_comercial";
	
	public Incidencia_comercial()
	{
		atrasB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Mis_incidencias_comercial.VIEW_NAME);
			}
		});
	}
	
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		// TODO Auto-generated method stub
				if(event.getParameters() != null)
				{
					seccionL.setValue(event.getParameters());
					incidenciaL.setValue(event.getParameters());
				}
		
	}
}