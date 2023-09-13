package uniamerica.BaseTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import uniamerica.Test.Rota;

public class BaseTest extends Rota {
	
	@Test
	public void TesteWebDriver() {
		chrome.findElement(By.name("q")).sendKeys("brics venezuela"+Keys.ENTER);
		String data = chrome.findElement(By.id("result-stats")).getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Aproximadamentee"));
	}

}










