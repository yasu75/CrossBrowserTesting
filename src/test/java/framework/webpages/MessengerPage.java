package framework.webpages;

import org.openqa.selenium.By;

public class MessengerPage extends ElementUtil {

    //Variables
    //Locators
    //Methods

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By signUpButton = By.id("loginbutton");
    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect Email')]");
    private By messengerLink = By.linkText("Messenger");
    private By signupButton = By.id("u_0_y");


    public void enterEmail(String email) {        setValue(emailField, email);    }
    public void enterPassword(String password) {        setValue(passwordField, password);    }
    public void clickOnSignupButton() {        clickOn(signUpButton);    }
    public String getErrorMessage() {        return getTextFromElement(errorMessage);    }
    public void clickOnSignInButton(){
        clickOn(signUpButton);
    }
    public void clickOnMessengerLink(){
        clickOn(messengerLink);
    }

    }





