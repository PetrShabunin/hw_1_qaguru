package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void formTest(){
     open("/text-box");
     $("[id=userName]").setValue("Test Text");
     $("[id=userEmail]").setValue("Test@test.com");
     $("[id=currentAddress]").setValue("Test Address 1");
     $("[id=permanentAddress]").setValue("Test Address 2");
     $("[id=submit]").click();
    }
}
