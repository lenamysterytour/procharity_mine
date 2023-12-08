package procharity.tests.registerAsFoundation.telegram;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;
import procharity.tests.registerAsFoundation.TelegramTestData;

import static com.codeborne.selenide.Selenide.$;

public class TelegramLengthTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();

    TelegramTestData telegramTestData = new TelegramTestData();


    @Disabled
    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значения длиной 16 символа(ов) - кнопка \"Зарегистрироваться\" активна")
    public void telegramLength16IsValid() {


        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage.setAllValidInputsExceptTelegram()
                .setTelegram(telegramTestData.TelegramLength16)

                .clickRegisterButton()
                .checkNextPageOrganizationOpens();
    }

    @Test
    @Tags({@Tag("telegram"), @Tag("positive")})
    @DisplayName("При вводе в поле Телеграм значений огромной длины символы не вводятся т.к. стираются автоматически")
    public void telegramBigLengthGetsErased() {

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        contactFacepage
                .setTelegram(telegramTestData.TelegramHugeLength);

        String telegramInput = $(".contacts__telegram").getValue();
        System.out.println(telegramInput);
        Assertions.assertTrue(telegramInput.length() < 50);

    }


}
