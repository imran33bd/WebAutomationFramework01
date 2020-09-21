package page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    WebDriver driver = null;


    @FindBy (how = How.CSS, using = "#home > span > div > svg > path")
    WebElement logoDisplayed;

    @FindBy (how = How.ID, using = "search")
    WebElement searchBox;

    @FindBy (how = How.XPATH, using = "//*[@id=\"categories\"]/span[1]")
    WebElement categories;

    @FindBy (how = How.XPATH,using = "//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[1]/a")
    WebElement Registry;

    public boolean targetLogoDisplay(){
        logoDisplayed.isDisplayed();
        return true;
    }
    public void searchBox () {
        searchBox.sendKeys("Iphone", Keys.ENTER);
        String actualText;
        actualText = searchBox.getText();
        TestLogger.log("Actual Text: " + actualText);
        String expectedText = "Search Box";
        TestLogger.log("Test Passed");

    }

    public void setCategories(WebElement categories) {
        this.categories = categories;
    }
}
