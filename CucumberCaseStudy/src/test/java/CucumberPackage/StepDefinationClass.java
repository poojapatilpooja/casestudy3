package CucumberPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass
{
public static WebDriver driver;
@Given ("^user open TestmeApp$")
public void useropenTestmeapp()
{
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
}


@When("^user click signup$")
public void userclicksignup()
{
	driver.findElement(By.linkText("SignUp")).click();
}


@And("^enter user name as \"([^\"]*)\"$")
public void enteusername(String uname)
{
	driver.findElement(By.id("userName")).sendKeys(uname);
}


@And("^enter first name as \"([^\"]*)\"$")
public void enterfirstname(String fname)
{
	driver.findElement(By.id("firstName")).sendKeys(fname);
}

@And("^enter last name as \"([^\"]*)\"$")
public void enterlastname(String lname)
{
	driver.findElement(By.id("lastName")).sendKeys(lname);
}

@And("^enter password as \"([^\"]*)\"$")
public void enterpassword(String pwd)
{
	driver.findElement(By.id("password")).sendKeys(pwd);
}


@And("^enter confirm password as \"([^\"]*)\"$")
public void enterconfirmpassword(String cpwd)
{
	driver.findElement(By.id("pass_confirmation")).sendKeys(cpwd);
}

@And("^user select gender as \"([^\"]*)\"$")
public void selectgender(String gender)
{
	if(gender.equals("female"))
	{
	driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	else if(gender.equals("male"))
	{
		driver.findElement(By.xpath("//input[@value='Male']")).click();

	}
}

@And("^enter email as \"([^\"]*)\"$")
public void enteremail(String email)
{
	driver.findElement(By.id("emailAddress")).sendKeys(email);
}

@And("^enter mobile no. as \"([^\"]*)\"$")
public void entermobileno(String mbno)
{
	driver.findElement(By.id("mobileNumber")).sendKeys(mbno);
}

@And("^enter DOB as \"([^\"]*)\"$")
public void enterdob(String dob)
{
	driver.findElement(By.id("dob")).sendKeys(dob);
}

@And("^enter address as \"([^\"]*)\"$")
public void enteraddress(String address)
{
	driver.findElement(By.id("address")).sendKeys(address);
}

@And("^user select security question as \"([^\"]*)\"$")
public void entersecurityquestion(String question)
{
	WebElement dropdown=driver.findElement(By.name("securityQuestion"));
	Select s=new Select (dropdown);
	s.selectByIndex(1);
}

@And("^enter answer as \"([^\"]*)\"$")
public void enteranswer(String answer)
{
	driver.findElement(By.id("answer")).sendKeys(answer);
}



@Then("^user click on Register$")
public void userclick()
{
	driver.findElement(By.name("Submit")).click();
}

//Scenario 2
@Given("^user opens TestMeApp$")
public void useropensTestMeApp()
{
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
}
@When("^user click SignIn$")
public void userclickSignIn()
{
	driver.findElement(By.linkText("SignIn")).click();
}
@And("^user enters credentials as$")
public void userenterscredentialsas(DataTable dt)
{
	List<String> cred=dt.asList(String.class);
	driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	driver.findElement(By.name("password")).sendKeys(cred.get(1));
	driver.findElement(By.name("Login")).click();

}

}
