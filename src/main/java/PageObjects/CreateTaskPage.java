package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreateTaskPage extends PageBase{
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextTitre")
    WebElement taskNameTxt;

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextNote")
    WebElement taskDescTxt;

    @AndroidFindBy(id = "com.jeffprod.todo:id/action_save")
    WebElement saveBtn;

    public void enterTaskName(String taskName){
        clear(taskNameTxt);
        sendText(taskNameTxt, taskName);
    }

    public void enterTaskDesc(String descText){
        clear(taskDescTxt);
        sendText(taskDescTxt, descText);
    }

    public void clickSaveBtn(){
        click(saveBtn);
    }
}


