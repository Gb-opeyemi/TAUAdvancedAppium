package tests;

import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @DataProvider(name = "tasks data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir")+"/data/TasksData.json",
                "Tasks Data", 2);
    }


    @Test(dataProvider = "tasks data")
    public void test_add_task(String taskName, String taskDesc) throws MalformedURLException {
        Android_setUp();
        taskListPage = new TaskListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(taskDesc);
        driver.navigate().back();
        createTaskPage.clickSaveBtn();
        tearDown();
    }


}
