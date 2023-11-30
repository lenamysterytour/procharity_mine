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

public class NameSurnamePositionLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();
    TestData testData = new TestData();

    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 1 символа(ов) - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLength1IsValid() {



        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionValidLength1)
                .setLastName(testData.nameSurnamePositionValidLength1)
                .setPosition(testData.nameSurnamePositionValidLength1)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 1999 символа(ов) - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLength1999IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionValidLength1999)
                .setLastName(testData.nameSurnamePositionValidLength1999)
                .setPosition(testData.nameSurnamePositionValidLength1999)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 1000 символа(ов) - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLength1000IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionValidLength1000)
                .setLastName(testData.nameSurnamePositionValidLength1000)
                .setPosition(testData.nameSurnamePositionValidLength1000)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Disabled("Отключено временно, чтобы не создавать левые аккаунты в базе")
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("positive")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 2000 символа(ов) - \"Зарегистрироваться\" активна")
    public void nameSurnamePositionLength2000IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionValidLength2000)
                .setLastName(testData.nameSurnamePositionValidLength2000)
                .setPosition(testData.nameSurnamePositionValidLength2000)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("negative")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 2001 символа(ов) - \"Зарегистрироваться\" неактивна")
    public void nameSurnamePositionLength2001IsInValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionInvalidLength2001)
                .setLastName(testData.nameSurnamePositionInvalidLength2001)
                .setPosition(testData.nameSurnamePositionInvalidLength2001)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }
    @Test
    @Tags({@Tag("nameSurnamePosition"), @Tag("negative")})
    @DisplayName("При вводе в поля Имя, Фамилия, Должность значения длиной 10000 символа(ов) - \"Зарегистрироваться\" неактивна")
    public void nameSurnamePositionLength10000IsInValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptNameSurnamePosition()
                .setName(testData.nameSurnamePositionInvalidLength10000)
                .setLastName(testData.nameSurnamePositionInvalidLength10000)
                .setPosition(testData.nameSurnamePositionInvalidLength10000)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

}
