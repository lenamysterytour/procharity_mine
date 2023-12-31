package procharity.tests.registerAsFoundation.email;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;


public class EmailLocalPartSymbolsTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();

    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе в локальную часть кириллицы кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithCyrillicLocalPartCausesError() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("прочарити@gmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    @Disabled("Отключено, чтобы не попадать в базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("При вводе в локальную часть цифр кнопка \"Зарегистрироваться\" активна")
    public void emailWithDigitsInLocalPartIsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("1234@gmail.com")
                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }


    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе email без символа собачки кнопка Зарегистрироваться неактивна")
    public void emailWithoutAtSignCausesError() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharitygmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе точки после @ возникает ошибка")
    public void emailWithDotSignAfterAtSignCausesError() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@.gmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе емейл с точкой в качестве первого символа возникает ошибка")
    public void emailWithDotAsFirstSymbolCausesError() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(".procharity@gmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    @Test
    @Tags({@Tag("email"), @Tag("now")})
    @DisplayName("При вводе емейла с точкой в качестве последнего символа возникает ошибка")
    public void emailWithDotAsLastSymbolCausesError() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@gmail.com.")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }


}
