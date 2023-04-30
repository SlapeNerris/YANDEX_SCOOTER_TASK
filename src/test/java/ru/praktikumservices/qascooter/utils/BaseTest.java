package ru.praktikumservices.qascooter.utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import ru.praktikumservices.qascooter.config.WebDriverProvider;
import ru.praktikumservices.qascooter.pageobject.*;
import ru.praktikumservices.qascooter.tests.IncorrectStatusTest;

import static ru.praktikumservices.qascooter.config.ConfigSingle.config;

@DisplayName("Конфигруация тестов")
public class BaseTest extends WebDriverProvider {
    protected MainPage mainPage = new MainPage();
    protected WhoIsTheScooterForPage whoIsTheScooterForPage = new WhoIsTheScooterForPage();
    protected RentPage rentPage = new RentPage();
    protected MainScooterPage mainScooterPage = new MainScooterPage();
    protected MainYandexPage mainYandexPage= new MainYandexPage();
    protected StatusOfOrderPage statusOfOrderPage = new StatusOfOrderPage();
    protected static AcceptCookiesMainPage acceptCookies = new AcceptCookiesMainPage();

    @DisplayName("Конфигурация перед классом тестов")
    @BeforeAll
    public static void beforeClass(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        createDriver();
        Selenide.open(config.getBaseUriProperties());
        acceptCookies.acceptAndCheckCookies();
    }
    @DisplayName("Конфигурация после теста")
    @AfterEach
    public void afterClass() {
        Selenide.closeWebDriver();
    }
}
