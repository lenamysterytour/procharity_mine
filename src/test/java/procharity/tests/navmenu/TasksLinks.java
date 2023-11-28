package procharity.tests.navmenu;

import com.codeborne.selenide.Condition;
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
    @Tags({@Tag("navlinks"),@Tag("taskslinks")})
    public void awaitingVoluntersLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("Ждут исполнителей")).click();
        $(".article").shouldHave(Condition.text("Задания для волонтеров"));
    }
    @Test
    @Tags({@Tag("navlinks"),@Tag("taskslinks")})
    public void inTheWorksLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("В работе")).click();
        $(".article").shouldHave(Condition.text("Задания в работе"));
    }
    @Test
    @Tags({@Tag("navlinks"),@Tag("taskslinks")})
    public void doneTasksLinkOpens() {
        mainPage.openMainPage();
        $(byLinkText("Задания")).hover();
        $(byLinkText("Выполненные")).click();
        $(".article").shouldHave(Condition.text("Архив заданий"));
    }



}