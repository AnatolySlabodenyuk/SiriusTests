package ru.sochisirius.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RegistrationPageTests extends TestBase {
    Faker faker = new Faker();
    @Test
    @Tag("Sirius_tests")
    @DisplayName("Форма регистрации имеет название \"Зарегистрируйтесь, чтобы продолжить\"")
    void positiveTest1() {
        step("Открыть форму регистрации и проверить, что форма имеет правильное название", () -> {
            registrationPage.openRegistrationPage();
        });
    }

    @Test
    @Tag("Sirius_tests")
    @DisplayName("Появляется окно запроса на регистрацию после заполнения всех полей формы и подтверждения")
    void positiveTest2() {
        String eMail = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String userName = faker.name().firstName();
        String fatherName = faker.name().firstName();
        String password = faker.internet().password();
        String repeatPassword = password;

        step("Открыть форму регистрации", () -> {
            registrationPage.openRegistrationPage();
        });

        step("Заполнить поля формы и нажать кнопку", () -> {
            registrationPage.setEmail(eMail)
                    .setLastName(lastName)
                    .setFirstName(userName)
                    .setFatherName(fatherName)
                    .setBirthDate()
                    .setPassword(password)
                    .setRepeatPassword(repeatPassword)
                    .clickCheckBox()
                    .submit();
        });

        step("Проверить, что форма появилась", () -> {
            registrationPage.resultsModalAppear();
        });
    }

    @Test
    @Tag("Sirius_tests")
    @DisplayName("Указанный на странице регистрации Email совпадает с Email в появившемся окне о запросе на регистрацию")
    void positiveTest3() {
        String eMail = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String userName = faker.name().firstName();
        String fatherName = faker.name().firstName();
        String password = faker.internet().password();
        String repeatPassword = password;

        step("Открыть форму регистрации", () -> {
            registrationPage.openRegistrationPage();
        });

        step("Заполнить поля формы и нажать кнопку", () -> {
            registrationPage.setEmail(eMail)
                    .setLastName(lastName)
                    .setFirstName(userName)
                    .setFatherName(fatherName)
                    .setBirthDate()
                    .setPassword(password)
                    .setRepeatPassword(repeatPassword)
                    .clickCheckBox()
                    .submit();
        });

        step("Проверить, что Email совпадает", () -> {
            $(".modal-inline__body").shouldHave(text(eMail));
        });
    }

    @Test
    @Tag("Sirius_tests")
    @DisplayName("Открывается страница с восстановлением пароля при нажатии на ссылку")
    void positiveTest4() {

        step("Открыть форму регистрации", () -> {
            registrationPage.openRegistrationPage();
        });

        step("Нажать на ссылку \"получить пароль\"", () -> {
            $(byText("получить пароль")).click();
        });

        step("Проверить, что открывшаяся страница имеет заголовок \"Сброс пароля\"", () -> {
            $(".modal-inline__title").shouldHave(text("Сброс пароля"));
        });
    }
}