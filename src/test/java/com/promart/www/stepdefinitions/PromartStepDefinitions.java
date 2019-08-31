package com.promart.www.stepdefinitions;

import org.openqa.selenium.WebDriver;


import com.promart.www.task.Abrir;
import com.promart.www.task.ConfirmarCiudad;
import com.promart.www.task.RegistrarCompra;
import com.promart.www.task.ValidarCompraCarro;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PromartStepDefinitions {

	@Managed(driver = "chrome", options = "--start-maximized")

	WebDriver browser;

	Actor Andres = Actor.named("Andres");

	@Given("^yo me encuentro en el home de la tienda promart$")
	public void yoMeEncuentroEnElHomeDeLaTiendaPromart() {
		Andres.can(BrowseTheWeb.with(browser));
		Andres.wasAbleTo(Abrir.laPagina());
		Andres.wasAbleTo(ConfirmarCiudad.ciudad());
	}

	@When("^yo registor mi compra de carpa para moto$")
	public void yoComproUnaSillaParaBebeKreaBabySillaDeComerRosa() {
		// Write code here that turns the phrase above into concrete actions
		Andres.wasAbleTo(RegistrarCompra.articulo());
		}

	@Then("^yo ingreso a mi carrito visualizo mi Carpa inicio Compra$")
	public void loAgregoAMiCarrito() {
		Andres.wasAbleTo(ValidarCompraCarro.carrito());
	}

	
}