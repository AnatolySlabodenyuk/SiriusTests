package ru.sochisirius.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthPage {
    private SelenideElement
            userEmailInput = $("[name=login]"),
            passwordInput = $("[name=pwd]"),
            submitButton = $(byText("ВОЙТИ")),
            dangerWindow =  $(".bg-danger");


    public AuthPage openAuthPage() {
        open("/auth");
        return this;
    }

    public AuthPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public AuthPage setPassword(String value) {
        passwordInput.setValue(value);
        return this;
    }

    public AuthPage submit() {
        submitButton.click();
        return this;
    }

    public AuthPage dangerModalAppear() {
        dangerWindow.should(appear);
        return this;
    }
}
