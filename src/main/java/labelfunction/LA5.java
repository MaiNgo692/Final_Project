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

public class LA5 extends CommonFunction {
	WebDriver driver;
	Rise_Login_Page lp;
	Rise_Dashboard_Page dp;
	Rise_Projects_Page pp;
	String labelName = "TC5 LA5 " + randomString();

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
	public void TC5_createLabel() throws InterruptedException {
		pp.clickLabelButton();
		pp.typeLabelName(labelName);
		pp.saveLabel();
		Thread.sleep(2000);
		Assert.assertEquals(pp.verifyLabelAndColor(labelName,"#4a8af4"), true);
	}
	
	@Test
	public void TC5_recolorLabel() throws InterruptedException {
		pp.clickCreatedLabel();
		pp.clickBlack();
		pp.saveLabel();
		Thread.sleep(2000);
		Assert.assertEquals(pp.verifyLabelAndColor(labelName,"#34495e"), true);
	}

	@AfterClass
	void quitWebdriver() {
		driver.quit();
	}

}
