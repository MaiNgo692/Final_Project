package automation.pageLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;

import automation.common.CommonBase;

public class ProjectPageFactory extends CommonBase {
	private WebDriver driver;
	
//	link mở trang Product
	@FindBy(xpath ="//span[text()='Projects']/ancestor::li")
	private WebElement projectUrl;
	
//  Nút để hiển thị hoặc ẩn cột trên màn hình
	@FindBy(xpath ="//button[@class = 'btn btn-default column-show-hide-popover']")
	private WebElement hideBtn;
	
//	Nút dropdown để filter
	@FindBy(xpath ="//button[@class = 'btn btn-default smart-filter-dropdown dropdown-toggle caret']")
	private WebElement filterDropBtn;
	//  Các lựa chọn trong dropdown list
		@FindBy(xpath ="//a[text()='Manage Filters ']")
		private WebElement filterDropManageFilters;
		
		@FindBy(xpath ="//a[text()='Clear']")
		private WebElement filterDropClear;
		
		@FindBy(xpath ="//input[@class ='form-control search-filter']")
		private WebElement filterDropSearch;
		
		@FindBy(xpath ="//a[text()='All projects']")
		private WebElement filterDropAllProject;
		
		@FindBy(xpath ="//a[text()='Completed']")
		private WebElement filterDropCompleted;
		
		@FindBy(xpath ="//a[text()='High Priority']")
		private WebElement filterDropHightPriority;
		
		@FindBy(xpath ="//a[text()='Open projects']")
		private WebElement filterDropOpenProject;
		
		@FindBy(xpath ="//a[text()='Upcoming']")
		private WebElement filterDropUpcoming;
		
//	Nút để hiển thị form filter
	@FindBy(xpath ="//button[@class = 'btn btn-default show-filter-form-button']")
	private WebElement showFilterFormBtn;
	//	Lables
		@FindBy(xpath ="(//div[@class='filter-form']//descendant::div)[2]")
		private WebElement filterFormLables;
		//	Các lable để lựa chọn trong filter form
			@FindBy(xpath ="(//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]")
			private WebElement filterFormLablesSearch;
			
			@FindBy(xpath ="((//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]/following::ul/child::li)[2]")
			private WebElement filterFormLablesOnTrack;
			
			@FindBy(xpath ="((//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]/following::ul/child::li)[3]")
			private WebElement filterFormLablesUrgent;
			
			@FindBy(xpath ="((//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]/following::ul/child::li)[4]")
			private WebElement filterFormLablesUpcoming;
			
			@FindBy(xpath ="((//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]/following::ul/child::li)[5]")
			private WebElement filterFormLablesPerfect;
			
			@FindBy(xpath ="((//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//descendant::div)[1]/following::ul/child::li)[6]")
			private WebElement filterFormLablesHighPriority;
	
	//	Start date
		@FindBy(xpath ="//div[text()='Start date']")
		private WebElement filterFormStartDate;
		//	Các lable để lựa chọn StartDate trong filter form
			@FindBy(xpath ="//a[text()='This Month']")
			private WebElement filterFormStartDateThisMonth;
			
			@FindBy(xpath ="//a[text()='This Year']")
			private WebElement filterFormStartDateThisYear;
			
			@FindBy(xpath ="//a[text()='Last Year']")
			private WebElement filterFormStartDateLastYear;
			
			@FindBy(xpath ="//a[text()='Next 7 Days']")
			private WebElement filterFormStartDateNext7Day;
			
			@FindBy(xpath ="//a[text()='Next Month']")
			private WebElement filterFormStartDateNextMonth;
	// Expired dropdown
		@FindBy(xpath ="//button[text()='Expired']")
		private WebElement filterFormExpiredBtn;
		//	Các lựa chọn trong expried
			@FindBy(xpath ="//div[text()='Expired']")
			private WebElement filterFormExpiredExpired;
			
			@FindBy(xpath ="//div[text()='Today']")
			private WebElement filterFormExpiredToday;
			
			@FindBy(xpath ="//div[text()='Tomorrow']")
			private WebElement filterFormExpiredTomorrow;
			
			@FindBy(xpath ="//div[text()='In 7 days']")
			private WebElement filterFormExpiredIn7Days;
			
			@FindBy(xpath ="//div[text()='In 15 days']")
			private WebElement filterFormExpiredIn15Days;
			
			@FindBy(xpath ="//div[text()='Custom']")
			private WebElement filterFormExpiredCustom;
	// Status dropdown
		@FindBy(xpath ="//button[text()='Status ']")
		private WebElement filterFormStatusBtn;	
		//	Các lựa chọn trong status		
			@FindBy(xpath ="//li[text()='Open']")
			private WebElement filterFormStatusOpen;	
			@FindBy(xpath ="//li[text()='Completed']")
			private WebElement filterFormStatusCompleted;
			@FindBy(xpath ="//li[text()='Hold']")
			private WebElement filterFormStatusHold;
			@FindBy(xpath ="//li[text()='Canceled']")
			private WebElement filterFormStatusCanceled;		
	// new filter để thêm filer vào list filers. phải vào Manage Filters để kiểm tra có hay chưa.
		@FindBy(xpath ="//button[@class='btn btn-default save-filter-button']")
		private WebElement filterFormAddNewFilterBtn;
		// Các truongf trong new filter
			@FindBy(xpath ="//input[@name='title']")
			private WebElement filterFormAddNewFilterTitle;
			
