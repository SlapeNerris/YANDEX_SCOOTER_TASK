package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

//Заказ самоката. Весь флоу позитивного сценария. Обрати внимание, что есть две точки входа в сценарий: кнопка «Заказать» вверху страницы и внизу.
//Из чего состоит позитивный сценарий:
//Нажать кнопку «Заказать». На странице две кнопки заказа.
//Заполнить форму заказа.
//Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа.
public class WhoIsTheScooterForPage {
    private SelenideElement cookieAcceptButton = $x("//button[@id='rcc-confirm-button']");

    private SelenideElement
            btnOrder = $x("//button[@class='Button_Button__ra12g']"),
            fillFormName = $x("//input[@placeholder='* Имя']"),
            fillFormSurname = $x("//input[@placeholder='* Фамилия']"),
            fillFormAddress = $x("//input[@placeholder='* Адрес: куда привезти заказ']"),
            fillFormMetro = $x("//input[@placeholder='* Станция метро']"),
            chooseMetro = $x("//button[@value='1']"),
            fillFormNumber = $x("//input[@placeholder='* Телефон: на него позвонит курьер']"),
            btnNext = $x("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

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
