package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.pageobjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class saoucesteps {

	WebDriver dvr;
	
	@Given("^the user enters the page of virtual shop$")
	public void the_user_enters_the_page_of_virtual_shop() throws Throwable {
		System.setProperty("dvr","src/test/java/Driver/chromedriver.exe");
		dvr= new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("https://www.saucedemo.com/");
	}			

	@When("^the user write the username \"([^\"]*)\"$")
	public void the_write_the_username(String nombre) throws Throwable {
		System.out.println("i enter the user.");
		dvr.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	

	@When("^the user write the password \"([^\"]*)\"$")
	public void que_coloco_la_clave(String password) throws Throwable {
		System.out.println("i enter the password.");
		dvr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	
	@When("^the user clicks the login button$")
	public void hago_clic_en_el_boton_aceptar() throws Throwable {
		System.out.println("i make click in login button.");
		dvr.findElement(By.id("login-button")).click();
	}

	@When("^the user selects a product \"([^\"]*)\"$")
	public void the_user_selects_a_produc(String product) throws Throwable {
		System.out.println("i select a product.");
		dvr.findElement(By.id("item_0_title_link")).click();
		
	}
	
	@When("^the user add the product to the cart \"([^\"]*)\"$")
	public void the_user_add_the_product_to_the_cart(String cart) throws Throwable {
		System.out.println("i add the product to de cart.");
		dvr.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	}

	@When("^the user checkout the purchase \"([^\"]*)\"$")
	public void the_user_checksout_the_purchase(String puchase ) throws Throwable {
		System.out.println("i checkout purchase.");
		dvr.findElement(By.id("checkout")).click();
	}

	@When("^the user goes to the shopping cart$")
	public void the_user_goes_to_the_shopping_cart() throws Throwable {
		System.out.println("the user goes to the shopping cart.");
		dvr.findElement(By.id("shopping_cart_container")).click();

	}
	
	
	@When("^the user enters his name \"([^\"]*)\"$")
	public void the_user_enters_his_name(String name) throws Throwable {
		System.out.println("the user enters his name.");
		dvr.findElement(By.id("first-name")).sendKeys("Pedro");

	}

	@When("^the user enters his lastname \"([^\"]*)\"$")
	public void the_user_enters_his_lastname(String lastname) throws Throwable {
		System.out.println("the user enters his lastname.");
		dvr.findElement(By.id("last-name")).sendKeys("Perez");

	}

	@When("^the user enters his postal code \"([^\"]*)\"$")
	public void the_user_enters_his_postal_code(String codep) throws Throwable {
		System.out.println("the user enters his postal code.");
		dvr.findElement(By.id("postal-code")).sendKeys("1061");

	}

	@Then("^the user clicks the continue button to continue with the purchase$")
	public void the_user_clicks_the_continue_button_to_continue_with_the_purchase() throws Throwable {
		System.out.println("click on continue buton.");
		dvr.findElement(By.id("continue")).click();
	}

	@Then("^the user clicks on finish to complete the purchase$")
	public void the_user_clicks_on_finish_to_complete_the_purchase() throws Throwable {
		System.out.println("click on finish buton.");
		dvr.findElement(By.id("finish")).click();
	}
	
	@Then("^the user goes to page of virtual shop$")
	public void the_user_goes_to_page_of_virtual_shop() throws Throwable {
		System.out.println("back to home.");
		dvr.findElement(By.id("back-to-products")).click();
	}

	@Then ("^close the page$")
	public void close_the_page() throws Throwable {
		System.out.println("close windows");
		dvr.close();
	}
}