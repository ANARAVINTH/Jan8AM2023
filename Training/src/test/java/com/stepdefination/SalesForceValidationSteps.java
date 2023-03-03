package com.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignInPageSteps;
import reusable.BrowserInvocation;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class SalesForceValidationSteps {

     int a = 1;
    public WebDriver driver;
    private WebElement currencyElement;

    @Given("User Should navigate to login page of salesforce application")
    public void loginPage() throws IOException {
        driver =  BrowserInvocation.launchApplication();
    }

    @And("User clicks the login Button")
    public void clickLoginButton(){

    }

    @When("User Enters the username {string} and password {string}")
    public void entersUsernamePassword(String name, String password) {

        driver.findElement(By.cssSelector("#username")).sendKeys(name);
        driver.findElement(By.cssSelector("input[id='username']"));
        driver.findElement(By.xpath("//label[text()='Username']"));
        driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username"));
        String title = driver.getTitle();

    }
    @Then("User navigates to the Home page")
    public void navigatesToTheHomePage() {
     

    }

    @Given("User login the application and navigate to homepage")
    public void loginApplication() throws IOException {
        driver=  BrowserInvocation.launchApplication();
        driver.findElement(By.id("nav-link-accountList")).click();
        SignInPageSteps.enterEmailID("anaravinthh@outlook.com");
        SignInPageSteps.clickContinueButton();
        SignInPageSteps.enterPassword("Happylife");
        SignInPageSteps.clickSignIn();
    }

    @Then("User Validate the error message {string}")
    public void validateTheErrorMessage(String expectedErrorMessage) {

    }

    @Then("User clicks the forget password link")
    public void userClicksTheForgetPasswordLink() {

    }


    @Given("User Navigates to the Application")
    public void userNavigatesToTheApplication() throws IOException {

      driver=  BrowserInvocation.launchApplication();

    }

    @When("User Selects the value from the currency dropdown")
    public void userSelectsTheValueFromTheCurrencyDropdown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));

        currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

      Select selectCurrency = new Select(currencyElement);
      selectCurrency.selectByIndex(5);

    }

    @When("User handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='CJB']")).click();
//       WebElement toDropdownElement= driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//        toDropdownElement.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();


    }

    @And("User extract the currency dropdown values")
    public void userExtractTheCurrencyDropdownValues() {

    //   int currencyDropdownSize = currencyElement.findElements(By.tagName("option")).size();

     List<WebElement>  dropValues=  currencyElement.findElements(By.tagName("option"));

//       List<String> currencyValue = new ArrayList<String>();
//        for(int i=0; i<currencyDropdownSize ;i++){
//
//            currencyValue.add(currencyElement.findElements(By.tagName("option")).get(i).getText());
//        }

        List<String> currencyValue = new ArrayList<String>();
        for(WebElement j:dropValues){

           currencyValue.add( j.getText());

        }

        System.out.println(currencyValue);

    }

    @When("User handles the Mouse Action")
    public void userHandlesTheMouseAction() {

        Actions a = new Actions(driver);
        a.clickAndHold(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();

        driver.findElement(By.className("button_r4_wide_primary"));

    }

    @When("User handles the frame")
    public void userHandlesTheFrame() {

       WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

       WebElement source = driver.findElement(By.id("draggable"));
       WebElement target = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();


    }

    @When("User handles the Table")
    public void userHandlesTheTable() {

      List<WebElement> coulumOneElement= driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/th"));
      List<String> columnOneValues = new ArrayList<String>();
      for(WebElement e:coulumOneElement){
          columnOneValues.add(e.getText());
      }

        System.out.println(columnOneValues);

     int tableSize = driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/td")).size();
      for(int i=0 ;i<tableSize ;i++){

         String val = driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/td")).get(i).getText();
          System.out.println(val);
      }

    }

    @When("User handles the auto suggestive")
    public void userHandlesTheAutoSuggestive() throws InterruptedException {

        driver.findElement(By.id("flying_from_N")).click();
        WebElement fromDrop =driver.findElement(By.name("flying_from"));
        fromDrop.sendKeys("che");
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.pollingEvery(Duration.ofSeconds(10));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("flying_from")));

        int i =0;
        while (i<5) {
            fromDrop.sendKeys(Keys.ARROW_DOWN);
            i++;
        }

        fromDrop.sendKeys(Keys.ENTER);

    }

    @When("User handles the calander")
    public void userHandlesTheCalander() {

        driver.findElement(By.className("ui-datepicker-trigger")).click();

        WebElement firstTable = driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first"));
      //  firstTable.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
      List<WebElement> date=  firstTable.findElements(By.xpath("//td[@data-handler='selectDay']/a"));

        for(WebElement e:date){

            if(e.getText().equals("26")){

                e.click();
                break;
            }

        }

    }

    @When("User Enters the username and password")
    public void userEntersTheUsernameAndPassword() {

        WebElement userName =driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        userName.sendKeys("Aravinth");
        password.sendKeys("123");
        driver.navigate().refresh();

        try{
            userName.sendKeys("hello");
            password.sendKeys("123");
        }
        catch(StaleElementReferenceException e){

             userName =driver.findElement(By.id("username"));
             password = driver.findElement(By.id("password"));
             userName.sendKeys("hello");
            password.sendKeys("123");

        }
        catch(TimeoutException e){

            e.printStackTrace();
        }
        catch(Exception o){
            o.printStackTrace();
        }
    }

    @When("User counts the links")
    public void userCountsTheLinks() {

      int totalCount =  driver.findElements(By.tagName("a")).size();
        System.out.println(totalCount);

      WebElement footer = driver.findElement(By.xpath("//div[@class='row footer-top-section']"));
      int footerCount =footer.findElements(By.tagName("a")).size();
        System.out.println(footerCount);

      WebElement platform = driver.findElement(By.id("nav_menu-99"));
      int platformSize =platform.findElements(By.tagName("a")).size();
        System.out.println(platformSize);

        for(int i=0 ; i<platformSize;i++){
            String keyActions=Keys.chord(Keys.CONTROL, Keys.ENTER);
            platform.findElements(By.tagName("a")).get(i).sendKeys(keyActions);
        }

       Set<String> propValues = driver.getWindowHandles();

        for(String winPro:propValues){
          String title =  driver.switchTo().window(winPro).getTitle();
            System.out.println(title);
            if(title.contains("Privacy and Security of Data")){
                break;
            }
        driver.switchTo().defaultContent();
        }

    }
}
