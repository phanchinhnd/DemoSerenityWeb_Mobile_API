package com.guru.core;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage extends PageObject {
    public void clickToElement(WebElementFacade element) {
        element.click();
    }

    public void sendKeyToElement(WebElementFacade element, String text) {
        element.sendKeys(text);
    }

    public void waitForElemenetVisible(WebElementFacade element) {
        waitForCondition().until(ExpectedConditions.visibilityOfAllElements(element));
    }
}
