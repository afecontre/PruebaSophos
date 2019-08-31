package com.promart.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MiCarrito {

	public static final Target BTN_CARRITO =Target.the("Boton mi carrito").locatedBy("//i[@class='icon icon-carrito -ih']");
	public static final Target BTN_VER_CARRITO =Target.the("Boton ver carrito").locatedBy("//a[@class='btn-comprar -cir -btn2 btn-link']");
	public static final Target BTN_IR_COMPRA =Target.the("Inicia Compra").locatedBy("//a[@class='btn btn-large btn-success pull-left-margin btn-place-order']");
}