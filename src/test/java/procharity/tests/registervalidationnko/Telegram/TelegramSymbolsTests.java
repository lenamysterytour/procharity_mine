package procharity.tests.registervalidationnko.Telegram;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.MainPage;
import procharity.tests.TestBase;
import procharity.tests.registervalidationnko.TestData;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TelegramSymbolsTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
TestData testData = new TestData();

    @Test
    @Tags({@Tag("telegram"), @Tag("telegramsymbols")})
    @DisplayName("При вводе в поле Телеграм символов кириллицы кнопка \"Зарегистрироваться\" неактивна")
    public void telegramWithCyrillicSymbolsIsInvalid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram("Прочарити")

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }


    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("telegramsymbols")})
    @DisplayName("При вводе в поле Телеграм символов латиницы без собачки кнопка \"Зарегистрироваться\" активна")
    public void telegramWithLatinSymbolsWithoutAtSignIsInvalid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram("Procharity")

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }


    @Test
    @Tags({@Tag("telegram"), @Tag("telegramsymbols")})
    @DisplayName("При вводе в поле Телеграм символов латиницы с собачкой кнопка \"Зарегистрироваться\" неактивна")
    public void telegramWithLatinSymbolsWithAtSignIsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram("@Procharity")

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }
    @Test
    @Tags({@Tag("telegram"), @Tag("telegramsymbols")})
    @DisplayName("При вводе в поле Телеграм спецсимволов кнопка \"Зарегистрироваться\" неактивна")
    public void telegramWithSpecialSymbolsIsInvalid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram("!@#$%^&*()_+")

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }
    @Tag("now")
    @Test
    public void telegramWithDigitsIsInvalid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram("1234")

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }




}
