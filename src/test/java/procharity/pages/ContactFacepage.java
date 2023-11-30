package procharity.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class ContactFacepage {

    public final SelenideElement nameInput = $(".contacts__surname"),
            lastNameInput = $(".contacts__lastname"),
            positionInput = $(".contacts__position"),
            numberInput = $(".contacts__phone"),
            emailInput = $(".contacts__email"),
            telegramInput = $(".contacts__telegram"),
            registerButton = $((byAttribute("value", "Зарегистрироваться"))),

    titleOfOrganizationPage = $(".organization__title"),
            emailErrorMessage = $(byTagAndText("p", "Проверьте поле \"Электронная почта")),
            phoneErrorMessage = $(byTagAndText("p", "Проверьте поле \"Телефон")),
            emptyErrorMessage = $(byTagAndText("p", "Поле обязательное")),
    telegramErrorMessage = $(byTagAndText("p", "Проверьте, что в поле указан только ник (без ссылок и @)"));


    public ContactFacepage setName(String value) {
        nameInput.setValue(value);
        return this;
    }


    public ContactFacepage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public ContactFacepage setPosition(String value) {
        positionInput.setValue(value);
        return this;
    }

    public ContactFacepage setNumber(String value) {
        numberInput.setValue(value);
        return this;
    }

    public ContactFacepage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public ContactFacepage setTelegram(String value) {
        telegramInput.setValue(value);
        return this;
    }

    public ContactFacepage checkNextPageOrganizationOpens() {
        titleOfOrganizationPage.shouldHave(text("Организация"));
        return this;
    }

    public ContactFacepage clickRegisterButton() {
        registerButton.click();
        return this;
    }


    public ContactFacepage checkEmailErrorAppears() {
        emailErrorMessage.should(visible);
        return this;
    }

    public ContactFacepage checkTelegramErrorAppears() {
        telegramErrorMessage.should(visible);
        return this;
    }

    public ContactFacepage checkPhoneErrorAppears() {
        phoneErrorMessage.should(visible);
        return this;}

    public ContactFacepage checkEmptyErrorAppears() {
        emptyErrorMessage.should(visible);
        return this;}


    public ContactFacepage setAllValidInputsExceptEmail() {
        nameInput.setValue("Вася");
        lastNameInput.setValue("Вася");
        positionInput.setValue("Вася");
        numberInput.setValue("5678974567");
        telegramInput.setValue("Vasya");
        return this;
    }

    public ContactFacepage setAllValidInputsExceptPhone() {
        nameInput.setValue("Вася");
        lastNameInput.setValue("Вася");
        positionInput.setValue("Вася");
        emailInput.setValue("procharity@gmail.com");
        telegramInput.setValue("Vasya");
        return this;
    }


    public ContactFacepage setAllValidInputsExceptTelegram() {
        setName("Вася");
        setLastName("Вася");
        setPosition("дворник");
        setEmail("ivan@me.ru");
        setNumber("689076893");
        nameInput.setValue("Вася");
        lastNameInput.setValue("Вася");
        positionInput.setValue("Вася");
        emailInput.setValue("procharity@gmail.com");
        numberInput.setValue("5678974567");

        return this;
    }

    public ContactFacepage setAllValidInputsExceptNameSurnamePosition() {

        emailInput.setValue("procharity@gmail.com");
        telegramInput.setValue("Vasya");

        return this;
    }

}