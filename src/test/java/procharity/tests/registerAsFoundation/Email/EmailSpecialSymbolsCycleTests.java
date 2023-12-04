package procharity.tests.registerAsFoundation.Email;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class EmailSpecialSymbolsCycleTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();


    @Test
    @Tags({@Tag("email"), @Tag("negative")})
    @DisplayName("Поочередно проверить все неразрешенные спецсимволы для поля емейл")
    public void testForbiddenSpecialSymbolsSeparately() {

        String[] specialSymbols = {"№", "[", "]", "<", ">"};

        step("get to Register as Foundation form", () -> {
            mainPage.openMainPage()
                    .clickRegisterIcon()
                    .clickRegisterAsFoundationButton();
        });

        step("set special symbols into email input and check if error appears", () -> {
            for (String s : specialSymbols) {
                contactFacepage.setEmail("a" + s + "a@gmail.com")
                        .clickRegisterButton();
                contactFacepage.checkEmailErrorAppears();
                $(".contacts__email").clear();
            }
        });
    }


    @Test
    @Tags({@Tag("email"), @Tag("positive")})
    @DisplayName("Поочередно проверить все разрешенные спецсимволы для поля емейл")
    public void testAllowedSpecialSymbolsSeparately() {
        String[] forbiddenSpecialSymbols = {"#", "$", "%", "&", "'", "*", "+", "-", "/", "=", "?", "^", "_", "`", "{", "|", "}", "~"};

        step("get to Register as Foundation form", () -> {
            mainPage.openMainPage()
                    .clickRegisterIcon()
                    .clickRegisterAsFoundationButton();
        });

        step("set special symbols into email input and check if error appears", () -> {
            for (String s : forbiddenSpecialSymbols) {
                contactFacepage.setEmail("a" + s + "a@gmail.com")
                        .clickRegisterButton();
                contactFacepage.checkEmailErrorAppearsNot();
                $(".contacts__email").clear();
            }
        });
    }


}

