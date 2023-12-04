package procharity.tests.registerAsFoundation.Email;

import org.junit.jupiter.api.*;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selenide.*;

public class EmailSpecialSymbolsCycleTests extends TestBase {
    MainPage mainPage = new MainPage();
    ContactFacepage contactFacepage = new ContactFacepage();


    @Test
    @Tags({@Tag("email"), @Tag("new")})
    @DisplayName("Поочередно проверить все неразрешенные спецсимволы для поля емейл")
    public void testForbiddenSpecialSymbolsSeparately() {

        String[] specialSymbols = {"№", "[", "]", "<", ">"};

        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();

        for (String s : specialSymbols) {
            contactFacepage.setEmail(s)
                    .clickRegisterButton();
            contactFacepage.checkEmailErrorAppears();
            $(".contacts__email").clear();
        }
    }
        @Test
        @Tags({@Tag("email"), @Tag("new")})
        @DisplayName("Поочередно проверить все неразрешенные спецсимволы для поля емейл")
        public void testAllowedSpecialSymbolsSeparately() {
String[] forbiddenSpecialSymbols =  {"!","#","$","%","&","'","*","+","-","/","?","^","=","_","`","|","(",")","~",".",","," ",":",";","@"};

            mainPage.openMainPage()
                    .clickRegisterIcon()
                    .clickRegisterAsFoundationButton();

            for (String s : forbiddenSpecialSymbols) {
                contactFacepage.setEmail(s)
                        .clickRegisterButton();
                contactFacepage.checkEmailErrorAppearsNot();
                $(".contacts__email").clear();
            }


    }


}

