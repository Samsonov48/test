package za.ebalo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1000x1000";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTests() {
        String name = "Daniil";

        open ("/text-box");
 //       $("[id=userName]").setValue("Daniil");
        $("#userName").setValue(name);
        $("#userEmail").setValue("samsonov.dr@mail.ru");
        $("#currentAddress").setValue("kazakhstan");
        $("#permanentAddress").setValue("Russia");
        $("#submit").click();

        $("#output #name").shouldHave(text("Daniil"));
        $("#output #email").shouldHave(text("samsonov.dr@mail.ru"));
        $("#output #currentAddress").shouldHave(text("kazakhstan"));
        $("#output #permanentAddress").shouldHave(text("Russia"));


    }
}
