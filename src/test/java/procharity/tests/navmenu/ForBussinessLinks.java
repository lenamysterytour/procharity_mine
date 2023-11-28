package procharity.tests.navmenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ForBussinessLinks extends TestBase {

MainPage mainPage = new MainPage();
    @Test
    @Tags({@Tag("navlinks"),@Tag("businesslinks")})
    public void volunteerListLinkOpens() {
        SelenideElement howToHelpElement = $(byAttribute("href","/company/"));
        mainPage.openMainPage();
       $(byLinkText("Бизнесу")).hover();
       executeJavaScript("arguments[0].click();",howToHelpElement);
        $(".article").shouldHave(Condition.text("Бизнес"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("businesslinks")})
    public void volunteerCompaniesLinkOpens() {
        SelenideElement nkoListElement = $(byAttribute("href","/about_project/foundations_list/"));
        mainPage.openMainPage();
        $(byLinkText("Бизнесу")).hover();
        executeJavaScript("arguments[0].click();",nkoListElement);
      $(byLinkText("Список НКО")).click();
        $(".article").shouldHave(Condition.text("С нами работают фонды"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("businesslinks")})
    public void nkoReviewsLinkOpens() {
        SelenideElement reviewsElement = $(byAttribute("href","/reviews/about_volunteers/"));
        mainPage.openMainPage();
        $(byLinkText("Для НКО")).hover();
        executeJavaScript("arguments[0].click();",reviewsElement);
        $(".article").shouldHave(Condition.text("Отзывы некоммерческих организаций о волонтерах"));
    }



}