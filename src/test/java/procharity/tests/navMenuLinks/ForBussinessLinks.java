package procharity.tests.navMenuLinks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ForBussinessLinks extends TestBase {

    MainPage mainPage = new MainPage();
    SelenideElement howToHelpElement = $(byAttribute("href", "/company/"));
    SelenideElement nkoListElement = $(byAttribute("href", "/about_project/foundations_list/"));
    SelenideElement reviewsElement = $(byAttribute("href", "/reviews/about_volunteers/"));

    @Test
    @Tags({@Tag("navlinks"), @Tag("positive"), @Tag("businesslinks")})
    @DisplayName("При наведении мыши на ссылку Бизнес в подменю есть ссылка с названием Как помочь, которая ведет на страницу Как помочь")
    public void volunteerListLinkOpens() {

        mainPage.openMainPage();
        $(byLinkText("Бизнесу")).hover();
        String howToHelpLinkText = howToHelpElement.getOwnText();
        Assertions.assertEquals("Как помочь",howToHelpLinkText);
        executeJavaScript("arguments[0].click();", howToHelpElement);
        $(".article").shouldHave(Condition.text("Бизнес"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("positive"), @Tag("businesslinks")})
    @DisplayName("При наведении мыши на ссылку Бизнес в подменю есть ссылка с названием Список НКО, которая ведет на страницу Список НКО")
    public void volunteerCompaniesLinkOpens() {

        mainPage.openMainPage();
        $(byLinkText("Бизнесу")).hover();
        String nkoListLinkText = nkoListElement.getOwnText();
        Assertions.assertEquals("Список НКО",nkoListLinkText);
        executeJavaScript("arguments[0].click();", nkoListElement);
        $(".article").shouldHave(Condition.text("С нами работают фонды"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("positive"), @Tag("businesslinks")})
    @DisplayName("При наведении мыши на ссылку Бизнес в подменю есть ссылка с названием Отзывы НКО, которая ведет на страницу Отзывы НКО")
    public void nkoReviewsLinkOpens() {

        mainPage.openMainPage();
        $(byLinkText("Бизнесу")).hover();
        String reviewsLinkText = reviewsElement.getOwnText();
        Assertions.assertEquals("Отзывы НКО",reviewsLinkText);
        executeJavaScript("arguments[0].click();", reviewsElement);
        $(".article").shouldHave(Condition.text("Отзывы некоммерческих организаций о волонтерах"));
    }

}