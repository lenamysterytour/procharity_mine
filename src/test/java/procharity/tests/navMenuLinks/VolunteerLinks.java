package procharity.tests.navMenuLinks;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VolunteerLinks extends TestBase {

    MainPage mainPage = new MainPage();


    @Test
    @Tags({@Tag("navlinks"), @Tag("volunteerlinks")})
    @DisplayName("При наведении мыши на ссылку Волонтерам в подменю есть ссылка с названием Как помочь, которая ведет на страницу Как помочь")

    public void howToHelpLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Волонтерам")).hover();
        $(byLinkText("Как помочь")).click();
        $(".article").shouldHave(Condition.text("Задания для волонтеров"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("volunteerlinks")})
    @DisplayName("При наведении мыши на ссылку Волонтерам в подменю есть ссылка с названием Задания, которая ведет на страницу Задания")

    public void tasksLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Волонтерам")).hover();
        $(byLinkText("Задания")).click();
        $(".article").shouldHave(Condition.text("Задания для волонтеров"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("volunteerlinks")})
    @DisplayName("При наведении мыши на ссылку Волонтерам в подменю есть ссылка с названием Список НКО, которая ведет на страницу Список НКО")

    public void nkoListLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Волонтерам")).hover();
        $(byLinkText("Список НКО")).click();
        $(".article").shouldHave(Condition.text("С нами работают фонды"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("volunteerlinks")})
    @DisplayName("При наведении мыши на ссылку Волонтерам в подменю есть ссылка с названием Бонусы, которая ведет на страницу Бонусы")

    public void bonusesLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Волонтерам")).hover();
        $(byLinkText("Бонусы")).click();
        $(".article").shouldHave(Condition.text("Бонусы партнеров"));
    }

    @Test
    @Tags({@Tag("navlinks"), @Tag("volunteerlinks")})
    @DisplayName("При наведении мыши на ссылку Волонтерам в подменю есть ссылка с названием Отзывы волонтеров, которая ведет на страницу Отзывы волонтеров")
    public void volunteersReviewsLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Волонтерам")).hover();
        $(byLinkText("Отзывы волонтеров")).click();
        $(".article").shouldHave(Condition.text("Отзывы волонтеров о фондах"));
    }

}