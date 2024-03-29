package com.teamBurton.operador;

import java.util.List;
import java.util.Vector;

import com.vaadin.data.Property;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Factura;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

public class Mis_facturas extends Mis_facturas_ventana implements View {
	/*private Label _seccion;
	private List _facturasL;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Factura_Lista> _factura = new Vector<Factura_Lista>();
	public static final String VIEW_NAME = "mis_facturas";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private List<Factura> facturas;
	
	public Mis_facturas()
	{
		cargar_facturas();
		
		facturasGrid.setImmediate(true);
		
		facturasGrid.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id = (int) rowId;
				
				doNavigate(Factura2.VIEW_NAME + "/" + facturas.get(id-1).getID() );
				
			}
		});
	}
	
	public void cargar_facturas()
	{
		//Según si estamos en vista cliente o en cliente.
		if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			facturas = comercial.cargar_facturas(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Administrador") || (((NavigatorUI) UI.getCurrent()).getParentView().equals("Vista_Comercial")))
		{
			
			facturas = administrador.cargar_facturas(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else
		{
			facturas = cliente.cargar_facturas(((NavigatorUI) UI.getCurrent()).getUsuario().getID());
		}
		
		for(int i = 0; i < facturas.size(); i++)
		{
			facturasGrid.addRow(facturas.get(i).getFecha().toString(),facturas.get(i).getNombre(),facturas.get(i).getPrecioTotal()+"€");
		}
	}
	
	//Esto debería estar en Cliente
		private void doNavigate(String viewName) 
		{
			UI.getCurrent().getNavigator().navigateTo(viewName);
		}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}