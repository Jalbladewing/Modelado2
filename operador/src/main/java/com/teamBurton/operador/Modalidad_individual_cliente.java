package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;

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

import bd.BD_Principal;
import bd.Cliente;
import bd.Modalidad;
import bd.Movil;
import bd.Oferta;
import bd.contrato;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

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
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private Modalidad modalidad;
	private String nombre;
	private Cliente clienteDatos;
	
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
						subWindow.setContent(new Dar_baja_modalidad(modalidad.getID(), clienteDatos.getID(), modalidad.getNombre()));
						UI.getCurrent().addWindow(subWindow);
						
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME + "/" + "bajaModalidad" + ";" + tituloL.getValue());
					}
				}
			});
	}
	
	public void cargar_modalidad_nombre()
	{
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			modalidad = comercial.cargar_modalidad_nombre(nombre);
		
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			modalidad = cliente.cargar_modalidad_nombre(nombre);
			
		}else
		{
			modalidad = administrador.cargar_modalidad_nombre(nombre);
		}
	}

	
	public void darBaja() {
		throw new UnsupportedOperationException();
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			clienteDatos = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
		}else
		{
			clienteDatos = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		}
		
		if(!event.getParameters().isEmpty())
		{
			String[] parametros = event.getParameters().split(";");
			nombre = parametros[0];
			seccionL.setValue(nombre);
			tituloL.setValue(nombre);
			
			cargar_modalidad_nombre();
			
			
			if(modalidad instanceof Movil)
			{
				consumotituloL.setVisible(true);
				consumoValorL.setVisible(true);
				consumoValorL.setValue(((Movil) modalidad).getConsumoActual() + "/" + ((Movil) modalidad).getConsumoMax());
			}			
			
			caracteristicasL.setValue(modalidad.getCaracteristicas());
			precioL.setValue(modalidad.getPrecio() +"€");
			
			obtenerFechaContrato();
		}
		
	}
	
	public void obtenerFechaContrato()
	{
		List<contrato> contratos;
		
		contratos = Arrays.asList(modalidad.contratos.toArray());
		
		for(int i = 0; i < contratos.size(); i++)
		{
			if(contratos.get(i).getModalidad().getID() == modalidad.getID())
			{
				fechaValorL.setValue(contratos.get(i).getFecha().toString());
			}
		}
	}
}