package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Factura;
import bd.Incidencia;
import bdgui.ICliente;
import bdgui.IComercial;

public class Incidencia_cliente extends Incidencia_cliente_ventana implements View {
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
	private Button _cancelarIncidencia;*/
	public Incidencia_lista_cliente _unnamed_Incidencia_lista_cliente_;
	public static final String VIEW_NAME = "incidencia_cliente";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private int idIncidencia;
	private Incidencia incidencia;

	public Incidencia_cliente()
	{
		cancelarL.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				//sin implementar
				
			}
		});
	}
	
	
	public void cargar_incidencia()
	{
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			incidencia = comercial.cargar_incidencia(idIncidencia);
		}else
		{
			incidencia = cliente.cargar_incidencia(idIncidencia);
		}	
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
			observacionArea.setReadOnly(true);
			
			if(!incidencia.getEstado().equals("pendiente")) cancelarL.setEnabled(false);
			
		}
	}
}