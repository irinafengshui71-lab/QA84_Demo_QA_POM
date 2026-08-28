package com.demoqa.pages.elements;

import org.junit.jupiter.api.Assertions;
import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.event.KeyEvent;

public class UploadPage extends BasePage {
    Robot robot;
    public UploadPage(WebDriver driver) {
        super(driver);

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
    @FindBy(id = "uploadFile")
    WebElement uploadFile;

    public UploadPage performKeyEvent() {
        // clickWithJS(uploadFile,0,300);
        scrollWithJS(uploadFile);
        clickWithRectangle(uploadFile);
        //press SHIFT
        pause(1000);
        robot.keyPress(KeyEvent.VK_SHIFT);
        //press d(upper case as SHIFT key is pressed)
        pause(1000);
        robot.keyPress(KeyEvent.VK_D);//d
        //release SHIFT
        robot.keyRelease(KeyEvent.VK_SHIFT);
        //press 1, ., t, x, t
        pause(1000);
        robot.keyPress(KeyEvent.VK_1);//1
        robot.keyPress(KeyEvent.VK_PERIOD);//.
        robot.keyPress(KeyEvent.VK_T);//t
        robot.keyPress(KeyEvent.VK_X);//x
        robot.keyPress(KeyEvent.VK_T);//t
        pause(1000);
        //press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;
    }

    @FindBy(id = "uploadedFilePath")
    WebElement uploadedFilePath;
    public UploadPage verifyFilePath(String path) {
        Assertions.assertTrue(isContainsText(path,uploadedFilePath));
        return this;
    }
}
