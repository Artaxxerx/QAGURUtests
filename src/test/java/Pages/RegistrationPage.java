package Pages;

import Pages.Components.CalendarComponent;
import Pages.Components.ModalForm;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ModalForm modalForm = new ModalForm();
    private SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            eMail = $("#userEmail"),
            Gender = $(byText("Male")),
            Number = $("#userNumber"),
            Hobbie = $(byText("Reading")),
            Picture = $("#uploadPicture"),
            Address = $("#currentAddress"),
            State = $("#state"),
            Haryana = $(byText("Haryana")),
            City = $("#city"),
            Panipat = $(byText("Panipat"));


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        eMail.setValue(value);
        return this;
    }

    public RegistrationPage setGender() {
        Gender.click();
        return this;
    }

    public RegistrationPage setNumber(String value) {
        Number.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String month, String year, String day) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(month, year, day);
        return this;

    }

    public RegistrationPage verifyResultsModalForm(String arg) {
        modalForm.verifyModalForm(arg);
        return this;
    }

    public RegistrationPage verifyModalWindowResult(String key, String value) {
        modalForm.verifyResult(key, value);
        return this;
    }

    public RegistrationPage setHobbies() {
        Hobbie.click();
        return this;
    }

    public RegistrationPage uploadPicture(String path) {
        Picture.uploadFile(new File(path));
        return this;
    }

    public RegistrationPage setAddress(String address) {
        Address.setValue(address);
        return this;
    }

    public RegistrationPage setStateAndCity() {
        State.click();
        Haryana.click();
        City.click();
        Panipat.click();
        return this;
    }
}
