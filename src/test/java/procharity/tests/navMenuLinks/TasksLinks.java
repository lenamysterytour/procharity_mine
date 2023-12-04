package procharity.tests.navMenuLinks;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.MainPage;
import procharity.tests.TestBase;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TasksLinks extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tags({@Tag("navlinks"),@Tag("taskslinks"),@Tag("positive")})
    @DisplayName("При наведении мыши на ссылку Задания в подменю есть ссылка с названием Ждут исполнителей, которая ведет на страницу Ждут исполнителей")
    public void awaitingVolunteersLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("Ждут исполнителей")).click();
        $(".article").shouldHave(Condition.text("Задания для волонтеров"));
    }
    @Test
    @Tags({@Tag("navlinks"),@Tag("taskslinks"),@Tag("positive")})
    @DisplayName("При наведении мыши на ссылку Задания в подменю есть ссылка с названием В работе, которая ведет на страницу В работе")
    public void inTheWorksLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("В работе")).click();
        $(".article").shouldHave(Condition.text("Задания в работе"));
    }
    @Test
    @Tags({@Tag("navlinks"),@Tag("taskslinks"),@Tag("positive")})
    @DisplayName("При наведении мыши на ссылку Задания в подменю есть ссылка с названием Выполненные, которая ведет на страницу Выполненные")
    public void doneTasksLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("Выполненные")).click();
        $(".article").shouldHave(Condition.text("Архив заданий"));
    }

}