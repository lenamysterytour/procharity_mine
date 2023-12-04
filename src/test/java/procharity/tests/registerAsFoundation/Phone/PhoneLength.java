package procharity.tests.registerAsFoundation.Phone;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;

import procharity.tests.TestBase;
import procharity.tests.registerAsFoundation.PhoneTestData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PhoneLength extends TestBase {

    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    PhoneTestData phoneTestData = new PhoneTestData();

    @Disabled
    @Test
    @Tags({@Tag("phone"),@Tag("positive")})
    @DisplayName("При вводе в поле телефон значения длиной 10 символа(ов) - кнопка Зарегистрироваться активна")
    public void phoneLength10works() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneValidLength10)
                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("При вводе в поле телефон значения длиной 9 символа(ов) - кнопка Зарегистрироваться неактивна")
    public void phoneLength9worksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneInvalidLength9)
                .clickRegisterButton()
                .checkPhoneErrorAppears();

    }

    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("Поле Телефон обязательное: при вводе в поле телефон значения длиной 0 символа(ов) - кнопка Зарегистрироваться неактивна")
    public void phoneLength0WorksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(phoneTestData.phoneInvalidLength0)
                .clickRegisterButton()
                .checkEmptyErrorAppears();
    }


    @Test
    @Tags({@Tag("phone"), @Tag("positive"),@Tag("new")})
    @DisplayName("При вводе в поле телефон значений огромной длины символы не вводятся т.к. стираются автоматически")
    public void phoneBigLengthGetsErased() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage
                .setNumber(phoneTestData.phoneInvalidHugeLength);

        String phoneInput = $(".contacts__phone").getValue();
        System.out.println(phoneInput);
        Assertions.assertTrue((phoneInput.length() < 50));

    }




    @Test
    @Tags({@Tag("phone"),@Tag("negative")})
    @DisplayName("При вводе в поле телефон значения длиной 11 символа(ов) - дополнительные символы стираются автоматически")
    public void phoneLength11worksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.
                 setNumber(phoneTestData.phoneInvalidLength11);
        String phoneInput = $(".contacts__phone").getValue();
        System.out.println(phoneInput);
        Assertions.assertTrue((phoneInput.length() == 17));


    }

}

