package procharity.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement registerIcon = $(".header__login-l"),
            registerAsFoundationButton = $(byAttribute("href", "/foundations/new/"));

    public MainPage clickRegisterIcon() {
        registerIcon.click();
        return this;
    }

    public MainPage clickRegisterAsFoundationButton() {
        registerAsFoundationButton.click();
        return this;
    }
    public MainPage openMainPage() {
 open("");
        return this;
    }


}

