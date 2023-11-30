package procharity.tests.registervalidationnko.Phone;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import procharity.pages.ContactFacepage;
import procharity.pages.MainPage;

import procharity.tests.TestBase;
import procharity.tests.registervalidationnko.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PhoneLength extends TestBase {

    MainPage mainPage = new MainPage();
  ContactFacepage contactFacepage = new ContactFacepage();
    TestData testData = new TestData();

    @Disabled
    @Test
    @Tag("phone")
    public void phoneLength11works() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
          contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(testData.phoneInvalidLength11);

    }
   @Disabled
    @Test
    @Tag("phone")
    public void phoneLength10works() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(testData.phoneInvalidLength10);

    }

    @Test
    @Tag("phone")
    public void phoneLength0WorksNot() {
        mainPage.openMainPage()
                .clickRegisterIcon()
                .clickRegisterAsFoundationButton();
        contactFacepage.setAllValidInputsExceptPhone()
                .setNumber(testData.universalInputLength0)
                .clickRegisterButton()
                .checkEmptyErrorAppears();
    }


}

