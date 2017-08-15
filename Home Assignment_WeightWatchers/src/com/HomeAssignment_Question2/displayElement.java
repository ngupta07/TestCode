package com.HomeAssignment_Question2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayElement {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("user.dir") + "/Testurl/data.html");
		Thread.sleep(3000);
		displayElement.displayindexelements();
		displayElement.displayfoodandservings();
	}

	public static void displayindexelements() throws InterruptedException {
		// Display the third and fifth elements

		WebElement thirdele = driver.findElement(By.xpath("//div/span[contains(@class,'title')][3]"));
		String thirdelement = thirdele.getText();
		WebElement fifthele = driver.findElement(By.xpath("//div/span[contains(@class,'title')][5]"));
		String fifthelement = fifthele.getText();
		System.out.println("The third element is: " + thirdelement);
		System.out.println("The fifth element is: " + fifthelement);
	}

	public static void displayfoodandservings() {

		List<WebElement> foodname = driver.findElements(By.xpath("//div/span[contains(@class,'title')]"));
		List<WebElement> servings = driver.findElements(By.xpath("//div/span[contains(@class,'description')]"));

		HashMap<String, String> foodandserving = new HashMap<String, String>();
		// storing all the Food name and servings info in a HashMap:
		for (int i = 0; i < foodname.size(); i++) {
			WebElement food = foodname.get(i);
			WebElement serving = servings.get(i);
			foodandserving.put(food.getText(), serving.getText());
		}

		// Iterating through HashMap and printing Nutrition Info:
		System.out.println("\n" + "Iterating through HashMap and printing food name and servings Info:\n");
		for (Map.Entry<String, String> e : foodandserving.entrySet()) {
		System.out.println(e.getKey() + " : " + e.getValue());
		System.out.println();
		}
	}
}
