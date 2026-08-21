package com.demoqa.test;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.AlertPages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlertTests extends TestBase {
    SidePanel sidePanel;
    AlertPages alerts;

    @BeforeEach
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindow();
        sidePanel = new SidePanel(driver);
        alerts = new AlertPages(driver);
    }
    @Test
    public void waitAlertTest(){
        sidePanel.getAlerts();
        alerts.verifyAlertWithTimer();
    }
    @Test
    public void alertWithSelectResult(){
        sidePanel.getAlerts();
        alerts.clickOnResult("Cancel")
                .verifyResult("Cancel");
    }

}
