package com.demoqa.pages;
import com.demoqa.pages.elements.UploadPage;
import com.demoqa.core.BasePage;
import com.demoqa.pages.alertsFrameWindows.AlertPages;
import com.demoqa.pages.alertsFrameWindows.FramesPage;
import com.demoqa.pages.alertsFrameWindows.NestedFramesPage;
import com.demoqa.pages.alertsFrameWindows.WindowsPage;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.elements.BrokenLinksImagesPage;
import com.demoqa.pages.elements.ButtonPage;
import com.demoqa.pages.elements.TextBoxPage;
import com.demoqa.widgets.MenuPage;
import com.demoqa.widgets.SelectPage;
import com.demoqa.widgets.SliderPage;
import com.demoqa.widgets.ToolTipsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);


    }
    @FindBy(css = "a[href='/login']")
    WebElement loginLink;
    public LoginPage getLogin() {
        clickWithJS(loginLink);
        return new LoginPage(driver);
    }


    @FindBy(css = "a[href='/alerts']")
    WebElement alertItem;
    public AlertPages getAlerts() {
        clickWithJS(alertItem);
        return new AlertPages(driver);
    }
    @FindBy(css = "a[href='/browser-windows']")
    WebElement browserWindows;
    public WindowsPage getBrowserWindows() {
        clickWithJS(browserWindows);
        return new WindowsPage(driver);
    }
    @FindBy(css = "a[href='/frames']")
    WebElement frames;
    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);
    }
    @FindBy(css = "a[href='/nestedframes']")
    WebElement nestedFrames;
    public NestedFramesPage getNestedFrames() {
        clickWithJS(nestedFrames);
        return new NestedFramesPage(driver);
    }
@FindBy(css = "a[href='/select-menu']")
WebElement selectMenu;
    public SelectPage getSelectMenu() {
        clickWithJS(selectMenu);
        return new SelectPage(driver);
    }
    @FindBy(css = "a[href='/menu']")
    WebElement menu;
    public MenuPage getMenu() {
        clickWithJS(menu);
        return new MenuPage(driver);
    }
    @FindBy(css = "a[href='/slider']")
    WebElement slider;
    public SliderPage getSlider() {
        clickWithJS(slider);
        return new SliderPage(driver);
    }
    @FindBy(css = "a[href='/tool-tips']")
    WebElement toolTips;
    public ToolTipsPage getToolTips() {
        return new ToolTipsPage(driver);
    }
    @FindBy(css="a[href='/buttons']")
    WebElement buttons;
    public ButtonPage getButtons() {
        clickWithJS(buttons);
        return new ButtonPage(driver);
    }
    @FindBy(css = "a[href='/text-box']")
    WebElement textBox;
    public TextBoxPage getTextBox() {
        clickWithJS(textBox);
        return new TextBoxPage(driver);
    }
    @FindBy(css = "a[href='/broken']" )
    WebElement broken;
    public BrokenLinksImagesPage getBrokenLinkImages() {
        clickWithJS(broken);
        return new BrokenLinksImagesPage(driver);
    }
    @FindBy(css="a[href='/upload-download']")
    WebElement uploads;

    public UploadPage getUpload() {
        clickWithJS(uploads);
        return new UploadPage(driver);
    }
}


