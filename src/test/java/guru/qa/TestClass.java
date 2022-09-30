package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestClass {
    @Test
    void someTest() {
        open("https://demoqa.com/text-box");
    }
}


