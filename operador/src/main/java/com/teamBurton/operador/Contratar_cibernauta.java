package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bdgui.ICibernauta;

public class Contratar_cibernauta extends Contratar_cibernauta_ventana {
	/*private TextArea _mensaje;
	private Label _teledonoL;
	private TextField _telefonoT;
	private Button _confirmar;
	private Button _cancelar;*/
	public Cibernauta _unnamed_Cibernauta_;
	private ICibernauta cibernauta = new BD_Principal();

	public Contratar_cibernauta(String nombreModalidad)
	{
		mensajeL.setValue("Si desea contratar la modalidad " + nombreModalidad +" introduzca su número de teléfono a continuación, le llamaremos para pedir sus datos");
	
		confirmarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				String telefono = telefonoF.getValue().replaceAll("\\s+","");
				
				if(!telefono.isEmpty())
				{
					solicitarLlamada(telefono);
				}
				
				UI.getCurrent().removeWindow((Window) getParent());
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				UI.getCurrent().removeWindow((Window) getParent());
				
			}
		});
	}
	
	public void solicitarLlamada(String numero) 
	{
		cibernauta.registrar_incidencia_llamada(numero);
	}
}