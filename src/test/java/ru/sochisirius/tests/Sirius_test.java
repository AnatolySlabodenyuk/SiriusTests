package ru.sochisirius.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Sirius_test {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://online.sochisirius.ru";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulRegistrationTest() {
        String userName = "Anatoly";
        String lastName = "Slabodenyuk";
        String eMail = "example2@example.com";
        String userNumber = "1234567890";

        open("/auth");
        $(".modal-inline__title").shouldHave(text("Войдите, чтобы продолжить"));

        $(byText("Зарегистрируйтесь")).click();

        $("#f_1001410010").setValue(eMail);
        $("#f_1001410013").setValue("lastName");
        $("#f_1001410012").setValue("userName");
        $("#f_1001410014").setValue("fatherName");

        $("[name=f_1001510000]").setValue("16.07.1997");

       // $(".input-group-btn").click();
        //$(".react-datepicker__month-select").selectOption("июль");
       // $(".react-datepicker__year-select").selectOption("1997");
       // $("name=f_1001510000").setValue("16.07.1997");

        $("#f_pwd").setValue("Password123123!@");
        $("#f_pwd_r").setValue("Password123123!@");

        $(byText("Нажимая на кнопку")).click();

        $("#submit").click();

        $(".modal-inline").should(appear);
        $(".modal-inline__body").shouldHave(text(eMail));
        
    }
}
