package com.promart.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Registrar {

	public static final Target BTN_AUTOMOTRIZ =Target.the("Boton departamento Automotriz").locatedBy("//span[@class='item-text'][contains(.,'Automotriz')]");
	public static final Target SELECCIONARCARPA  = Target.the("Seleccionar carpara para Moto").locatedBy("//a[@title='Cobertor para motocicleta'][@tabindex='0']");
	public static final Target BTN_AGREGAR_AL_CARRO = Target.the("Boton agrego al Carrito").locatedBy("//button[@class='btn -btn4 btn_add_prod btn_add_prod-big ico-minicart js-addProdCart']");

}
