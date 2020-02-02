package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import java.util.List;
public class HomePage {
    private WebDriver driver = Driver.getDriver();
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//h3[@class='carousel-with-dotd-Carousel-headline v-m-bottom-xs'])[2]")
    public WebElement popularPicksName;
    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeModalSignUp;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[1]")
    public WebElement navCreditCards_btn;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[2]")
    public WebElement navTopDeals_btn;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[2]")
    public WebElement navDealOfTheDay_btn;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[2]")
    public WebElement navGiftIdeas_btn;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[2]")
    public WebElement navForYourBusiness_btn;
    @FindBy(xpath = "(//nav[@class='top-nav-items']/ul/li/a)[4]")
    public WebElement navGiftCards_btn;
    @FindBy(xpath = "//div[@class='utility-navigation']/a")
    public List<WebElement> utilityNavigationList;
}