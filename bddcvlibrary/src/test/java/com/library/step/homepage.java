package com.library.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepage {
    @Given("^User is on Homepage\\.$")
    public void userIsOnHomepage() {

    }

    @When("^I enterJobTitle \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle("Tester");  }

    @And("^I enterLocation \"([^\"]*)\"$")
    public void iEnterLocation(String location){
        new HomePage().enterLocation("Watford"); }

    @And("^I selectDistance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance("10 miles"); }

    @And("^I clickOnMoreSearchOptionLink$")
    public void iClickOnMoreSearchOptionLink(){
        new HomePage().clickOnMoreSearchOptionLink(); }

    @And("^I enterMinSalary \"([^\"]*)\"$")
    public void iEnterMinSalary(String minSalary){
        new HomePage().enterMinSalary("35000"); }

    @And("^I enterMaxSalary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String maxSalary){
        new HomePage().enterMaxSalary("45000"); }

    @And("^I selectSalaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String Type) {
        new HomePage().selectSalaryType("Per annum");}

    @And("^I selectJobType \"([^\"]*)\"$")
    public void iSelectJobType(String JobType) {
        new HomePage().selectJobType("Permanent");}

    @Then("^I clickOnFindJobsButton$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }
}
