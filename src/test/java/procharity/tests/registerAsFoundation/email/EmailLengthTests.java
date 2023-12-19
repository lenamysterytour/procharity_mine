package procharity.tests.registerAsFoundation.email;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

import procharity.tests.registerAsFoundation.EmailTestData;

public class EmailLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    EmailTestData emailTestData = new EmailTestData();

    @Test
    @Tags({@Tag("email"), @Tag("negative"), @Tag("length")})
    @DisplayName("Поле Электронная почта обязательное: При вводе в поле \"Электронная почта\" 0 символа(ов) - кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithLength0IsInvalid() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength0())

                .clickRegisterButton()
                .checkEmptyErrorAppears();
    }

    @Test
    @Tags({@Tag("email"), @Tag("negative"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 1 символа(ов) - кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithLength1IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength1())

                .clickRegisterButton()
                .checkEmailErrorAppears();
    }

    //@Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 255 символа(ов) - кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength255IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength255())

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 254 символа(ов) - кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength254IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength254())

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }



    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("negative"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 256 символа(ов) - кнопка \"Зарегистрироваться\" неактивна")
    public void emailWithLength256IsInValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength256())

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Чтобы не пополнять базу данных")
    @Test
    @Tags({@Tag("email"), @Tag("positive"), @Tag("length")})
    @DisplayName("При вводе в поле \"Электронная почта\" 100 символа(ов) - кнопка \"Зарегистрироваться\" активна")
    public void emailWithLength100IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptEmail()
                .setEmail(emailTestData.getEmailValidLength100())

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }


    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("При вводе в поле Емейл значений огромной длины символы не вводятся т.к. стираются автоматически")
    public void emailBigLengthGetsErased() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage
                .setEmail(emailTestData.getEmailInputHugeLength());

        String emailInput = $(".contacts__email").getValue();
        System.out.println(emailInput);
        Assertions.assertTrue(emailInput.length() < 100);

    }
}
