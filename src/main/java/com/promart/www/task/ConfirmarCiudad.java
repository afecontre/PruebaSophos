package com.promart.www.task;

import com.promart.www.userinterfaces.Ciudad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarCiudad implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(Ciudad.SELECCIONCIUDAD));
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		actor.attemptsTo(Click.on(Ciudad.BTN_CONFIRMARCIUDAD));
		
		
		}
		
		
	public static ConfirmarCiudad ciudad() {
		return Tasks.instrumented(ConfirmarCiudad.class);
	}

}	

