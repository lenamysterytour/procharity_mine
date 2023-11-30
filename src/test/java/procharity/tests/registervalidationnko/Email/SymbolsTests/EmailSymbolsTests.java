package procharity.tests.registervalidationnko.Email.SymbolsTests;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class EmailSymbolsTests extends TestBase {


    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();

    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("При вводе в доменную часть символов латиницы кнопка \"Зарегистрироваться\" активна")
    public void emailWithLatinDomainPartIsValid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@gmail.com")

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("При вводе в доменную часть цифр кнопка \"Зарегистрироваться\" активна")
    public void emailWithDigitsInDomainPartIsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@1234.12")

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();


    }


    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе в доменную часть кириллицы кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithCyrillicDomainPartCausesError() {

         mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@гмейл.ру")

                .clickRegisterButton()
                .checkEmailErrorAppears();
    }
    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("При вводе в доменную часть разрешенных символов кнопка \"Зарегистрироваться\" активна")
    public void emailWithAllowedSymbolsInDomainPartIsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("procharity@!#$%&'*+-/=?^_`[|](~).,:;@.com")

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("При вводе в доменную часть неразрешенных символов кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithForbiddenSymbolsInDomainPartIsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail("№[],<>")

                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

}
