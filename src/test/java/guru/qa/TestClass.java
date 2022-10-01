package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Browsers.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestClass {
    @BeforeAll
    static void settings(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = CHROME;
        Configuration.holdBrowserOpen = true;
    }
    @Test
    // шпаргалка
    void someTest() {
        String name = "Petya"; // стринг значение для имени во имя оптимизации
        open("/text-box");
     //   $("[id=userName]").setValue("Petya");
        $("#userName").setValue(name);
        $("#userEmail").setValue("Petya@petya.com");
        $("#currentAddress").setValue("Address1");
        $("#permanentAddress").setValue("Address2");
        $("#submit").click();
        $("#output").shouldHave(text("Petya")); //проверка выхода
    }
}


