package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Comercial_administrador extends Comercial_administrador_ventana{
	public Comecial_lista_administrador _unnamed_Comecial_lista_administrador_;
	public Cabecera_vista_comercial _cabecera;
	public Modalidades_destacadas_vista_comercial _modalidadesDestacadas;
	VerticalLayout prueba;
	
		public Comercial_administrador()
		{
			prueba = new VerticalLayout();
			_cabecera = new Cabecera_vista_comercial();
			
			this.addComponent(_cabecera);
			this.addComponent(prueba); //Zona donde se "instanciarán" las subventanas
			
			Navigator navigator = new Navigator(NavigatorUI.getCurrent(), prueba);
			
			//Subventanas a las que se puede acceder
			navigator.addView(Modalidades_destacadas_vista_comercial.VIEW_NAME, Modalidades_destacadas_vista_comercial.class);
			navigator.addView(Television2.VIEW_NAME, Television2.class);
			navigator.addView(Canal2.VIEW_NAME, Canal2.class);
			navigator.addView(Telefono_fijo.VIEW_NAME, Telefono_fijo.class);
			navigator.addView(Movil2.VIEW_NAME, Movil2.class);
			navigator.addView(Internet.VIEW_NAME, Internet.class);
			navigator.addView(Oferta2.VIEW_NAME, Oferta2.class);
			navigator.addView(Perfil_vista_comercial.VIEW_NAME, Perfil_vista_comercial.class);
			navigator.addView(Mis_incidencias_comercial.VIEW_NAME, Mis_incidencias_comercial.class);
			navigator.addView(Incidencia_comercial.VIEW_NAME, Incidencia_comercial.class);
			navigator.addView(Gestion_usuarios_comercial.VIEW_NAME, Gestion_usuarios_comercial.class);
			navigator.addView(Alta_usuario.VIEW_NAME, Alta_usuario.class);
			
			//Como la ventana estaba en Acceder la cambia a modalidades destacadas
			navigator.navigateTo(Modalidades_destacadas_vista_comercial.VIEW_NAME);
			
			if (navigator.getState().isEmpty()) {
		        navigator.navigateTo(Modalidades_destacadas_vista_comercial.VIEW_NAME);
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
							doNavigate(Perfil_vista_comercial.VIEW_NAME);
							break;
							
						case "Mis Incidencias":
							doNavigate(Mis_incidencias_comercial.VIEW_NAME);
							break;
							
						case "Gestión de Usuario":
							doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
							break;
							
						case "Salir Vista Comercial":
							Window subWindow = new Window("Desconectar");	
							subWindow.setModal(true);
							subWindow.setResizable(false);
							subWindow.setContent(new Salir_vista_comercial());
							UI.getCurrent().addWindow(subWindow);
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