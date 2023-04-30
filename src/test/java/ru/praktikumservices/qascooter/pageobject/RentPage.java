package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static ru.praktikumservices.qascooter.utils.ExpectedTextResults.EXPECTED_RESULT_TEXT_NINTH;

public class RentPage {
    //Elements
    private SelenideElement
            whenDelieverScooter = $x("//input[@placeholder='* Когда привезти самокат']"),
            chooseDate = $x("//div[@aria-label='Choose пятница, 28-е апреля 2023 г.']"),
            dropDownOfrentalPeriod = $x("//div[@class='Dropdown-root']"),
            chooseRentalPeriod = $x("//*[text()='сутки']"),
            colorOfScooter = $x("//input[@id='black']"),
            commentForCourier = $x("//input[@placeholder='Комментарий для курьера']"),
            btnOrderInRent = $x("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"),
            btnOfAcceptOrderYes = $x("//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Да']"),
            checkOfSuccesOrder = $x("//div[@class='Order_ModalHeader__3FDaJ']");

    //Actions
    @Step("Заполнить все поля на странице 'Про аренду'")
    public RentPage orderScooterRent() {
        whenDelieverScooter.click();
        chooseDate.click();
        dropDownOfrentalPeriod.click();
        chooseRentalPeriod.click();
        colorOfScooter.click();
        commentForCourier.setValue("Privet");
        btnOrderInRent.click();
        btnOfAcceptOrderYes.click();
        checkOfSuccesOrder.shouldHave(Condition.text(EXPECTED_RESULT_TEXT_NINTH));
        return this;
    }
}
