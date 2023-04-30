package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class WhoIsTheScooterForPage {
    //Elements
    private SelenideElement
            btnOrder = $x("//button[@class='Button_Button__ra12g']"),
            fillFormName = $x("//input[@placeholder='* Имя']"),
            fillFormSurname = $x("//input[@placeholder='* Фамилия']"),
            fillFormAddress = $x("//input[@placeholder='* Адрес: куда привезти заказ']"),
            fillFormMetro = $x("//input[@placeholder='* Станция метро']"),
            chooseMetro = $x("//button[@value='1']"),
            fillFormNumber = $x("//input[@placeholder='* Телефон: на него позвонит курьер']"),
            btnNext = $x("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

            //Actions
            @Step("Заполнить все поля на странице 'Для кого самокат'")
            public WhoIsTheScooterForPage orderScooterForSomeone() {
                btnOrder.click();
                fillFormName.setValue("Иван");
                fillFormSurname.setValue("Иванов");
                fillFormAddress.setValue("Рассветная");
                fillFormMetro.click();
                chooseMetro.click();
                fillFormNumber.setValue("79329999999");
                btnNext.click();

                return this;
            }

}
