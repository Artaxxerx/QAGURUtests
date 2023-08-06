package tests;

import Pages.Components.ModalForm;
import Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BeforeTests {
    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    static void BeforeAll(){

        Configuration.browserSize = "1920x1080";
    }
}
