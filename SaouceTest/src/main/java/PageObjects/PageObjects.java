package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	WebDriver drv;
	public PageObjects(WebDriver driver) {
	drv=driver;
	PageFactory.initElements(driver,this);}

	// FIND BY HOW AND USING
	@FindBy(how=How.ID,using= "user-name")
	private WebElement placeholder1;
	@FindBy(how=How.ID,using="password")
	private WebElement placeholder;
	@FindBy(how=How.ID,using="login-button")
	private WebElement btn;
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-backpack")
	private WebElement btn_Add;
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-bike-light")
	private WebElement btn_Add1;
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement btn_Add2;
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement btn_Add3;
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-onesie")
	private WebElement btn_Add4;
	@FindBy(how=How.ID,using="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement btn_Add5;
	@FindBy(how=How.ID,using="remove-sauce-labs-backpack")
	private WebElement btn_Remove;
	@FindBy(how=How.ID,using="remove-sauce-labs-bike-light")
	private WebElement btn_Remove1;
	@FindBy(how=How.ID,using="remove-sauce-labs-bolt-t-shirt")
	private WebElement btn_Remove2;
	@FindBy(how=How.ID,using="remove-sauce-labs-fleece-jacket")
	private WebElement btn_Remove3;
	@FindBy(how=How.ID,using="remove-sauce-labs-onesie")
	private WebElement btn_Remove4;
	@FindBy(how=How.ID,using="remove-test.allthethings()-t-shirt-(red)")
	private WebElement btn_Remove5;
	@FindBy(how=How.CLASS_NAME,using="active_option")
	private WebElement dropdown ;
	@FindBy(how=How.ID,using="item_0_title_link")
	private WebElement hiperlink ;
	@FindBy(how=How.ID,using="item_1_title_link")
	private WebElement hiperlink1 ;	
	@FindBy(how=How.ID,using="item_2_title_link")
	private WebElement hiperlink2 ;
	@FindBy(how=How.ID,using="item_3_title_link")
	private WebElement hiperlink3 ;
	@FindBy(how=How.ID,using="item_4_title_link")
	private WebElement hiperlink4 ;
	@FindBy(how=How.ID,using="item_5_title_link")
	private WebElement hiperlink5 ;
	@FindBy(how=How.ID,using="item_6_title_link")
	private WebElement hiperlink6 ;
	@FindBy(how=How.ID,using="checkout")
	private WebElement btn_chk ;
	@FindBy(how=How.ID,using="first-name")
	private WebElement placeholder2 ;
	@FindBy(how=How.ID,using="lastName")
	private WebElement placeholder3 ;
	@FindBy(how=How.ID,using="postal-code")
	private WebElement placeholder4 ;
	@FindBy(how=How.ID,using="continue")
	private WebElement btn_ctn ;
	@FindBy(how=How.ID,using="finish")
	private WebElement btn_finish ;
	
	
	
	// USE DEFINED ELEMENT
	public void clickOn_btn() {
	btn.click();}
	public void clickOn_btn_Add() {
	btn_Add.click();}
	public void clickOn_btn_Add1() {
	btn_Add1.click();}
	public void clickOn_btn_Ad2() {
	btn_Add2.click();}
	public void clickOn_btn_Add3() {
	btn_Add3.click();}
	public void clickOn_btn_Add4() {
	btn_Add4.click();}
	public void clickOn_btn_Add5() {
	btn_Add5.click();}
	public void clickOn_btn_Remove() {
	btn_Remove.click();}
	public void clickOn_btn_Remove1() {
	btn_Remove1.click();}
	public void clickOn_btn_Remove2() {
	btn_Remove2.click();}
	public void clickOn_btn_Remove3() {
	btn_Remove3.click();}
	public void clickOn_btn_Remove4() {
	btn_Remove4.click();}
	public void clickOn_btn_Remove5() {
	btn_Remove5.click();}
	public void clickOn_btn_hiperlink() {
	hiperlink.click();}
	public void clickOn_btn_hiperlink1() {
	hiperlink1.click();}
	public void clickOn_btn_hiperlink2() {
	hiperlink2.click();}
	public void clickOn_btn_hiperlink3() {
	hiperlink3.click();}
	public void clickOn_btn_hiperlink4() {
	hiperlink4.click();}
	public void clickOn_btn_hiperlink5() {
	hiperlink5.click();}
	public void clickOn_btn_hiperlink6() {
	hiperlink6.click();}
	public void clickOn_btn_chk() {
	btn_chk.click();}
	public void clickOn_btn_ctn() {
	btn_ctn.click();}
	public void clickOn_btn_finish() {
	btn_finish.click();}
	public void placeholder_SearchText(String search) {
	placeholder.sendKeys(Keys.ENTER);}
	public void placeholder1_SearchText() {
	placeholder1.sendKeys(Keys.ENTER);}
	public void placeholder2_SearchText() {
	placeholder2.sendKeys(Keys.ENTER);}
	public void placeholder3_SearchText() {
	placeholder3.sendKeys(Keys.ENTER);}
	public void placeholder4_SearchText() {
	placeholder4.sendKeys(Keys.ENTER);}
	
}

