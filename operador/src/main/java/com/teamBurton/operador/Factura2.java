package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Factura;
import bd.Modalidad;
import bd.Movil;
import bdgui.ICliente;
import bdgui.IComercial;

public class Factura2 extends Factura2_ventana implements View {
	/*private Label _seccion;
	private Label _tituloFactura;
	private Label _tituloFecha;
	private Label _valorFecha;
	private Label _tituloNombre;
	private Label _valorNombre;
	private Label _tituloApellidos;
	private Label _valorApellidos;
	private Label _tituloNif;
	private Label _valorNif;
	private Label _tituloTelefono;
	private Label _valorTelefono;
	private Label _tituloDireccion;
	private Label _valorDireccion;
	private Label _tituloPrecioTotal;
	private Label _valorPrecioTotal;
	private Button _imprimir;
	private List _modalidadesContratadas;*/
	public Factura_Lista _unnamed_Factura_Lista_;
	public Vector<Modalidad_contratada> _modalidad = new Vector<Modalidad_contratada>();
	public static final String VIEW_NAME = "factura2";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private int idFactura;
	private Factura factura;
	
	public Factura2()
	{

	}
	
	public void cargar_factura()
	{
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			factura = comercial.cargar_factura(idFactura);
		}else
		{
			factura = cliente.cargar_factura(idFactura);
		}	
	}
	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		List<Modalidad> modalidades;
		Movil movil;
		double iva;
		double total = 0.0;
		
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			idFactura = Integer.parseInt(event.getParameters());
			
			cargar_factura();
			
			seccionL.setValue(factura.getNombre());
			tituloL.setValue(factura.getNombre());
			fechaValorL.setValue(factura.getFecha().toString());
			nombreValorL.setValue(factura.getNombreCliente());
			apellidosValorL.setValue(factura.getApellidosCliente());
			dniValorL.setValue(factura.getNifCliente());
			telefonoValorL.setValue(factura.getTelefonoCliente());
			direccionValorL.setValue(factura.getDireccionCliente());
			
			modalidades = Arrays.asList(factura.modalidad.toArray());
			
			for(int i = 0; i < modalidades.size(); i++)
			{
				if(modalidades.get(i).getTipo().equals("movil"))
				{
					movil = (Movil) modalidades.get(i);
					iva = movil.getPrecio() * 0.24;
					modalidadesTabla.addRow(movil.getTipo(), movil.getNombre(), movil.getConsumoActual() +"", movil.getPrecio() +"€", iva +"€", (movil.getPrecio() + iva) +"€");
				}else
				{
					iva = modalidades.get(i).getPrecio() * 0.24;
					modalidadesTabla.addRow(modalidades.get(i).getTipo(), modalidades.get(i).getNombre(), "-", modalidades.get(i).getPrecio() +"€", iva +"€", (modalidades.get(i).getPrecio() + iva) +"€");
				}
				
				total += modalidades.get(i).getPrecio() + iva;
			}
			
			totalValorL.setValue(total+"€");
			
		}
		
	}
}