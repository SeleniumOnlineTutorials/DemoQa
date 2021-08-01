Feature: Multiple testdata sceanrio
Scenario Outline: Elements Automation with multiple testdata
  Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "<FullName>"
    And User enters Email as "<EmailId>"
    And User enters Current Address as "<CurrentAddress>"
    And User enters Permenant Address as "<PermenantAddress>"
    And User clicks on Submit button
    
    Examples:
    | FullName    |       EmailId					        | CurrentAddress  | PermenantAddress |
    |  Java       | java.tutorials@gmail.com      | plot xyz: 34534 | plot xyz: 34534  |
    |  Selenium   | selenium.tutorials@gmail.com  | plot abc: 46536 | plot abc: 42543  |
    |  QA Testing | qaTesting.tutorials@gmail.com | plot abc: 46536 | plot abc: 42543  |
    