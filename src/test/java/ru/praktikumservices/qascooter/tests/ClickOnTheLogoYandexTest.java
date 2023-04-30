package ru.praktikumservices.qascooter.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.praktikumservices.qascooter.utils.BaseTest;



@Epic("Нажать на лого Яндекс и попасть на главную страницу")
public class ClickOnTheLogoYandexTest extends BaseTest {

    @Feature("Нажать на лого Яндекс и попасть на поисковую страницу")
    @DisplayName("Проверка нажатия на лого Яндекс")
    @Test
    public void clickOnTheYandexLogo() {
        mainYandexPage.clickOnTheYandexLogo();
    }
}
