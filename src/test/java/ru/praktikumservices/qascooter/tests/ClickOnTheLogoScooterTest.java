package ru.praktikumservices.qascooter.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.praktikumservices.qascooter.utils.BaseTest;

@Epic("Нужно нажать на лого Самокать и перейти на главную страницу")
public class ClickOnTheLogoScooterTest extends BaseTest {

    @Feature("Нажать на лого Самокат и попасть на главную страницу")
    @DisplayName("Проверка нажатия на лого Самокат")
    @Test
    public void clickOnTheScooterLogo() {
        mainScooterPage.clickOnTheScooterLogo();
    }
}
