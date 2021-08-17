@feature1
Feature: Demo QA Application Automation

  @smoke
  Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "@smoke"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @regression
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "@regression"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @smoke @regression
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "@smoke @regression"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @regression @release
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "@regression @release"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @smoke @regression @release
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "Selenium Tutorials"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @smoke
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "Selenium Tutorials"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @regression
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "Selenium Tutorials"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button
    
    @release @smoke
    Scenario: Elements Automation
    Given User launches DemoQA application
    And User selects Elements in the home page
    And User clicks Text box option in Elements page
    And User enters Fullname as "Selenium Tutorials"
    And User enters Email as "selenium.onlinetutorias@gmail.com"
    And User enters Current Address as "Plot: 234, Hydrabad"
    And User enters Permenant Address as "Plot: 234, Hydrabad"
    And User clicks on Submit button