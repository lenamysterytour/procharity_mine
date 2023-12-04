package procharity.tests.registerAsFoundation.nameSurnamePosition;
import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

import procharity.tests.registerAsFoundation.EmailTestData;

public class NameSurnamePositionSymbolsTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    EmailTestData testData = new EmailTestData();

    @Disabled
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения символов:любых спецсимволов  - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionAllSpecialSymbolsAreValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.emailInputSpecialSymbols)
                .setLastName(testData.emailInputSpecialSymbols)
                .setPosition(testData.emailInputSpecialSymbols)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Disabled
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения символов:кириллица  - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionCyrillicSymbolsAreValid() {

          mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.emailInputCyrillic)
                .setLastName(testData.emailInputCyrillic)
                .setPosition(testData.emailInputCyrillic)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
 }

    @Disabled
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения символов:латиница  - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLatinSymbolsAreValid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.emailInputLatin)
                .setLastName(testData.emailInputLatin)
                .setPosition(testData.emailInputLatin)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Disabled
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения символов:цифры  - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionDigitsAreValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.emailInputDigits)
                .setLastName(testData.emailInputDigits)
                .setPosition(testData.emailInputDigits)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();

    }
}