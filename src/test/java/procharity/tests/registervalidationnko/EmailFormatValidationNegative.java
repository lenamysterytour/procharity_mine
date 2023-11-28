package procharity.tests.registervalidationnko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class EmailFormatValidationNegative extends TestBase {

    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе в доменную часть кириллицы кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithCyrillicDomainPartCausesError() {

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

     //   step("open mainpage > register as foundation"),->  //add steps
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();)

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@гмейл.ру")

                .clickRegisterButton()
                .checkEmailErrorAppears();
    }


    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе в локальную часть кириллицы кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithCyrillicLocalPartCausesError() {

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("прочарити@gmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }


    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе email без символа собачки кнопка Зарегистрироваться неактивна")
    public void emailWithoutAtSignCausesError() {

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

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

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

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

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(".procharity@gmail.com")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе емейла с точкой в качестве последнего символа возникает ошибка")
    public void emailWithDotAsLastSymbolCausesError() {

        MainPage mainPage = new MainPage();
        ContactFacepage contactFacepage = new ContactFacepage();

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@gmail.com.")
                .clickRegisterButton()
                .checkEmailErrorAppears();
    }


}
