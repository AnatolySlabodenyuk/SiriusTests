package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String TITLE_TEXT = "Зарегистрируйтесь, чтобы продолжить";

    private SelenideElement
            userEmailInput = $("#f_1001410010"),
            lastNameInput = $("#f_1001410013"),
            firstNameInput = $("#f_1001410012"),
            fatherNameInput = $("#f_1001410014"),
            dateOfBirthInput = $("[name=f_1001510000]"),
            passwordInput = $("#f_pwd"),
            passwordRepeatInput = $("#f_pwd_r"),
            checkBox = $(byText("Нажимая на кнопку")),
            submitButton = $("#submit");

    public RegistrationPage openPage() {
        open("/auth");
        $(byText("Зарегистрируйтесь")).click();
        $(".modal-inline__title").shouldHave(text(TITLE_TEXT));
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

    public RegistrationPage setBirthDate() {
        dateOfBirthInput.setValue("16.07.1997");
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
}


