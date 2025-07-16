import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.ShouldBe;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckTheForm {
    @BeforeAll
    static void openTheSite(){
        open("https://demoqa.com/automation-practice-form");
        Configuration.timeout = 10000;
    }

   @Test
    void fillTheForm(){
       $(".text-center").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Ivanov@mail.ru");
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue("9111111111");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1980");
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__day--007").click();
        $("#subjectsInput").setValue("Hello");
        $(".custom-control-label").click();
        $("#uploadPicture").uploadFromClasspath("java.jpg");
        //$("uploadbutton").click(); - практически всегда нужна эта команда при загрузке файла
        $("#currentAddress").setValue("Javalindia 1");
        $("#state").click();
        $("#react-select-3-option-2").click();
        $("#submit").click();
        //$(".modal-title h4").shouldHave(text("Thanks for submitting the form"));
        $("#closeLargeModal").click();






    }

}
