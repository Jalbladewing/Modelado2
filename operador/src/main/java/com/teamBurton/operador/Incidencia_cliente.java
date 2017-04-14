package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

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