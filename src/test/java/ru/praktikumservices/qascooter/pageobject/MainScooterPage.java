package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainScooterPage {
    //Elements
    private SelenideElement
    logoOfScooter = $x("//*[@class='Header_LogoScooter__3lsAR']");

    //Actions
    @Step("Нажать на логотип самоката и попасть на главную страницу")
    public MainScooterPage clickOnTheScooterLogo() {
        logoOfScooter.click();

        return this;
    }
}
