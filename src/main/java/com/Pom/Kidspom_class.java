package com.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;

public class Kidspom_class extends Base_class {
	JavascriptExecutor js;
	public Kidspom_class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='kids_category']")
	private WebElement kids;
	@FindBy(xpath = "//div[@class='fs14 p48 pR']//a[text()='tees & tops']")
	private WebElement Topandtees;
    @FindBy(xpath="/html/body/div/main/div[2]/div/div[4]/a/img")	
    private WebElement img;
    @FindBy(xpath="//div[@data-a='size'][1]")
    private WebElement size;
    @FindBy(xpath="//div[text()='ADD TO CART']")
    private WebElement addtocart;
	public WebElement getKids() {
		return kids;
	}

	public WebElement getTopandtees() {
		return Topandtees;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
