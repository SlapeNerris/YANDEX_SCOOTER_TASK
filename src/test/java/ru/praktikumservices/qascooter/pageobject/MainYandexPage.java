package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.*;



public class MainYandexPage {
    private SelenideElement logoOfYandex = $x("//*[@class='Header_LogoYandex__3TSOI']");

    @Step("Нажать на логотип Яндекс и попасть в поисковик")
    public MainYandexPage clickOnTheYandexLogo() {
        logoOfYandex.click();

        return this;
    }

}
