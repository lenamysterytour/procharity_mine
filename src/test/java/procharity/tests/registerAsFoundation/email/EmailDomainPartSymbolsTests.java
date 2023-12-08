package procharity.tests.registerAsFoundation.email;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;


public class EmailDomainPartSymbolsTests extends TestBase {


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


}
