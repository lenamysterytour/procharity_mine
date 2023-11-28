package procharity.tests.navmenu;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ForNKOLinks extends TestBase {


    @Test
    @Tags({@Tag("navlinks"),@Tag("nkolinks")})
    public void howToGetHelpLinkOpens() {
        open("");
        $(byLinkText("Для НКО")).hover();
        $(byLinkText("Как получить помощь")).click();
        $(".top__headline").shouldHave(Condition.text("Безвозмездная профессиональная помощь"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("nkolinks")})
    public void volunteerListLinkOpens() {
        open("");
        $(byLinkText("Для НКО")).hover();
        $(byLinkText("Список волонтеров")).click();
        $(".article").shouldHave(Condition.text("С нами работают волонтеры"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("nkolinks")})
    public void volunteerCompaniesLinkOpens() {
        open("");
        $(byLinkText("Для НКО")).hover();
        $(byLinkText("Компании-волонтеры")).click();
        $(".article").shouldHave(Condition.text("С нами работают компании"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("nkolinks")})
    public void nkoReviewsLinkOpens() {
        open("");
        $(byLinkText("Для НКО")).hover();
        $(byLinkText("Отзывы НКО")).click();
        $(".article").shouldHave(Condition.text("Отзывы некоммерческих организаций о волонтерах"));
    }

    @Test
    @Tags({@Tag("navlinks"),@Tag("nkolinks")})
    public void webinarsLinkOpens() {
        open("");
        $(byLinkText("Для НКО")).hover();
        $(byLinkText("Вебинары")).click();
        $(".webinars__headline").shouldHave(Condition.text("Вебинары ProCharity"));
    }


}