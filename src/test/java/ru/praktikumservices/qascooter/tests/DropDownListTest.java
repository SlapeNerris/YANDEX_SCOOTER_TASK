package ru.praktikumservices.qascooter.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.praktikumservices.qascooter.utils.BaseTest;

@Epic("Выпадающий список в разделе «Вопросы о важном»")
public class DropDownListTest extends BaseTest {

    @Feature("Выпадающий список в разделе «Вопросы о важном»")
    @DisplayName("Проверка выпадающего списка в разделе «Вопросы о важном»")
    @Test
    public void clickOnThePointer() {
        mainPage.clickAndCheckTheDropDownList();

    }
}
