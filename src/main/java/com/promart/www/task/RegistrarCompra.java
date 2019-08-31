package com.promart.www.task;


import com.promart.www.userinterfaces.Registrar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegistrarCompra implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Registrar.BTN_AUTOMOTRIZ));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						 
		actor.attemptsTo(Click.on(Registrar.SELECCIONARCARPA));
		 
		actor.attemptsTo(Click.on(Registrar.BTN_AGREGAR_AL_CARRO));
	}
	
	public static RegistrarCompra articulo() {
		return Tasks.instrumented(RegistrarCompra.class);
	}
}