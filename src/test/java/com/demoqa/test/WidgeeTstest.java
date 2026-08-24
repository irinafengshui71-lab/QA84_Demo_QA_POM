package com.demoqa.test;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.widgets.SelectPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WidgeeTstest extends TestBase {
    SidePanel sidePanel;
    SelectPage select;

    @BeforeEach
    public void precondition(){
        sidePanel = new SidePanel(driver);
        select = new SelectPage(driver);
        new HomePage(driver).getWidgets();
    }
    @Test
    public void oldStyleSelectMenuTest(){
            sidePanel.getSelectMenu();
            select.oldStyleSelect("Green")
                    .verifyColor();

        }
}
