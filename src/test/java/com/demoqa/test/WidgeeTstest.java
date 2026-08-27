package com.demoqa.test;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.widgets.MenuPage;
import com.demoqa.widgets.SelectPage;
import com.demoqa.widgets.SliderPage;
import com.demoqa.widgets.ToolTipsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WidgeeTstest extends TestBase {
    SidePanel sidePanel;
    SelectPage select;

    @BeforeEach
    public void precondition(){
        new HomePage(driver).getWidgets();
        sidePanel = new SidePanel(driver);
        select = new SelectPage(driver);

    }
    @Test
    public void oldStyleSelectMenuTest(){
        sidePanel.getSelectMenu();
        select.oldStyleSelect("Green")
                .verifyColor("Green");
    }


        @Test
    public void multiSelectDropDownTest(){
        sidePanel.getSelectMenu();
            select.multiSelect(new String[]{"Green","Red"})
                    .verifyMultiSelect(new String[]{"Green","Red"});
        }
        @Test
        public void standardMultiSelectTest(){
            sidePanel.getSelectMenu();
            select.verifySelectedCar("opel", "rgba(25, 103, 210, 1)");
        }
        @Test
    public void hoverMouseOnMenuTest(){
        sidePanel.getMenu();
        new MenuPage(driver).hoverMouseOnMenu()
                .verifySubMenu();

        }
        @Test
    public void sliderTest(){
        sidePanel.getSlider();
            new SliderPage(driver).moveSlider()
                    .verifySliderValue("100");

        }


//        @Test
//    public void toolTipsTest(){
//        sidePanel.getToolTips();
//            new ToolTipsPage(driver).hoversOnToolTips()
//                    .verifyToolTips("buttonToolTip");
//    }
}
//public SliderPage moveSliderTo(int value) {
//    rangeSlider.sendKeys(Keys.HOME);
//    for (int i = 0; i < value; i++) {
//        rangeSlider.sendKeys(Keys.ARROW_RIGHT);
//    }
//    return this;
//}
//@Test
//public void sliderTestTo() {
//    sidePanel.getSlider();
//    new SliderPage(driver)
//            .moveSliderTo(72)
//            .verifySliderValue("72");
//}