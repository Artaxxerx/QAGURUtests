package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch extends BeforeTests {


    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        String firstName = "First name";
        String lastName = "LastName";
        String eMail = "Qa@qa.com";
        String number = "8951343316";


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(eMail)
                .setGender()
                .setNumber(number)
                .setBirthDate("6", "1941", "8")
                .setHobbies()
                .uploadPicture("src/test/data/mmtattoo.jpg")
                .setAddress("Address")
                .setStateAndCity();
        $("#submit").click();
        registrationPage.verifyResultsModalForm("Thanks for submitting the form")
                .verifyModalWindowResult("Student Name", "First name LastName")
                .verifyModalWindowResult("Gender", "Male")
                .verifyModalWindowResult("Mobile", "8951343316")
                .verifyModalWindowResult("Date of Birth", "8 July,1941");

    }

}

