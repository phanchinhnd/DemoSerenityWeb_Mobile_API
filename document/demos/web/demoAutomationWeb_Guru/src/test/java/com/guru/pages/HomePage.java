package com.guru.pages;

import com.guru.core.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[text()='Log out']")

    private WebElementFacade btnLogout;

    public void isLogoutDisplayed() {
        waitForElemenetVisible(btnLogout);
    }
}
