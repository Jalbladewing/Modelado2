package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Administrador2 extends Administrador2_ventana {
	public Modalidades_destacadas_administrador _modalidadesDestacadas;
	public Cabecera_administrador _cabecera;
    VerticalLayout prueba;
	
	public Administrador2()
	{
		prueba = new VerticalLayout();
		_cabecera = new Cabecera_administrador();
		
		this.addComponent(_cabecera);
		this.addComponent(prueba); //Zona donde se "instanciarán" las subventanas
		
		Navigator navigator = new Navigator(NavigatorUI.getCurrent(), prueba);
		
		//Subventanas a las que se puede acceder
		navigator.addView(Modalidades_destacadas_administrador.VIEW_NAME, Modalidades_destacadas_administrador.class);
		navigator.addView(Television2.VIEW_NAME, Television2.class);
		navigator.addView(Telefono_fijo.VIEW_NAME, Telefono_fijo.class);
		navigator.addView(Movil2.VIEW_NAME, Movil2.class);
		navigator.addView(Internet.VIEW_NAME, Internet.class);
		navigator.addView(Oferta2.VIEW_NAME, Oferta2.class);
		navigator.addView(Perfil_comercial.VIEW_NAME, Perfil_comercial.class);
		navigator.addView(Gestion_incidencias_administrador.VIEW_NAME, Gestion_incidencias_administrador.class);
		navigator.addView(Gestion_usuarios_comercial.VIEW_NAME, Gestion_usuarios_comercial.class);
		navigator.addView(Alta_usuario.VIEW_NAME, Alta_usuario.class);
		navigator.addView(Gestion_comerciales.VIEW_NAME, Gestion_comerciales.class);
		navigator.addView(Gestion_modalidades.VIEW_NAME, Gestion_modalidades.class);
		navigator.addView(Asignar_incidencia.VIEW_NAME, Asignar_incidencia.class);
		navigator.addView(Alta_comercial.VIEW_NAME, Alta_comercial.class);
		navigator.addView(Crear_modalidad_administrador.VIEW_NAME, Crear_modalidad_administrador.class);
		
		//Como la ventana estaba en Acceder la cambia a modalidades destacadas
		navigator.navigateTo(Modalidades_destacadas_administrador.VIEW_NAME);
		
		if (navigator.getState().isEmpty()) {
	        navigator.navigateTo(Modalidades_destacadas_administrador.VIEW_NAME);
		}
	        
		_cabecera.televisionL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Television2.VIEW_NAME);
			} 
		}); 
		

		_cabecera.telefonoL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Telefono_fijo.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.movilL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Movil2.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.internetL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Internet.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.ofertasL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Oferta2.VIEW_NAME);
			} 
		}); 
		
		_cabecera.miCuentaB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				_cabecera.miCuentaLista.setNullSelectionAllowed(false);
				
				if(_cabecera.miCuentaLista.isVisible())
				{
					_cabecera.miCuentaLista.setVisible(false);
				}else
				{
					_cabecera.miCuentaLista.setVisible(true);
				}
				
			} 
		});
		
		_cabecera.miCuentaLista.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				switch ((String)_cabecera.miCuentaLista.getValue())
				{
					case "Perfil":
						doNavigate(Perfil_comercial.VIEW_NAME);
						break;
						
					case "Gestión de Incidencias":
						doNavigate(Gestion_incidencias_administrador.VIEW_NAME);
						break;
						
					case "Gestión de Usuarios":
						doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
						break;
						
					case "Gestión de Comerciales":
						doNavigate(Gestion_comerciales.VIEW_NAME);
						break;
						
					case "Gestión de Modalidades":
						doNavigate(Gestion_modalidades.VIEW_NAME);
						break;
						
					default:
						break;
				}
				
				_cabecera.miCuentaLista.setVisible(false);
				
			}
		});
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}