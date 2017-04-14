package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Traspasar_usuarios_administrador extends Traspasar_usuarios_administrador_ventana implements View {
	/*private Label _seccion;
	private Button _cancelar;
	private Button _elegirModalidad;
	private List _usuariosL;*/
	public Modalidad_individual_modificacion _unnamed_Modalidad_individual_modificacion_;
	public Modalidad_oferta_television_modificar _unnamed_Modalidad_oferta_television_modificar_;
	public Modalidades_eleccion _modalidadesEleccion;
	public Usuario_lista _unnamed_Usuario_lista_;
	public static final String VIEW_NAME = "traspasar_usuarios_administrador";
	
	public Traspasar_usuarios_administrador()
	{
		elegirModalidadB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				doNavigate(Modalidades_eleccion.VIEW_NAME);
			}
		});
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}