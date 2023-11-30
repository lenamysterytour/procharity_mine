package procharity.tests.registervalidationnko.Email.LengthTests;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

import procharity.tests.TestBase;
import procharity.tests.TestBase;
import procharity.tests.registervalidationnko.TestData;

public class EmailLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    TestData testData = new TestData();

    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 1 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength1IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailValid1length)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 255 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength255IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailValidLength255)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 254 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength254IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailValidLength254)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }


    @Test
    @Tags({@Tag("email"), @Tag("negative"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 256 символа(ов) кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithLength256IsInValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailInValidLength256)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 100 символа(ов) кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength100IsValid() {




        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailValidLength100)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Test
    @Tags({@Tag("email"), @Tag("negative"), @Tag("now")})
    @DisplayName("При вводе в поле \"Электронная почта\" 1000 символа(ов) кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithLength1000IsInValid() {




        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(testData.emailValidLength1000)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
}
