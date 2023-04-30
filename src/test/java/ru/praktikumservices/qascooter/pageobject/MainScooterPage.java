package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

//Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката».
public class MainScooterPage {
    private SelenideElement
    logoOfScooter = $x("//*[@class='Header_LogoScooter__3lsAR']");

    @Step("Нажать на логотип самоката и попасть на главную страницу")
    public MainScooterPage clickOnTheScooterLogo() {
        logoOfScooter.click();

        return this;
    }
}
