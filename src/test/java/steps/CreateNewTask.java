package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase {
    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;



    @Given("Click Add new Task")
    public void clickAddNewTask() throws MalformedURLException {
//        Android_setUp();
        taskListPage = new TaskListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
    }

    @Given("Enter TaskName")
    public void enterTaskName() {
        createTaskPage.enterTaskName("Finish Appium Course");
    }

    @Given("Enter TaskDesc")
    public void enterTaskDesc() {
        createTaskPage.enterTaskDesc("Need to finish Appium Course ASAP");
    }

    @When("Click Save")
    public void clickSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        driver.navigate().back();
        tearDown();
    }
}
