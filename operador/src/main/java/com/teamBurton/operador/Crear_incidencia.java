package com.teamBurton.operador;

import java.math.BigDecimal;
import java.util.Date;

import com.vaadin.data.util.sqlcontainer.RowId;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Cliente;
import bd.Incidencia;
import bd.IncidenciaDAO;
import bd.Incidencia_administrador;
import bd.Incidencia_administradorDAO;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

public class Crear_incidencia extends Crear_incidencia_ventana implements View {
	/*private Label _seccion;
	private Label _tituloIncidencia;
	private Label _tituloTipoIncidencia;
	private ComboBox _valorTipoIncidencia;
	private Label _tipoCorreo;
	private TextField _valorCorreo;
	private Label _tituloAsunto;
	private TextField _valorAsunto;
	private Label _tituloDescripcion;
	private TextArea _valorDescripcion;
	private Button _confirmar;
	private Button _cancelar;*/
	public Modalidad_individual_cliente _unnamed_Modalidad_individual_cliente_;
	public Modalidad_oferta_cliente _unnamed_Modalidad_oferta_cliente_;
	public Contratar_cliente _unnamed_Contratar_cliente_;
	public Mis_incidencias_cliente _unnamed_Mis_incidencias_cliente_;
	public static final String VIEW_NAME = "crear_incidencia";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Crear_incidencia()
	{
		tipoComboBx.removeAllItems();
		tipoComboBx.addItems("contratacion", "bajaModalidad", "bajaCuenta", "cancelarBajaCuenta", "modificarDatos", "reclamacion", "otros");
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			
			correoF.setValue(((NavigatorUI) UI.getCurrent()).getUsuario().getEmail());
			
		}else
		{
			correoF.setValue(((NavigatorUI) UI.getCurrent()).getVistaCliente().getEmail());
		}
		
		
		correoF.setReadOnly(true);
		
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(tipoComboBx.getValue() != null && !asuntoF.getValue().replaceAll("\\s+","").isEmpty())
				{
					registrar_incidencia();
					doNavigate(Mis_incidencias_cliente.VIEW_NAME);
				}else
				{
					errorL.setVisible(true);
				}
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				doNavigate(Mis_incidencias_cliente.VIEW_NAME);
				
			}
		});
		
	}
	
	public void registrar_incidencia()
	{
		Cliente clienteIncidencia;
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			clienteIncidencia = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
		}else
		{
			clienteIncidencia = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		}
		
		Incidencia_administrador incidencia = Incidencia_administradorDAO.createIncidencia_administrador();
		incidencia.setAsunto(asuntoF.getValue());
		incidencia.setCliente(clienteIncidencia);
		incidencia.setAdministrador(clienteIncidencia.getAdministrador());
		incidencia.setCorreoComercial("Sin Asignar");
		incidencia.setComercial(null);
		incidencia.setFecha(new Date());
		incidencia.setCorreoCliente(clienteIncidencia.getEmail());
		incidencia.setDescripcion(descripcionArea.getValue());
		incidencia.setEstado("pendiente");
		incidencia.setObservacion("");
		incidencia.setTipoIncidencia((String) tipoComboBx.getValue());
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			comercial.registrar_incidencia(incidencia);
			
			clienteIncidencia.incidencia.add(incidencia);
			
			((NavigatorUI) UI.getCurrent()).setVistaCliente(clienteIncidencia);
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			cliente.registrar_incidencia(incidencia);
			
			clienteIncidencia.incidencia.add(incidencia);
			
			((NavigatorUI) UI.getCurrent()).setUsuario(clienteIncidencia);
		}else
		{
			administrador.registrar_incidencia(incidencia);
			
			clienteIncidencia.incidencia.add(incidencia);
			
			((NavigatorUI) UI.getCurrent()).setVistaCliente(clienteIncidencia);
		}
		
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		String[] parametros;
		String incidenciaElegida;
		String modalidad;
		// TODO Auto-generated method stub
		if(!event.getParameters().isEmpty())
		{
			parametros = event.getParameters().split(";");
			incidenciaElegida = parametros[0];
			modalidad = parametros[1];
			
			if(!incidenciaElegida.isEmpty()) tipoComboBx.setValue(incidenciaElegida);
			if(!modalidad.isEmpty()) asuntoF.setValue(modalidad);
		}
		
	}
}