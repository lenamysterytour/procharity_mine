package procharity.tests.registerAsFoundation.nameSurnamePosition;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

import procharity.tests.registerAsFoundation.NameLastNamePositionTestData;

public class NameSurnamePositionLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    NameLastNamePositionTestData nameLastNamePositionTestData = new NameLastNamePositionTestData();

    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 1 символа(ов) - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLength1IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(nameLastNamePositionTestData.nameSurnamePositionValidLength1)
                .setLastName(nameLastNamePositionTestData.nameSurnamePositionValidLength1)
                .setPosition(nameLastNamePositionTestData.nameSurnamePositionValidLength1)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }


    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("negative")})
    @DisplayName("Поля Имя Фамилия Должность обязательные: при вводе значений длиной 0 символа(ов) - кнопка \"Зарегистрироваться\" неактивна")
    public void nameSurnamePositionLength0IsInvalid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(nameLastNamePositionTestData.nameSurnamePositionInvalidLength0)
                .setLastName(nameLastNamePositionTestData.nameSurnamePositionInvalidLength0)
                .setPosition(nameLastNamePositionTestData.nameSurnamePositionInvalidLength0)

                .clickRegisterButton()
                .checkEmptyErrorAppears();
    }


    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значений огромной длины символы не вводятся т.к. стираются автоматически")
    public void nameSurnamePositionBigLengthGetsErased() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage
                .setName(nameLastNamePositionTestData.bigName)
                .setLastName(nameLastNamePositionTestData.bigLastname)
                .setPosition(nameLastNamePositionTestData.bigPosition);

        String nameInput = $(".contacts__surname").getValue();
        String lastnameInput = $(".contacts__lastname").getValue();
        String positionInput = $(".contacts__position").getValue();
        System.out.println(nameInput);
        System.out.println(lastnameInput);
        System.out.println(positionInput);
        Assertions.assertTrue((nameInput.length() < 50));
        Assertions.assertTrue((lastnameInput.length() < 50));
        Assertions.assertTrue((positionInput.length() < 50));

    }


}

