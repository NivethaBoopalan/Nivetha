package com.step;

import com.Base.Base_class;
import com.Pom.Kidspom_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_class extends Base_class {
	Kidspom_class kp;
	
	@Given("User launch the browser {string}")
	public void user_launch_the_browser(String string) {
	    launchbrowser(string);
	}

	@When("User launch the Url {string}")
	public void user_launch_the_url(String string) {
	    launchUrl(string);
	}

	@When("User clicks kids")
	public void user_clicks_kids() throws InterruptedException {
	  Thread.sleep(3000);
      kp=new Kidspom_class();
	  MouseActions(kp.getKids());
	 }

	@When("User clicks Top and Tees")
	public void user_clicks_top_and_tees() throws InterruptedException {
		Thread.sleep(3000);
	   kp.getTopandtees().click(); 
	}

	@When("User Select The Dress")
	public void user_select_the_dress() throws InterruptedException {
	   Thread.sleep(3000);
	   kp.getImg().click();
	}

	@When("User Select The Size")
	public void user_select_the_size() throws InterruptedException {
		Thread.sleep(3000);
	    kp.getSize().click();
	}

	@When("User Add to Cart")
	public void user_add_to_cart() {
	    kp.getAddtocart().click();
	}

	@Then("User Close the Browser")
	public void user_close_the_browser() {
	    
	}

}
