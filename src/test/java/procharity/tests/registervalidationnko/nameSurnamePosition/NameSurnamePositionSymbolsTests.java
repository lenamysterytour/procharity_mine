package procharity.tests.registervalidationnko.nameSurnamePosition;
import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

import procharity.tests.TestBase;
import procharity.tests.registervalidationnko.TestData;

public class NameSurnamePositionSymbolsTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    TestData testData = new TestData();

    @Disabled
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения символов:любых спецсимволов  - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionAllSpecialSymbolsAreValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.universalInputSpecialSymbols)
                .setLastName(testData.universalInputSpecialSymbols)
                .setPosition(testData.universalInputSpecialSymbols)

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
                .setName(testData.universalInputCyrillic)
                .setLastName(testData.universalInputCyrillic)
                .setPosition(testData.universalInputCyrillic)

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
                .setName(testData.universalInputLatin)
                .setLastName(testData.universalInputLatin)
                .setPosition(testData.universalInputLatin)

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
                .setName(testData.universalInputDigits)
                .setLastName(testData.universalInputDigits)
                .setPosition(testData.universalInputDigits)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();

    }
}