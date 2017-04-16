package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_individual_cliente extends Modalidad_individual_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _tituloFechaContratacion;
	private Label _valorFechaContratacion;
	private Label _tituloConsumo;
	private Label _valorConsumo;
	private Button _baja;*/
	public Servicio _unnamed_Servicio_;
	public Crear_incidencia _creaIncidencia;
	public static final String VIEW_NAME = "modalidad_individual_cliente";
	
	public Modalidad_individual_cliente()
	{
		  bajaB.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) 
				{
					// TODO Auto-generated method stub
					if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
					{
						Window subWindow = new Window("Baja Modalidad");	
						subWindow.setModal(true);
						subWindow.setResizable(false);
						subWindow.setContent(new Dar_baja_modalidad());
						UI.getCurrent().addWindow(subWindow);
						
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME);
					}
				}
			});
	}
	
	public void darBaja() {
		throw new UnsupportedOperationException();
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			tituloL.setValue(event.getParameters());
		}
		
	}
}