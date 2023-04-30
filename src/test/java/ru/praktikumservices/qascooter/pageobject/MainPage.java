package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static ru.praktikumservices.qascooter.utils.ExpectedTextResults.*;

public class MainPage {
    //Elements
    private SelenideElement
            howMuchHowToPayBtn = $x("//div[@id='accordion__heading-0']"),
            howMuchHowToPayText = $x("//div[@id='accordion__panel-0']/p"),
            wantSomeScootersBtn = $x("//div[@id='accordion__heading-1']"),
            wantSomeScootersText = $x("//div[@id='accordion__panel-1']/p"),
            howIsRentalTimeCalculatedBtn = $x("//div[@id='accordion__heading-2']"),
            howIsRentalTimeCalculatedText = $x("//div[@id='accordion__panel-2']/p"),
            canIRentTodayBtn = $x("//div[@id='accordion__heading-3']"),
            canIRentTodayText = $x("//div[@id='accordion__panel-3']/p"),
            canIContinueOrRefundBtn = $x("//div[@id='accordion__heading-4']"),
            canIContinueOrRefundText = $x("//div[@id='accordion__panel-4']/p"),
            canYoubringChargeBtn = $x("//div[@id='accordion__heading-5']"),
            canYoubringChargeText = $x("//div[@id='accordion__panel-5']/p"),
            canICancelOrderBtn = $x("//div[@id='accordion__heading-6']"),
            canICancelOrderText = $x("//div[@id='accordion__panel-6']/p"),
            iLiveBeforeMkadBtn = $x("//div[@id='accordion__heading-7']"),
            iLiveBeforeMkadText = $x("//div[@id='accordion__panel-7']/p");

    //Actions
    @Step("Проверить текст в выпадающих списках на странице")
    public MainPage clickAndCheckTheDropDownList() {
        howMuchHowToPayBtn.click();
        howMuchHowToPayText.shouldHave(text(EXPECTED_RESULT_TEXT_FIRST));
        wantSomeScootersBtn.click();
        wantSomeScootersText.shouldHave(text(EXPECTED_RESULT_TEXT_SECOND));
        howIsRentalTimeCalculatedBtn.click();
        howIsRentalTimeCalculatedText.shouldHave(text(EXPECTED_RESULT_TEXT_THIRD));
        canIRentTodayBtn.click();
        canIRentTodayText.shouldBe(text(EXPECTED_RESULT_TEXT_FOURTH));
        canIContinueOrRefundBtn.click();
        canIContinueOrRefundText.shouldHave(text(EXPECTED_RESULT_TEXT_FIFTH));
        canYoubringChargeBtn.click();
        canYoubringChargeText.shouldHave(text(EXPECTED_RESULT_TEXT_SIXTH));
        canICancelOrderBtn.click();
        canICancelOrderText.shouldHave(text(EXPECTED_RESULT_TEXT_SEVENTH));
        iLiveBeforeMkadBtn.click();
        iLiveBeforeMkadText.shouldHave(text(EXPECTED_RESULT_TEXT_EIGHTH));

        return this;
    }
}
