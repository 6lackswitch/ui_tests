package org.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.ui.elements.DatePicker;

import static org.ui.common.Driver.getDriver;

public class PracticeFormPage {
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By userEmail = By.id("userEmail");
    private final By genders = By.id("genterWrapper");
    private final By userNumber = By.id("userNumber");
    private final By dateOfBirthInput = By.id("dateOfBirthInput");
    private final By subjectsContainer = By.id("subjectsInput");
    private final By hobbiesWrapper = By.id("hobbiesWrapper");
    private final By uploadPicture = By.id("uploadPicture");
    private final By currentAddress = By.id("currentAddress");
    private final By state = By.id("state");
    private final By city = By.id("city");
    private final By submitButton = By.id("submit");

    public PracticeFormPage setFirstName(String firstName) {
        getDriver().findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public PracticeFormPage setLastName(String lastName) {
        getDriver().findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public PracticeFormPage setUserEmail(String userEmail) {
        getDriver().findElement(this.userEmail).sendKeys(userEmail);
        return this;
    }

    public PracticeFormPage setGender(String gender) {
        getDriver().findElement(this.genders)
                .findElement(By.xpath("//input[@value='" + gender + "']/..")).click();
        return this;
    }

    public PracticeFormPage setUserNumber(String userNumber) {
        getDriver().findElement(this.userNumber).sendKeys(userNumber);
        return this;
    }

    public PracticeFormPage setDateOfBirth(String birthday) {
        String[] birth = birthday.split(" ");
        getDriver().findElement(this.dateOfBirthInput).click();
        DatePicker datePicker = new DatePicker();
        datePicker.setDate(birth[0], birth[1], birth[2]);
        return this;
    }

    public PracticeFormPage setSubject(String subject) {
        getDriver().findElement(this.subjectsContainer).sendKeys(subject);
        getDriver().findElement(By.xpath("//div[contains(@class, 'subjects') and text()='" + subject + "']")).click();
        return this;
    }

    public PracticeFormPage setHobbie(String hobbie) {
        getDriver().findElement(this.hobbiesWrapper)
                .findElement(By.xpath("//label[text()='" + hobbie + "']")).click();
        return this;
    }

    public PracticeFormPage uploadPicture(String path) {
        getDriver().findElement(this.uploadPicture).sendKeys(path);
        return this;
    }

    public PracticeFormPage setCurrentAddress(String currentAddress) {
        getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
        return this;
    }

    public PracticeFormPage setState(String state) {
        WebElement stateElement = getDriver().findElement(this.state);
        stateElement.click();
        stateElement.findElement(By.xpath("//div[text()='" + state + "']")).click();
        return this;
    }

    public PracticeFormPage setCity(String city) {
        WebElement cityElement = getDriver().findElement(this.city);
        cityElement.click();
        cityElement.findElement(By.xpath("//div[text()='" + city + "']")).click();
        return this;
    }

    public void submit() {
        WebElement submit = getDriver().findElement(submitButton);
        new Actions(getDriver())
                .moveToElement(submit, 0, -10)
                .click()
                .perform();
    }
}
