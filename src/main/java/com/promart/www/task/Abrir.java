package com.promart.www.task;

import com.promart.www.userinterfaces.PaginaInicioPromart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		 actor.attemptsTo(Open.browserOn(new PaginaInicioPromart()));
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}
	
	public static Abrir laPagina() {
		return Tasks.instrumented(Abrir.class);
	}

}
