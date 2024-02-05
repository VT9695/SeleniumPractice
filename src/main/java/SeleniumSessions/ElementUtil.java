package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;//y -private in  /flavor of encapsulation  we have used
	
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	public By getBy(String locatorType, String locatorValue) {
		By locator =null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			locator =By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator type & value ......");
			break;
		}
		return locator;
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}
		
	public void doSendkeys(By locator,String value) {
	getElement(locator).sendKeys(value);	
	}
	
	public void doSendkeys(String locatorType, String locatorValue,String value) {
		getElement(locatorType, locatorValue).sendKeys(value);	
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	public  String doGetText(By locator) {
		return getElement(locator).getText();
	}
	/*
	 * this method is used to get the attribute value by passing locator name, attribyte type name 
	 */
	
	
	public  String getAttributevalue(By locator,String attrName) {
		String attrVal =getElement(locator).getAttribute(attrName);
		System.out.println(attrVal);
		return attrVal;
	}
	
	public  boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	
	
	/*
	 * This method is used to get all the list of elements by pasing the locator
	 */
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	/*
	 * This method which is used to get all the element count 
	 */
	public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	/*
	 * This method is used to get all elements text 
	 */
	
	public  List<String> getElementsTextList(By locator) {
		List<WebElement>eleList=getElements(locator);
		List<String>eleTextList = new ArrayList<String>();
		for(WebElement e :eleList) {
		String eleText=	e.getText();
			if(!eleText.isEmpty()) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	
	/*
	 * this method is used to get all attribute values
	 */
	
	public  List<String> getAtrributeList(By locator,String attributeName) {
		List<WebElement>eleList =	getElements(locator);
		List<String>attrList = new ArrayList<String>();


			for(WebElement e :eleList) {
			String attrValue=e.getAttribute(attributeName);
			attrList.add(attrValue);
			}
			return attrList;
		}
	
	
	
	//***********************************Drop Down Utils*************************************//
	
	public  void doSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public  void doSelectByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public  void doSelectByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue("India");
	}
	
	/**
	 * This method is used to select all dropdown value without using the select methods but using sleect class
	 * @param locator
	 * @param value
	 */
	
public  void doSelectDropDownValue(By locator,String value) {
		
		Select select = new Select(getElement(locator));
		
		List<WebElement>optionsList=select.getOptions();
		
		for(WebElement e :optionsList) {
			String text =e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}


 	/**
 	 * this method is used to select all value without using the select class
 	 * @param eleList
 	 */

		public  void selectDropDownValueWithoutSelect(By locator,String value) {
	
			List<WebElement>optionsList=getElements(locator);
			System.out.println(optionsList.size());
	
				for(WebElement e :optionsList) {
					String text=	e.getText();
					if(text.equals(value)) {
							e.click();
								break;
								}
	}
	
}
		
	/*
	 * This method is used to print element value by passing locator
	 */
	
	public  void printElementValues(List<String>eleList) {
			for(String e :eleList) {
				System.out.println(e);
			}
	}
	
	/*
	 * This method is used to check the element is present on webpage or not.
	 */
	public boolean isElementExist(By locator) {
	int elementCount=getElementsCount(locator);
	System.out.println("total element is found"+elementCount);
		if(elementCount>=1) {
			System.out.println("Element is found"+locator);
			return true;
		}else{
			System.out.println("element is not found"+locator);
			return false;
		}
	}
	
	
	
	
	
}
