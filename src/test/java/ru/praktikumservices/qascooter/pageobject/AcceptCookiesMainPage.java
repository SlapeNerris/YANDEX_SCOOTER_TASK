package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AcceptCookiesMainPage {
    private SelenideElement cookieAcceptButton = $x("//button[@id='rcc-confirm-button']");

    @Step("Принять cookie на странице")
    public void acceptAndCheckCookies() {
        if (cookieAcceptButton.isDisplayed()) {
            cookieAcceptButton.click();
        }
    }
}
