package guru.qa;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class CssXpathExample {
    void CssXpathExamples(){
        //type="email" id="userEmail" class="mr-sm-2 form-control" data-testid="email">
        $("[data-testid=email]").setValue("test");
        $(by("data-testid", "email")).setValue("test");

        $("[id=userEmail]").setValue("test"); //селекторы через css (куда проще)
        $("email#userEmail").setValue("test"); //с указанием типа элемента
        $(byId("userEmail")).setValue("test");
        $x("//*[@id='userEmail']").setValue("test"); //селектор через xpath (какая то сложная херня)
        $("[class=mr-sm-2]").setValue("test"); //селектор через класс
        $(".mr-sm-2.form-control]").setValue("test"); // через 2 класса

        // <div class="mr-sm-2">
        //   <type="email" id="userEmail" class="form-control" data-testid="email">
        // </div>
        $(".mr-sm-2 .form-control").setValue("test"); // пример если есть вложенные локаторы
        $(".mr-sm-2").$(".form-control").setValue("test"); //тоже самое что и выше

        // <div>Hello world</div>
        $x("//div[text()='Hello']"); //текст в css объекте в качестве селектора через xpath
        $x("//div[contains(text(), 'llo wo')]"); // часть текста в качестве селектора в xpath
        $(byText("Hello world")).setValue("test"); // тоже самое но через селенид
        $(withText("llo wor")).setValue("test"); // селектор по части текста в селенид
    }

}
