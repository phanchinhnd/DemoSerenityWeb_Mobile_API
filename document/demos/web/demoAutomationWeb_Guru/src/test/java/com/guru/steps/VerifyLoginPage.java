package com.guru.steps;

import com.guru.pages.HomePage;
import com.guru.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class VerifyLoginPage {
    @Steps
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("Navigate successfull ly to Login Page")
    public void navigateSuccessfullLyToLoginPage() {
        loginPage.open();
    }

    @Then("Verify Guru All Rights Reserved in bottom")
    public void verifyTRECsAiAllRightsReservedInBottom() {
        loginPage.verifyTextInBottom();
    }


    @When("Input {string} to username")
    public void inputToUsername(String username) {
        loginPage.inputToUsername(username);
    }

    @And("Input {string} to password")
    public void inputToPassword(String password) {
        loginPage.inputToPassword(password);
    }

    @And("Click to Login")
    public void clickToLogin() {
        loginPage.clickToLogin();
    }

    @Then("Verify Logout is displayed in Homepage")
    public void verifyLogoutIsDisplayedInHomepage() {
        homePage.isLogoutDisplayed();
    }
}
