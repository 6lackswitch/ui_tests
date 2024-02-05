package org.ui.elements;

import org.openqa.selenium.By;

import static org.ui.common.Driver.getDriver;

public class DatePicker {
    private final By monthDropdown = By.xpath("//*[@class='react-datepicker__month-dropdown-container react-datepicker" +
            "__month-dropdown-container--select']");
    private final By yearDropdown = By.xpath("//*[@class='react-datepicker__year-dropdown-container react-datepicker" +
            "__year-dropdown-container--select']");


    public void setDate(String day, String month, String year) {
        getDriver().findElement(monthDropdown).click();
        getDriver().findElement(monthDropdown)
                .findElement(By.xpath("//option[text()='" + month + "']")).click();
        getDriver().findElement(yearDropdown).click();
        getDriver().findElement(yearDropdown)
                .findElement(By.xpath("//option[@value='" + year + "']")).click();
        String dayMonth = month + " " + day;
        getDriver().findElement(yearDropdown)
                .findElement(By.xpath("//div[contains(@aria-label, '" + dayMonth + "')]")).click();
    }
}
