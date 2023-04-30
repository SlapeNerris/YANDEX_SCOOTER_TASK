package ru.praktikumservices.qascooter.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.praktikumservices.qascooter.utils.BaseTest;

@Epic("Проверка некорректного статуса заказа")
public class IncorrectStatusTest extends BaseTest {

    @Feature("Проверка некорректного статуса заказа")
    @DisplayName("Проверить вводи некорректного статуса заказа")
    @Test
    public void inputOrder() {
        statusOfOrderPage.inputIncorrectOrder();
    }
}
