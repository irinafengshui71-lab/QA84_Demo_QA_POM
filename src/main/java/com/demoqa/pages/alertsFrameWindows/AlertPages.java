package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPages extends BasePage {

    public AlertPages(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="timerAlertButton")
    WebElement timerAlertButton;

    public AlertPages verifyAlertWithTimer() {
        clickWithJS(timerAlertButton,0,200);
        Assertions.assertTrue(isAlertPresent(5));
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;
    public AlertPages clickOnResult(String result) {
        clickWithJS(confirmButton,0,200);
        if (result != null && result.equals("Ok")){
            driver.switchTo().alert().accept();
        }else if (result != null && result.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;
    public AlertPages verifyResult(String text) {
        Assertions.assertTrue(isContainsText(text, confirmResult));
        return this;
    }
@FindBy(id="promtButton")
WebElement promtButton;
    public AlertPages clickOnPromtButton() {
        cklickWitJS(promtButton, 0, 300);
        return this;
    }

    private void cklickWitJS(WebElement promtButton, int i, int i1) {


    }


    public AlertPages sendMessegeToAlert(String messege) {
        if (messege != null){
            driver.switchTo().alert().sendKeys(messege);
            driver.switchTo().alert().accept();

        }
        return this;
    }
@FindBy(id = "promtResult")
WebElement promtResult;
    public AlertPages verifyMessage(String text) {
        Assertions.assertTrue(isContainsText(text, promtResult));
        return this;
    }
}
