package org.ui.elements;

import org.openqa.selenium.By;

import static org.ui.common.Driver.getDriver;

public class ResultForm {
    private final By title = By.id("example-modal-sizes-title-lg");
    private final By fullName = By.xpath("//td[text()='Student Name']/../td[2]");
    private final By email = By.xpath("//td[text()='Student Email']/../td[2]");
    private final By gender = By.xpath("//td[text()='Gender']/../td[2]");
    private final By number = By.xpath("//td[text()='Mobile']/../td[2]");
    private final By birthday = By.xpath("//td[text()='Date of Birth']/../td[2]");
    private final By subjects = By.xpath("//td[text()='Subjects']/../td[2]");
    private final By hobbies = By.xpath("//td[text()='Hobbies']/../td[2]");
    private final By picture = By.xpath("//td[text()='Picture']/../td[2]");
    private final By address = By.xpath("//td[text()='Address']/../td[2]");
    private final By stateAndCity = By.xpath("//td[text()='State and City']/../td[2]");

    public String getTitle() {
        return getDriver().findElement(title).getText();
    }
    public String getFullName() {
        return getDriver().findElement(fullName).getText();
    }

    public String getEmail() {
        return getDriver().findElement(email).getText();
    }

    public String getGender() {
        return getDriver().findElement(gender).getText();
    }

    public String getNumber() {
        return getDriver().findElement(number).getText();
    }

    public String getBirthday() {
        return getDriver().findElement(birthday).getText().replace(",", " ");
    }

    public String getSubjects() {
        return getDriver().findElement(subjects).getText();
    }

    public String getHobbies() {
        return getDriver().findElement(hobbies).getText();
    }

    public String getPicture() {
        return getDriver().findElement(picture).getText();
    }

    public String getAddress() {
        return getDriver().findElement(address).getText();
    }

    public String getStateAndCity() {
        return getDriver().findElement(stateAndCity).getText();
    }
}
