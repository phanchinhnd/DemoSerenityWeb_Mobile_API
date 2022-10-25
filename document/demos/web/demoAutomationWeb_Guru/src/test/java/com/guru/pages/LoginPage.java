package com.guru.pages;

import com.guru.core.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class LoginPage extends BasePage {
    @FindBy(name = "uid")
    private WebElementFacade tbUserName;
    @FindBy(name = "password")
    private WebElementFacade tbPassWord;
    @FindBy(id = "site-name")
    private WebElementFacade textInBottom;
    @FindBy(name = "btnLogin")
    private WebElementFacade btnLogin;

    public void verifyTextInBottom() {
        waitForElemenetVisible(textInBottom);
        Assert.assertTrue("@2022 T-RECs.ai All Rights Reserved is not Displayed", textInBottom.isDisplayed());
    }

    public void inputToUsername(String text) {
        tbUserName.waitUntilVisible();
        sendKeyToElement(tbUserName, text);
    }

    public void inputToPassword(String text) {
        sendKeyToElement(tbPassWord, text);
    }

    public void clickToLogin() {
        clickToElement(btnLogin);
    }
}
