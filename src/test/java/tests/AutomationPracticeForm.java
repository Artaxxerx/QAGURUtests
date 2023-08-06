package tests;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

@Test
    void fillFormTest(){
    Selenide.open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue("First name");
    $("#lastName").setValue("LastName");
    $("#userEmail").setValue("Qa@qa.com");
    $("#gender-radio-1").click();
    $("#userNumber").setValue("89513433161");
    $$(".react-datepicker__month-select").get(5).click();
    $(".react-datepicker__year-select").setValue("1941").click();
    $("#subjectsContainer").setValue("HoobaBooba");
    $("#hobbies-checkbox-3").click();
    $("#uploadPicture").uploadFile(new File("src/test/data.mmtattoo.jpg"));
    $("#currentAddress").setValue("Address");
    $("#state").$(byText("Haryana")).click();
    $("#city").$(byText("Panipat")).click();
    $("#submit").click();
    $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
}
}
