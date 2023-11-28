package procharity.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class ContactFacepage {

    private final SelenideElement nameInput = $(".contacts__surname"),
            lastNameInput = $(".contacts__lastname"),
            positionInput = $(".contacts__position"),
            numberInput = $(".contacts__phone"),
            emailInput = $(".contacts__email"),
            telegramInput = $(".contacts__telegram"),
    registerButton = $((byAttribute("value", "Зарегистрироваться"))),

    emailErrorMessage =   $(byTagAndText("p", "Проверьте поле \"Электронная почта"));

public ContactFacepage setAllValidInputsExceptEmail() {

        nameInput.setValue("Вася");
        lastNameInput.setValue("Вася");
        positionInput.setValue("Вася");
        numberInput.setValue("5678974567");
        telegramInput.setValue("Vasya");

    return this;
}

    public ContactFacepage setName (String value) {
        nameInput.setValue(value);
                return this;}

    public ContactFacepage setLastName (String value) {
        lastNameInput.setValue(value);
        return this;}

    public ContactFacepage setPosition (String value) {
        positionInput.setValue(value);
        return this;}

    public ContactFacepage setNumber (String value) {
       numberInput.setValue(value);
        return this;}

    public ContactFacepage setEmail(String value) {
        emailInput.setValue(value);
        return this;}

    public ContactFacepage setTelegram (String value) {
       telegramInput.setValue(value);
        return this;}

    public ContactFacepage clickRegisterButton () {
        registerButton.click();
        return this;}

    public ContactFacepage checkEmailErrorAppears () {
        emailErrorMessage.is(Condition.visible);
        return this;}

}
