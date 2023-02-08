package guru.qa.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SiriusTestsWithPO extends TestBase {
    Faker faker = new Faker();
    @Test
    @Tag("Sirius_tests")
    void successfulRegistrationTest() {
        String eMail = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String userName = faker.name().firstName();
        String fatherName = faker.name().firstName();
        String password = faker.internet().password();
        String repeatPassword = password;


        step("Открыть форму регистрации и проверить, что форма имеет правильное название", () -> {
        registrationPage.openPage();
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

        step("Проверить корректность заполнения данных в таблице", () -> {
           $(".modal-inline").should(appear);
           $(".modal-inline__body").shouldHave(text(eMail));
        });
    }
}