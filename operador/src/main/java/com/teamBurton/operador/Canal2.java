package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Canal2 extends Canal2_ventana implements View
{
	/*private Label _seccion;
	private Button _contratar;*/
	public Paquete2 _unnamed_Paquete2_;
	public Contratar_generico _contrata;
	public static final String VIEW_NAME = "canal2";


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			canalL.setValue(event.getParameters());
		}
	}
}