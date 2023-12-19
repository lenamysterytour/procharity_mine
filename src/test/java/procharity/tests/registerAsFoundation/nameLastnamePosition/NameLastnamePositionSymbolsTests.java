package procharity.tests.registerAsFoundation.nameLastnamePosition;
import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;


import procharity.tests.registerAsFoundation.EmailTestData;

public class NameLastnamePositionSymbolsTests extends TestBase {
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
                .setName(testData.getEmailInputSpecialSymbols())
                .setLastName(testData.getEmailInputSpecialSymbols())
                .setPosition(testData.getEmailInputSpecialSymbols())

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
                .setName(testData.getEmailInputCyrillic())
                .setLastName(testData.getEmailInputCyrillic())
                .setPosition(testData.getEmailInputCyrillic())

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
                .setName(testData.getEmailInputLatin())
                .setLastName(testData.getEmailInputLatin())
                .setPosition(testData.getEmailInputLatin())

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
                .setName(testData.getEmailInputDigits())
                .setLastName(testData.getEmailInputDigits())
                .setPosition(testData.getEmailInputDigits())

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();

    }
}