package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Incidencia;
import bdgui.IAdministrador;

public class Incidencia_administrador2 extends Incidencia_administrador2_ventana  implements View 
{
	public incidencia_lista_administrador _unnamed_incidencia_lista_administrador_;
	public static final String VIEW_NAME = "incidencia_administrador";
	private IAdministrador administrador = new BD_Principal();
	private int idIncidencia;
	private Incidencia incidencia;

	public Incidencia_administrador2()
	{
		resolverB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				resolver_incidencia();
				doNavigate(Gestion_incidencias_administrador.VIEW_NAME);
			}
		});
		
		atrasB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Gestion_incidencias_administrador.VIEW_NAME);
			}
		});
	}
	
	public void cargar_incidencia()
	{

		incidencia = administrador.cargar_incidencia(idIncidencia);
		
	}
	
	public void resolver_incidencia()
	{
		administrador.resolver_incidencia(idIncidencia, observacionArea.getValue());
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
					idIncidencia = Integer.parseInt(event.getParameters());
					
					cargar_incidencia();
					
					seccionL.setValue(idIncidencia +"_" +incidencia.getAsunto());
					tipoIncidenciaComboBx.addItems(incidencia.getTipoIncidencia());
					tipoIncidenciaComboBx.setValue(incidencia.getTipoIncidencia());
					correoF.setValue(incidencia.getCorreoCliente());
					asuntoF.setValue(incidencia.getAsunto());
					descripcionArea.setValue(incidencia.getDescripcion());
					observacionArea.setValue(incidencia.getObservacion());
					estadoValorL.setValue(incidencia.getEstado());
					
					tipoIncidenciaComboBx.setReadOnly(true);
					correoF.setReadOnly(true);
					asuntoF.setReadOnly(true);
					descripcionArea.setReadOnly(true);
					
					
					if(!incidencia.getEstado().equals("pendiente"))
					{
						observacionArea.setReadOnly(true);
						resolverB.setEnabled(false);
					}
				}	
	}
}