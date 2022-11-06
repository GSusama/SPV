package StepDefinitions;

import PageObjectModel.SolarEnergyCalculatorPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SolarEnergyCalculator {
    public WebDriver driver;
    public SolarEnergyCalculatorPageObjects solarEnergyCalculatorPageObjects;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        solarEnergyCalculatorPageObjects = new SolarEnergyCalculatorPageObjects(driver);
    }

    @Given("Launching solar energy calculator site {string}")
    public void launching_solar_energy_calculator(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("Entering postcode {string}")
    public void entering_postcode(String postcode) {
        solarEnergyCalculatorPageObjects.enterPostcode(postcode);
    }

    @Then("Verifying postcode is valid {string}")
    public void postcode_validation(String string) {
        solarEnergyCalculatorPageObjects.postcodeValidation(string);
    }
    @And("Trying to enter the calculator page by clicking next button error popup shown")
    public void trying_enter_the_calculator_page_by_clicking_next_button() {
        solarEnergyCalculatorPageObjects.tryingToEnterIntoSolarCalculator();
    }

    @And("Entering into the calculator page by clicking next button")
    public void entering_into_the_calculator_page_by_clicking_next_button() {
        solarEnergyCalculatorPageObjects.enterIntoSolarCalculator();
    }

    @Then("Selecting roof slope {int} degree")
    public void selecting_roof_slope(int slope) {
        solarEnergyCalculatorPageObjects.selectingRoofSlope(slope);

    }

    @And("Selecting shading {int} percentage")
    public void selecting_shading_percentage(int shade) {
        solarEnergyCalculatorPageObjects.selectingShadingValue(shade);

    }

    @And("Selecting installation size {string}")
    public void selecting_installation_size(String string) {
        solarEnergyCalculatorPageObjects.selectingInstallationSize(string);

    }

    @And("Reaching result page by clicking the next button")
    public void checking_result_by_clicking_the_next_button() {
        solarEnergyCalculatorPageObjects.gettingResultPage();
    }

    @Then("Checking for {string}")
    public void checking_Potential_annual_benefit(String string) {
        solarEnergyCalculatorPageObjects.checkingAnnualBenefit(string);
    }

    @After
    @And("Closing browser window")
    public void close() {
        driver.quit();
    }

}
