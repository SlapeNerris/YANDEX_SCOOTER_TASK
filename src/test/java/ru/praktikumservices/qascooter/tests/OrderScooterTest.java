package ru.praktikumservices.qascooter.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.praktikumservices.qascooter.utils.BaseTest;

@Epic("Заказать самокат")
public class OrderScooterTest extends BaseTest {

    @Feature("Заказ самоката")
    @DisplayName("Проверка заказа самоката")
    @Test
    public void orderScooter() {
        whoIsTheScooterForPage.orderScooterForSomeone();
        rentPage.orderScooterRent();
    }

}
