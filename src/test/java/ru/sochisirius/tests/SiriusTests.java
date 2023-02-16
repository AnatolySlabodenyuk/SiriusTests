package ru.sochisirius.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SiriusTests extends TestBase {
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    Faker faker = new Faker();
    @Test
    @Tag("Sirius_tests")
    @DisplayName("Форма регистрации имеет название \"Зарегистрируйтесь, чтобы продолжить\"")
    void nameRegistrationFormTest() {
        step("Открыть форму регистрации и проверить, что форма имеет правильное название", () -> {
            registrationPage.openRegistrationPage();
        });
    }

    @Test
    @Tag("Sirius_tests")
    @DisplayName("Появляется окно запроса на регистрацию после заполнения всех полей формы и подтверждения")
    void resultsModalAppearsTest() {
        String eMail = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String userName = faker.name().firstName();
        String fatherName = faker.name().firstName();
        String dateOfBirth = sdf.format(faker.date().birthday());
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
                    .setBirthDate(dateOfBirth)
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
    void eMailTest() {
        String eMail = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String userName = faker.name().firstName();
        String fatherName = faker.name().firstName();
        String dateOfBirth = sdf.format(faker.date().birthday());
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
                    .setBirthDate(dateOfBirth)
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
    void passwordPageTest() {

        step("Открыть форму регистрации", () -> {
            registrationPage.openRegistrationPage();
        });

        step("Нажать на ссылку \"получить пароль\"", () -> {
            registrationPage.getPassword();
        });

        step("Проверить, что открывшаяся страница имеет заголовок \"Сброс пароля\"", () -> {
            registrationPage.getPasswordPageName();
        });
    }

    @Test
    @Tag("Sirius_tests")
    @DisplayName("Появляется предупреждающее окно, если введен несуществующий Email")
    void nonexistentEmailPageTest() {

        String eMail = faker.internet().emailAddress();
        String password = faker.internet().password();

        step("Открыть страницу авторизации", () -> {
            authPage.openAuthPage();
        });

        step("Ввести незарегистрированный Email и пароль и попробовать зарегистрироваться", () -> {
            authPage.setEmail(eMail);
            authPage.setPassword(password);
            authPage.submit();
        });

        step("Проверить, что появилось предупреждающее окно", () -> {
            authPage.dangerModalAppear();
        });

    }
}