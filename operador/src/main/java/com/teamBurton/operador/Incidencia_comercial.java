package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Incidencia;
import bdgui.IComercial;

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
	private IComercial comercial = new BD_Principal();
	private int idIncidencia;
	private Incidencia incidencia;
	
	public Incidencia_comercial()
	{
		resolverB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				resolver_incidencia();
				doNavigate(Mis_incidencias_comercial.VIEW_NAME);
			}
		});
		
		atrasB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Mis_incidencias_comercial.VIEW_NAME);
			}
		});
	}
	
	public void cargar_incidencia()
	{

		incidencia = comercial.cargar_incidencia(idIncidencia);
		
	}
	
	public void resolver_incidencia()
	{
		comercial.resolver_incidencia(idIncidencia, observacionArea.getValue());
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