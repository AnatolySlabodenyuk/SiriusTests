package ru.sochisirius.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String TITLE_TEXT = "Зарегистрируйтесь, чтобы продолжить";

    private SelenideElement
            registrationLink = $(byText("Зарегистрируйтесь")),
            registrationModal = $(".modal-inline__title"),
            passwordLink = $(byText("получить пароль")),
            userEmailInput = $("#f_1001410010"),
            lastNameInput = $("#f_1001410013"),
            firstNameInput = $("#f_1001410012"),
            fatherNameInput = $("#f_1001410014"),
            dateOfBirthInput = $("[name=f_1001510000]"),
            passwordInput = $("#f_pwd"),
            passwordRepeatInput = $("#f_pwd_r"),
            checkBox = $(byText("Нажимая на кнопку")),
            submitButton = $("#submit"),
            registrationResultsModal = $(".modal-inline");

    public RegistrationPage openRegistrationPage() {
        open("/auth");
        registrationLink.click();
        registrationModal.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public RegistrationPage getPassword() {
        passwordLink.click();
        return this;
    }

    public RegistrationPage getPasswordPageName() {
        registrationModal.shouldHave(text("Сброс пароля"));
        return this;
    }


    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setFatherName(String value) {
        fatherNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String value) {
        dateOfBirthInput.setValue(value);
        return this;
    }

    public RegistrationPage setPassword(String value) {
        passwordInput.setValue(value);
        return this;
    }

    public RegistrationPage setRepeatPassword(String value) {
        passwordRepeatInput.setValue(value);
        return this;
    }

    public RegistrationPage clickCheckBox() {
        checkBox.click();
        return this;
    }

    public RegistrationPage submit() {
        submitButton.click();
        return this;
    }

    public RegistrationPage resultsModalAppear() {
        registrationResultsModal.should(appear);
        return this;
    }

    public RegistrationPage submitEnabled() {
        submitButton.isEnabled();
        return this;
    }

}


