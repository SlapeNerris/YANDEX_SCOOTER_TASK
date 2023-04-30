package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static ru.praktikumservices.qascooter.utils.ExpectedTextResults.*;

/*1. изменить название класса
2.добавить локатор куки. Сделать проверку на наличие куки на странице, если это кнопка есть, то клик, если нет, то ничего - вынести в бейс тест бифо
3.проверить
4. изменить название переменных селекторов добавить Btn
*/
public class MainPage {
    private SelenideElement cookieAcceptButton = $x("//button[@id='rcc-confirm-button']");
    private SelenideElement
            howMuchHowToPayBtn = $x("//div[@id='accordion__heading-0']"),
            HowMuchHowToPayText = $x("//div[@id='accordion__panel-0']/p"),
            wantSomeScootersBtn = $x("//div[@id='accordion__heading-1']"),
            WantSomeScootersText = $x("//div[@id='accordion__panel-1']/p"),
            howIsRentalTimeCalculatedBtn = $x("//div[@id='accordion__heading-2']"),
            HowIsRentalTimeCalculatedText = $x("//div[@id='accordion__panel-2']/p"),
            canIRentTodayBtn = $x("//div[@id='accordion__heading-3']"),
            CanIRentTodayText = $x("//div[@id='accordion__panel-3']/p"),
            canIContinueOrRefundBtn = $x("//div[@id='accordion__heading-4']"),
            CanIContinueOrRefundText = $x("//div[@id='accordion__panel-4']/p"),
            canYoubringChargeBtn = $x("//div[@id='accordion__heading-5']"),
            CanYoubringChargeText = $x("//div[@id='accordion__panel-5']/p"),
            canICancelOrderBtn = $x("//div[@id='accordion__heading-6']"),
            CanICancelOrderText = $x("//div[@id='accordion__panel-6']/p"),
            iLiveBeforeMkadBtn = $x("//div[@id='accordion__heading-7']"),
            iLiveBeforeMkadText = $x("//div[@id='accordion__panel-7']/p");

    @Step("Проверить текст в выпадающих списках на странице")
    public MainPage clickAndCheckTheDropDownList() {
        howMuchHowToPayBtn.click();
        HowMuchHowToPayText.shouldHave(text(EXPECTED_RESULT_TEXT_FIRST));
        wantSomeScootersBtn.click();
        WantSomeScootersText.shouldHave(text(EXPECTED_RESULT_TEXT_SECOND));
        howIsRentalTimeCalculatedBtn.click();
        HowIsRentalTimeCalculatedText.shouldHave(text(EXPECTED_RESULT_TEXT_THIRD));
        canIRentTodayBtn.click();
        CanIRentTodayText.shouldBe(text(EXPECTED_RESULT_TEXT_FOURTH));
        canIContinueOrRefundBtn.click();
        CanIContinueOrRefundText.shouldHave(text(EXPECTED_RESULT_TEXT_FIFTH));
        canYoubringChargeBtn.click();
        CanYoubringChargeText.shouldHave(text(EXPECTED_RESULT_TEXT_SIXTH));
        canICancelOrderBtn.click();
        CanICancelOrderText.shouldHave(text(EXPECTED_RESULT_TEXT_SEVENTH));
        iLiveBeforeMkadBtn.click();
        iLiveBeforeMkadText.shouldHave(text(EXPECTED_RESULT_TEXT_EIGHTH));

        return this;
    }
}
