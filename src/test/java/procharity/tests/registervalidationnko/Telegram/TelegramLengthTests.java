package procharity.tests.registervalidationnko.Telegram;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;
import procharity.tests.registervalidationnko.TestData;

public class TelegramLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    TestData testData = new TestData();
    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 5 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void telegramLength5IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.TelegramLength5)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }

    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 32 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void telegramLength32IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.TelegramLength32)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }

    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 16 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void telegramLength16IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.TelegramLength16)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }

    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 33 символа(ов) кнопка \"Зарегистрироваться\" неактивна")
    public void telegramLength33IsInvalid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.TelegramLength33)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }
    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 1000 символа(ов) кнопка \"Зарегистрироваться\" неактивна")
    public void telegramLength1000IsInvalid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.universalInputLength1000)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }


    @Test
    @Tags({@Tag("telegram"), @Tag("negative"),@Tag("now")})
    @DisplayName("Поле Телеграм обязательное: при вводе значения длиной 0 символа(ов) кнопка \"Зарегистрироваться\" неактивна")
    public void telegramLength0IsInvalid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(testData.universalInputLength0)

                .clickRegisterButton()
                .checkTelegramErrorAppears();
    }

}
