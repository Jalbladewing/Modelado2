package com.teamBurton.operador;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Incidencia_administrador2_ventana extends VerticalLayout {
	protected Label seccionL;
	protected VerticalLayout vLayout;
	protected Label incidenciaL;
	protected Label tipoIncidenciaL;
	protected ComboBox tipoIncidenciaComboBx;
	protected Label correoL;
	protected TextField correoF;
	protected Label asuntoL;
	protected TextField asuntoF;
	protected Label descripcionL;
	protected TextArea descripcionArea;
	protected Label observacionL;
	protected TextArea observacionArea;
	protected HorizontalLayout hLayoutEstado;
	protected Label estadoTituloL;
	protected Label estadoValorL;
	protected HorizontalLayout hLayoutBotones;
	protected Button atrasB;
	protected Button resolverB;

	public Incidencia_administrador2_ventana() {
		Design.read(this);
	}
}
