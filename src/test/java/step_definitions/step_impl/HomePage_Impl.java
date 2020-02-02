package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;
public class HomePage_Impl {
    private WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    public String getTitle(){
        return driver.getTitle();
    }
    public void clickCloseModalSignUp(){
        SeleniumUtils.click(homePage.closeModalSignUp);
    }
    public String getPopularPicksName(){
        return homePage.popularPicksName.getText();
    }
    public void clickNavItem(String name){
        switch (name.toLowerCase()){
            case "credit cards": SeleniumUtils.click(homePage.navCreditCards_btn);
                break;
            case "top deals": SeleniumUtils.click(homePage.navTopDeals_btn);
                break;
            case "deal of the day": SeleniumUtils.click(homePage.navDealOfTheDay_btn);
                break;
            case "gift cards": SeleniumUtils.click(homePage.navGiftCards_btn);
                break;
            case "gift ideas": SeleniumUtils.click(homePage.navGiftIdeas_btn);
                break;
            case "for your business": SeleniumUtils.click(homePage.navForYourBusiness_btn);
                break;
        }
    }
}
