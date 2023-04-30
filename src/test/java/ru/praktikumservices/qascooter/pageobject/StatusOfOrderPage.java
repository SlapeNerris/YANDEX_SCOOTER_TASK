package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class StatusOfOrderPage {
    //Elements
    private SelenideElement
    statusOfOrder = $x("//*[@class='Header_Link__1TAG7']"),
    inputNumber = $x("//*[@class='Input_Input__1iN_Z Header_Input__xIoUq']"),
    goBtn = $x("//*[@class='Button_Button__ra12g Header_Button__28dPO']"),
    trackNotFound = $x("//*[@alt='Not found']");

    //Actions
    @Step("Проверить статус заказа 'Такого заказа нет'")
    public StatusOfOrderPage inputIncorrectOrder() {
        statusOfOrder.click();
        inputNumber.setValue("123456");
        goBtn.click();
        trackNotFound.shouldHave(Condition.image);
        return this;
    }
}
