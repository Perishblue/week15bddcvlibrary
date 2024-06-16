package com.library.step;

import com.library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public void verifyJobSearchResult() {


        enterJobTitle("Tester");
        enterLocation("Harrow");
        selectDistance("5 miles");
        clickOnMoreSearchOptionLink();
        enterMinSalary("30000");
        enterMaxSalary("500000");
        selectSalaryType("Per annum");
        selectJobType("Permanent");
        clickOnFindJobButton();
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;

    @CacheLookup
    @FindBy(xpath = "div[@class='hp-search-more']/button")
    WebElement MoreSearch;

    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-min']/input")
    WebElement SalaryMin;

    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-max']/input")
    WebElement SalaryMax;

    @CacheLookup
    @FindBy(xpath = "//div[@class='home-search hps-transition advanced']/div[4]/input")
    WebElement findJobbutton;

    public void enterJobTitle(String jobTitle){sendTextToElement(JobTitle,jobTitle);}

    public void enterLocation(String location){sendTextToElement(Location,location);}

    public void selectDistance(String distance){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='distance']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(distance);
    }
    public void clickOnMoreSearchOptionLink(){clickOnElement(MoreSearch);}

    public void enterMinSalary(String minSalary){sendTextToElement(SalaryMin, minSalary);}

    public void enterMaxSalary(String maxSalary){sendTextToElement(SalaryMax,maxSalary);}

    public void selectSalaryType(String Type){
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='salarytype']"));
        Select select1 = new Select(dropDown1);
        select1.selectByVisibleText(Type);
    }
    public void selectJobType(String jobType){
        WebElement dropdowm2 = driver.findElement(By.xpath("//select[@id='tempperm']"));
        Select select2 = new Select(dropdowm2);
        select2.selectByVisibleText(jobType);
    }
    public void clickOnFindJobButton(){clickOnElement(findJobbutton);}
}
