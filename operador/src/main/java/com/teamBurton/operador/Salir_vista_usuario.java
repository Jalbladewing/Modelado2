package com.teamBurton.operador;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Salir_vista_usuario extends Salir_vista_usuario_ventana {
	public Mi_cuenta_vista_usuario _unnamed_Mi_cuenta_vista_usuario_;
	
	public Salir_vista_usuario()
	{
		confirmarB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				
				
				if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
				{
					((NavigatorUI) UI.getCurrent()).setVistaCliente(null);
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Comercial");
					NavigatorUI.getCurrent().setContent(new Comercial2());	
					UI.getCurrent().removeWindow((Window) getParent());
					
				}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Administrador"))
				{
					((NavigatorUI) UI.getCurrent()).setVistaCliente(null);
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Administrador");
					NavigatorUI.getCurrent().setContent(new Administrador2());	
					UI.getCurrent().removeWindow((Window) getParent());
					
				}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Vista_Comercial"))
				{
					((NavigatorUI) UI.getCurrent()).setVistaCliente(null);
					UI.getCurrent().getNavigator().removeView(Acceder.VIEW_NAME);
					UI.getCurrent().getNavigator().destroy();
					((NavigatorUI) UI.getCurrent()).setMainView("Vista_Comercial");
					NavigatorUI.getCurrent().setContent(new Comercial_administrador());	
					UI.getCurrent().removeWindow((Window) getParent());
				}
				
				
			}
		});
	}
}