			@FindBy(xpath ="//button[text()=' Save']")
			private WebElement filterFormAddNewFilterSaveBtn;
// đóng filterform
		@FindBy(xpath ="(//div[@class='filter-form']/child::div)[6]/child::button")
		private WebElement filterFormCloseBtn;		
			
//	Các nút filter nhanh trên màn hình
	@FindBy(xpath ="//button[text()='All projects']")
	private WebElement showFilterAllProjectBtn;
	
	@FindBy(xpath ="(//button[text()='All projects']/parent::div//following-sibling::div)[1]/child::button")
	private WebElement showFilterStatustCompletedBtn;
	
	@FindBy(xpath ="(//button[text()='All projects']/parent::div//following-sibling::div)[2]/child::button")
	private WebElement showFilterLableHighPriorityBtn;
	
	@FindBy(xpath ="(//button[text()='All projects']/parent::div//following-sibling::div)[3]/child::button")
	private WebElement showFilterStatustOpenBtn;
	
	@FindBy(xpath ="(//button[text()='All projects']/parent::div//following-sibling::div)[4]/child::button")
	private WebElement showFilterLableUpcomingBtn;
	
//	link quản lý lables
	@FindBy(xpath ="//a[text()=' Manage labels']")
	private WebElement manageLables;
	
//	link add product
	@FindBy(xpath ="//a[text()=' Add project']")
	private WebElement addProject;
	// Các trường trong add project
		@FindBy(xpath ="//input[@name='title']")
		private WebElement addProjectTitle;
		
		@FindBy(xpath ="//button[text()=' Save']")
		private WebElement addProjectSaveBtn;
		
//  search input

	@FindBy(xpath = "//input[@type='search' and @placeholder= 'Search']")
	WebElement inputSearch;

	@FindBy(xpath = "//input[@name='title']")
	WebElement inputTitle;

	@FindBy(xpath = "//div[@id='select2-drop-mask']//following-sibling::div//input")
	WebElement inputProjectType;

	@FindBy(xpath = "//div[@id='select2-drop-mask']//following-sibling::div//input")
	WebElement inputClient;

	@FindBy(xpath = "//label[text()='Description']//following-sibling::div//descendant::div[@class='note-editable']")
	WebElement inputDescription;

	@FindBy(xpath = "//input[@name='start_date']")
	WebElement inputStartdate;

	@FindBy(xpath = "//input[@name='deadline']")
	WebElement inputDeadline;

	@FindBy(xpath = "//input[@name='price']")
	WebElement inputPrice;

	@FindBy(xpath = "//label[@for='project_labels']//following-sibling::div//label//following-sibling::input")
	WebElement inputLabels;

	@FindBy(xpath = "//div[@id='select2-drop-mask']//following-sibling::div//input")
	WebElement inputStatus;

	
	public ProjectPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}

	public void AddProjectFunction(String title ) {
		addProject.click();
		addProjectTitle.sendKeys(title);
		addProjectSaveBtn.click();
	}
	
	public void searchProject(String title) {
		type(inputSearch, title);

	}


	public void chooseDatePicker(WebElement element, String datetime) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", element);		
		element.clear();
		element.sendKeys(datetime);
		element.sendKeys(Keys.TAB);

	}

	public void multiCheckbox(String[] checkList) {
		for (int i = 0; i < checkList.length; i++) {
			driver.findElement(By.xpath("//label[text()='Labels']//following-sibling::div")).click();
			List<WebElement> listCheckbox = driver
					.findElements(By.xpath("//div[@id='select2-drop-mask']//following-sibling::div//ul/li"));
			for (int j = 0; j < listCheckbox.size(); j++) {
				WebElement checkBoxItem = listCheckbox.get(j);
				if (checkList[i].equals(checkBoxItem.getText())) {
					checkBoxItem.click();
					break;
				} else {
					continue;
				}
			}
		}
		pause(2000);
	}

	// Edit modal screen
	public void editProject(String title, @Optional("") String projectType, @Optional("") String client,
			@Optional("") String description, @Optional("") String startDate, @Optional("") String deadline,
			@Optional("") String price, @Optional() String[] labels, @Optional("") String status) {
		pause(3000);
		type(inputTitle, title);

		// type project type
		driver.findElement(By.xpath("//label[text()='Project type']//following-sibling::div//a")).click();
		type(inputProjectType, projectType);
		driver.findElement(By.xpath("//div[@id='select2-drop-mask']//following-sibling::div//input"))
				.sendKeys(Keys.TAB);
		// type client
		if (projectType.equals("Client Project")) {
			driver.findElement(By.xpath("//label[text()='Client']//following-sibling::div")).click();
			type(inputClient, client);
			driver.findElement(By.xpath("//div[@id='select2-drop-mask']//following-sibling::div//input"))
					.sendKeys(Keys.TAB);
		}
		// type description
		pause(3000);
		type(inputDescription, description);
		// choose start date
		chooseDatePicker(inputStartdate, startDate);
		pause(5000);
		// choose deadline
		chooseDatePicker(inputDeadline, deadline);
		pause(5000);
		// type price
		type(inputPrice, price);

		// type status
		driver.findElement(By.xpath("//label[text()='Status']//following-sibling::div")).click();
		type(inputStatus, status);
		driver.findElement(By.xpath("//div[@id='select2-drop-mask']//following-sibling::div//input"))
				.sendKeys(Keys.TAB);

		//// labels
		multiCheckbox(labels);
		

	}
	
}