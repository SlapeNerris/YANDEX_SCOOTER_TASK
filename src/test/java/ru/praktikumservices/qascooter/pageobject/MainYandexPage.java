package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainYandexPage {
    //Elements
    private SelenideElement logoOfYandex = $x("//*[@class='Header_LogoYandex__3TSOI']");

    //Actions
    @Step("Нажать на логотип Яндекс и попасть в поисковик")
    public MainYandexPage clickOnTheYandexLogo() {
        logoOfYandex.click();

        return this;
    }

}
