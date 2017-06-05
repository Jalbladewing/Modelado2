package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Desconectar_cliente extends Desconectar_cliente_ventana {
	/*private TextArea _mensaje;
	private Button _confirmar;
	private Button _cancelar;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	
	public Desconectar_cliente()
	{
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				((NavigatorUI) UI.getCurrent()).setUsuario(null);
				UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
				UI.getCurrent().getNavigator().destroy();
				((NavigatorUI) UI.getCurrent()).setMainView("Cibernauta");
				NavigatorUI.getCurrent().setContent(new Cibernauta());	
				UI.getCurrent().removeWindow((Window) getParent());
				
			}
		});
	}
}