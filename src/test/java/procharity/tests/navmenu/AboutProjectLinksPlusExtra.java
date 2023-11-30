package procharity.tests.navmenu;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AboutProjectLinksPlusExtra extends TestBase {

 MainPage mainPage = new MainPage();
    @Test
      @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void aboutProjectLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).click();
        $(byTagAndText("h1", "ProCharity — поиск интеллектуальных волонтеров для благотворительных организаций")).should(Condition.visible);

    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void aboutTeamLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Команда")).click();
        $(".content-inner").shouldHave(text("Команда проекта"));
        $(".content-inner").shouldHave(text("Команда разработки"));
    }


    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void blogLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Блог")).click();
        $(".row article").shouldHave(text("Блог Procharity"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void documentsLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Документы")).click();
        $(".article").shouldHave(text("Наши документы и реквизиты"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void partnersLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Партнеры")).click();
        $(".article").shouldHave(text("Наши партнеры"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void reviewsLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Отзывы")).click();
        $(".article").shouldHave(text("Отзывы"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void contactsLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Контакты")).click();
        $(".article").shouldHave(text("Наши контакты"));
    }
    @Test
    @Tags({@Tag("navlinks"),@Tag("aboutprojectlinks")})
    public void charityLinkOpens() {
        mainPage.openMainPage();
        $(byText("О проекте")).hover();
        $(byLinkText("Пожертвовать в фонды")).click();
        $(".article").shouldHave(text("Сделать пожертвование в фонды"));
    }

    @Test
    @Tag("navlinks")
    public void FAQLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("FAQ")).click();
        $(".heading").shouldHave(text("Здесь вы найдёте ответы на свои вопросы"));
    }

    @Test
    @Tag("navlinks")
    public void searchOpens() {
        mainPage.openMainPage();
       $(".btn-search").click();
       $(".search-block").shouldHave(text("Что тебя интересует?"));
    }
}







