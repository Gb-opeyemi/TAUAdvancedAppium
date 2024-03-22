package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTaskExample extends TestBase {
    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;



    @Given("Click add new Task")
    public void clickAddNewTask() throws MalformedURLException {
//        Android_setUp();
        taskListPage = new TaskListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskDesc) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(taskDesc);
    }


    @Then("Task Added Successfully")
    public void taskAddedSuccessfully() {
        createTaskPage.clickSaveBtn();
        driver.navigate().back();
        tearDown();
    }
}
