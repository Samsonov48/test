package za.ebalo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork1 {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1100x1100";
    }
    @Test
    void fillFormRegistr() {
        open("/automation-practice-form");
        $("[id=firstName]"). setValue("Danya");
        $("[id=lastName]"). setValue("Samsonov");
        $("[id=userEmail]"). setValue("Sum41@mail.ru");
        $(".custom-control-label").click();
        $("[id=userNumber]"). setValue("9101254000");
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("6");
        $(".react-datepicker__year-select").selectOption("1996");



    }
}
