package com.demoqa.widgets;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

//    public ToolTipsPage hoversOnToolTips() {
//        Assertions.assertEquals();
//        return this;
//    }
//
//    public ToolTipsPage verifyToolTips(String  value) {
//        Assertions.assertEquals(value, toolTipButton.getDomAttribute("aria-describedby"));
//        return this;
//    }
}

//@FindBy(css = "[aria-describedby='buttonToolTip']")
//WebElement buttonToolTip;
//
//public ToolTipsPage verifyToolTips(String value) {
//    waitIsElementVisibility(buttonToolTip,10);
//    Assertions.assertEquals(value, getValue(toolTipButton, "aria-describedby"));
//    return this;
//}
