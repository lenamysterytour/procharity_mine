package procharity.tests.profileFillIn;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PortfolioFillIn extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("portfolio")
    public void add5mbFile(){

        SelenideElement signInIcon = $(".header__login-r"),
        emailInput = $(byAttribute("placeholder","E-mail")),
                passwordInput =  $(byAttribute("placeholder","Пароль"));

        ;
        mainPage.openMainPage();
        executeJavaScript("arguments[0].click();",signInIcon);
        executeJavaScript("arguments[0].click();",emailInput);
//        executeJavaScript("arguments[0].sendKeys(lenamysterytour@gmail.com)",emailInput);

        emailInput.sendKeys("lenamysterytour@gmail.com");

// $(byAttribute("placeholder","E-mail")).setValue("lenamysterytour@gmail.com");
// $(byAttribute("placeholder","Пароль")).setValue("LenaLoh");
 $(byTagAndText("button","Войти")).click();


//        $((byAttribute("value", "Зарегистрироваться"))),




    }


}
