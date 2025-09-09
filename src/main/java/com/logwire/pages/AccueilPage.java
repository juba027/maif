package com.logwire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccueilPage {

    public AccueilPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[href='/']")
    WebElement particuliersMenuButton;

    @FindBy(css = "[href='/professionnels']")
    WebElement professionnelsMenuButton;

    @FindBy(css = "[href='/enseignants']")
    WebElement enseignantsMenuButton;

    @FindBy(css = "[href='/associationsetcollectivites']")
    WebElement associationsEtcollictivitesMenuButton;

    public void clickOnParticuliersMenuButton() {
        particuliersMenuButton.click();
    }

    public void clickOnProfessionnelsMenuButton() {
        professionnelsMenuButton.click();
    }

    public void clickOnEnseignantsMenuButton() {
        enseignantsMenuButton.click();
    }

    public void clickOnAssociationsEtcollictivitesMenuButton() {
        associationsEtcollictivitesMenuButton.click();
    }

}