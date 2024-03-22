Feature: Create New Task
  Scenario Outline: The user can add new task
    Given Click add new Task
    Given Enter "<TaskName>" and "<TaskDesc>"
    Then Task Added Successfully

    Examples:
      | TaskName | TaskDesc |
      | Finish Appium Course | Need to finish Appium Course |
      | Finish CV            | Need to edit CV              |