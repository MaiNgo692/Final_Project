package labelfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automation.common.CommonFunction;
import automation.pageLocator.Rise_Dashboard_Page;
import automation.pageLocator.Rise_Login_Page;
import automation.pageLocator.Rise_Projects_Page;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LA4 extends CommonFunction {
	WebDriver driver;
	Rise_Login_Page lp;
	Rise_Dashboard_Page dp;
	Rise_Projects_Page pp;

	@BeforeClass
	void openSite() {
		System.setProperty("webdriver.http.factory", "jdk-http-client"); //fix Connection reset warning
		driver=new ChromeDriver();
		openWebsite(driver, "https://rise.fairsketch.com/signin");
		lp = new Rise_Login_Page(driver);
		dp = new Rise_Dashboard_Page(driver);
		pp = new Rise_Projects_Page(driver);
		lp.clickSubmit();
		dp.clickProject();
	}

	@Test
	public void TC4() throws InterruptedException {
		pp.clickLabelButton();
		pp.clickCreatedLabel();
		pp.clickCancelButton();
		Thread.sleep(2000);
		Assert.assertEquals(pp.elementHasClass("hide"), true);
		Assert.assertEquals(pp.inputIsEmpty(), true);
	}

	@AfterClass
	void quitWebdriver() {
		driver.quit();
	}

}
