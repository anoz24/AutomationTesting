package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
    ChromeDriver driver;
    
    public BasePage(ChromeDriver driver){
        this.driver = driver;
    }

    public void clickButton(By element){
        driver.findElement(element).click();
    }

    public void enterTextFieldData(By element , String data){
        driver.findElement(element).sendKeys(data);
    }

    public void enterSelectData(By element , String data){
        Select selectObj = new Select(driver.findElement(element));
        selectObj.selectByVisibleText(data);
    }
}
