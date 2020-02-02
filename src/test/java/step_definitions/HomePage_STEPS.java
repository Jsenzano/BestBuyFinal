package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import step_definitions.step_impl.HomePage_Impl;
import util.ConfigReader;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;
public class HomePage_STEPS {
    HomePage_Impl homePage_Impl = new HomePage_Impl();
    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }
    @Then("Verifies title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save", homePage_Impl.getTitle());
    }
    @When("User sees {string}")
    public void user_sees(String string) {
        homePage_Impl.clickCloseModalSignUp();
        Assert.assertEquals("Today's popular picks", homePage_Impl.getPopularPicksName());
    }
    @When("User navigates to {string}")
    public void user_navigates_to(String navItem) {
        try {
            homePage_Impl.clickCloseModalSignUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        homePage_Impl.clickNavItem(navItem);
    }
    @And("Takes screenshot")
    public void Takes_screenshot() {
        SeleniumUtils.sleep(1000);
        Screenshots.captureScreenShot();
    }
}
