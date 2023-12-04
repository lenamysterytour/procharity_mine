package procharity.tests.registerAsFoundation.Phone;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.registerAsFoundation.PhoneTestData;

public class PhoneSymbols {

    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    PhoneTestData phoneTestData = new PhoneTestData();

    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("При вводе в поле телефон символов: букв кириллицы - кнопка Зарегистрироваться активна")
    public void phoneInputWithCyrillicSymbolsWorksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneInvalidSymbolsCyrillic)
                .clickRegisterButton()
                .checkPhoneErrorAppears();
    }

    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("При вводе в поле телефон символов: букв латиницы - кнопка Зарегистрироваться активна")
    public void phoneInputWithLatinSymbolsWorksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneInvalidSymbolsLatin)
                .clickRegisterButton()
                .checkPhoneErrorAppears();
    }
    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("При вводе в поле телефон символов: спецсимволов - кнопка Зарегистрироваться активна")
    public void phoneInputWithSpecialSymbolsWorksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneInvalidSymbolsSpecialSymbols)
                .clickRegisterButton()
                .checkPhoneErrorAppears();
    }
}
