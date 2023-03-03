package pageobject;


import org.openqa.selenium.By;
import reusable.BrowserInvocation;

public class SignInPageSteps extends BrowserInvocation  {

    public static void enterEmailID(String emailID){
        driver.findElement(By.id("ap_email")).sendKeys(emailID);
    }

    public static void clickContinueButton(){
        driver.findElement(By.id("continue")).click();
    }

    public static void clickCreateAccount(){

        driver.findElement(By.id("auth-create-account-link")).click();
    }

    public static void enterPassword(String password){
        driver.findElement(By.id("ap_password")).sendKeys(password);
    }

    public static void clickSignIn(){

        driver.findElement(By.id("signInSubmit")).click();
    }




}
