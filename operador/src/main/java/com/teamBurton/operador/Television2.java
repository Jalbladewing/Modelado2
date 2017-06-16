package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.w3c.dom.stylesheets.LinkStyle;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

import bd.BD_Principal;
import bd.Canal;
import bd.Cliente;
import bd.Modalidad;
import bd.Paquete;
import bd.contrato;
import bdgui.IAdministrador;
import bdgui.ICibernauta;
import bdgui.ICliente;
import bdgui.IComercial;

public class Television2 extends Television2_ventana implements View{
	/*private Label _seccion;
	private Button _buscarCanalB;
	private TextField _buscarCanalT;
	private Button _contratarCanales;
	private List _canalesL;*/
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Paquete2> _paquete = new Vector<Paquete2>();
	public Contratar_generico _contrata;
	public Vector<Canal_television> _canal = new Vector<Canal_television>();
	public static final String VIEW_NAME = "television2";
	private ICibernauta cibernauta = new BD_Principal();
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	private List<Canal> listaCanales;
	private List<Integer> canalesId;
	private List canalesSeleccionados;
	private String canalesNombreCadena;
	private boolean contratado = false;
	
	public Television2()
	{
		Window subWindow = new Window("Contratar");	
		
		cargar_modalidades_television();
		
		contratarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				canalesSeleccionados = Arrays.asList(canalesTabla.getSelectedRows().toArray());
				obtenerCanales();
				
				if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
				{

					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_cibernauta(canalesNombreCadena));
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
				{
					
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_vista_usuario(canalesNombreCadena, contratado, canalesId));
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
				{
					
					if(contratado || canalesId.isEmpty())
					{
						subWindow.setModal(true);
						subWindow.setResizable(false);
						subWindow.setContent(new Contratar_cliente(canalesNombreCadena));
						UI.getCurrent().addWindow(subWindow);
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME + "/" + "contratacion" +";" +canalesNombreCadena);
					}
							
				}
				
			}
		});
		  
	}
	
	
	public void cargar_modalidades_television()
	{
		//Cargar paquetes
		List<Paquete> paquetes;
		List<Canal> canales;
		listaCanales = new ArrayList<Canal>();
		Paquete paquete;
		Paquete2 paqueteL;//"layout"
		Button canal;
		
		
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
		{
			paquetes = cibernauta.cargar_paquetes();
			
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			paquetes = comercial.cargar_paquetes();
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			paquetes = cliente.cargar_paquetes();
			
		}else
		{
			paquetes = administrador.cargar_paquetes();
		}
		
		for(int i = 0; i < paquetes.size(); i++)
		{
			if(!paquetes.get(i).getVisibilidad()) continue;
			paqueteL = new Paquete2(paquetes.get(i).getID());
			paquete = paquetes.get(i);
			paqueteL.tituloL.setValue(paquete.getNombre());
			paqueteL.caracteristicasL.setValue(paquete.getCaracteristicas());
			paqueteL.precioL.setValue(paquete.getPrecio()+"€");
			
			canales = Arrays.asList(paquete.modalidad.toArray());
			
			for(int j = 0; j < canales.size(); j++)
			{
				canal = new Button(canales.get(j).getNombre());
				canal.addStyleName("link");
				paqueteL.canalesGrid.addComponent(canal);
				
				canal.addClickListener(new Button.ClickListener() 
				{
					
					@Override
					public void buttonClick(ClickEvent event) 
					{
						doNavigate(Canal2.VIEW_NAME + "/" + event.getButton().getCaption());
						
					}
				});
			}
			
			paquetesGrid.addComponent(paqueteL);
		}
		
		
		//Cargar canales
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
		{
			canales = cibernauta.cargar_canales();
			
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			canales = comercial.cargar_canales();
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			canales = cliente.cargar_canales();
			
		}else
		{
			canales = administrador.cargar_canales();
		}
		
		for(int i = 0; i < canales.size(); i++)
		{
			if(!canales.get(i).getVisibilidad()) continue;
			listaCanales.add(canales.get(i));
			canalesTabla.addRow(canales.get(i).getNombre(),canales.get(i).getCaracteristicas(),canales.get(i).getPrecio()+"€");
		}
		
	}
	
	public void obtenerCanales()
	{
		Cliente cliente;
		List<contrato> contratos = null;
		Object rowId;
		int id;
		contratado = false;
		canalesNombreCadena = "";
		canalesId = new ArrayList<Integer>();
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
			contratos = Arrays.asList(cliente.contratos.toArray());
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
			contratos = Arrays.asList(cliente.contratos.toArray());
		}
		
	
		
		for(int i = 0; i < canalesSeleccionados.size(); i++)
		{
			rowId = canalesSeleccionados.get(i);
			id = (Integer) rowId;
			canalesNombreCadena +=  canalesTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nombre").getValue().toString();
			canalesId.add(listaCanales.get(id-1).getID());
			
			 if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente") || ((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
			 {
				 for(int j = 0; j < contratos.size(); j++)
				 {
					 if(contratos.get(j).getModalidad().getID() == listaCanales.get(id-1).getID())
					 {
							contratado = true;
							canalesNombreCadena = canalesTabla.getContainerDataSource().getItem(rowId).getItemProperty("Nombre").getValue().toString();
							break;
					 }
				 }
			 }
			 
			 if(contratado) break;
			
			if(i < canalesSeleccionados.size()-1) canalesNombreCadena += ", ";
		}
	}
	//Esto debería estar en Cibernauta
		private void doNavigate(String viewName) {
		    UI.getCurrent().getNavigator().navigateTo(viewName);
		}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}