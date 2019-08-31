package com.promart.www.task;

import com.promart.www.userinterfaces.MiCarrito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ValidarCompraCarro implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		actor.attemptsTo(Click.on(MiCarrito.BTN_CARRITO));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(MiCarrito.BTN_VER_CARRITO));
		actor.attemptsTo(Click.on(MiCarrito.BTN_IR_COMPRA));
		
	}

	public static ValidarCompraCarro carrito() {
		return Tasks.instrumented(ValidarCompraCarro.class);
	}
}
