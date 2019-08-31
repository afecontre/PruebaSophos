package com.promart.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Ciudad  {

	public static final Target SELECCIONCIUDAD = Target.the("Ciudad de Seleccionada").locatedBy(("//span[@class='js-txtc'][contains(.,'Cajamarca')]"));
	public static final Target BTN_CONFIRMARCIUDAD = Target.the("Ciudad Confirmada").locatedBy( "//button[@class='btn -btn2 js-confirmar']");

	
}
