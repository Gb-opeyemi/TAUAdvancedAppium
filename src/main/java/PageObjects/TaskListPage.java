package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TaskListPage extends PageBase{
    public TaskListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jeffprod.todo:id/fab")
    WebElement addTaskBtn;


    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }

}
