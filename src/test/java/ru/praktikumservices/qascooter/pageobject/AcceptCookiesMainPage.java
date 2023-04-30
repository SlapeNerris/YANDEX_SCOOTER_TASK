package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AcceptCookiesMainPage {
    //Elements
    private SelenideElement cookieAcceptButton = $x("//button[@id='rcc-confirm-button']");

    //Actions
    @Step("Принять cookie на странице")
    public void acceptAndCheckCookies() {
        if (cookieAcceptButton.isDisplayed()) {
            cookieAcceptButton.click();
        }
    }
}
