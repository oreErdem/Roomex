package com.roomex.pages;

import com.roomex.utilities.BrowserUtils;
import com.roomex.utilities.Driver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }




    public boolean isMsgDisplayed(WebElement element){

        //first we check if error message WebElement is not null
        //if no WebElement returns from Expected Conditions method
        //force the assertion fails by returning false
        try {
            BrowserUtils.waitForVisibility(element,5);
        }catch (TimeoutException e){
            return false;
        }



        //check if error WebElement is displayed
        if(element.isDisplayed()){
            //and has content
            if(!element.getAttribute("textContent").isEmpty()){
                return true;
            }
        }
        return false;
    }
}
