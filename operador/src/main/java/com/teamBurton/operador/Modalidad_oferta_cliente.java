package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Cliente;
import bd.Modalidad;
import bd.Oferta;
import bd.contrato;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_oferta_cliente extends Modalidad_oferta_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _nombre;
	private Label _precio;
	private Label _tituloFechaContratacion;
	private Label _valorFechaContratacion;
	private Button _baja;*/
	public Servicio _unnamed_Servicio_;
	public Vector<Modalidad_individual_generico> _modalidad = new Vector<Modalidad_individual_generico>();
	public Crear_incidencia _creaIncidencia;
	public static final String VIEW_NAME = "modalidad_oferta_cliente";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private Oferta oferta;
	private String nombre;
	private Cliente clienteDatos;

	public Modalidad_oferta_cliente()
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
						subWindow.setContent(new Dar_baja_modalidad(oferta.getID(), clienteDatos.getID(), oferta.getNombre()));
						UI.getCurrent().addWindow(subWindow);
						
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME + "/" + "bajaModalidad" + ";" + tituloL.getValue());
					}
				}
			});
	      	       
	}
	
	public void cargar_modalidad_oferta()
	{
			if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
			{
				oferta = comercial.cargar_modalidad_oferta(nombre);
			
			}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
			{
				oferta = cliente.cargar_modalidad_oferta(nombre);
				
			}else
			{
				oferta = administrador.cargar_modalidad_oferta(nombre);
			}
	}
	
	public void darBaja() {
		throw new UnsupportedOperationException();
	}

	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			clienteDatos = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
		}else
		{
			clienteDatos = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		}
		
		if(!event.getParameters().isEmpty())
		{
			Modalidad_individual_generico mi;
			List<Modalidad> modalidades;
			nombre = event.getParameters();
			
			cargar_modalidad_oferta();
			
			seccionL.setValue(event.getParameters());
			tituloL.setValue(event.getParameters());
			precioL.setValue(oferta.getPrecio() +"€");
			
			obtenerFechaContrato();
			
			modalidades = Arrays.asList(oferta.modalidad.toArray());
			
			for(int i = 0; i < modalidades.size(); i++)
			{
				mi = new Modalidad_individual_generico();
				mi.tituloL.setValue(modalidades.get(i).getNombre());
				mi.caracteristicasL.setValue(modalidades.get(i).getCaracteristicas());
				mi.precioL.setValue(modalidades.get(i).getPrecio()+"€");
				hLayoutModalidades.addComponent(mi);
			}
			
		}
	}
	
	public void obtenerFechaContrato()
	{
		List<contrato> contratos;
		
		contratos = Arrays.asList(oferta.contratos.toArray());
		
		for(int i = 0; i < contratos.size(); i++)
		{
			if(contratos.get(i).getModalidad().getID() == oferta.getID())
			{
				fechaValorL.setValue(contratos.get(i).getFecha().toString());
			}
		}
	}
}