Feature: DataTable concept
 Datatable concept - Data Driven Framework using cucumber BDD
 
 Background:
  Given User launches DemoQA application
  And user Click on Form menu
  Then Verify User is on Form page
  When User Click on Practice Form under Forms
  Then Verify Form is be displayed
  
 
@smoke
  Scenario Outline: DemoQA Form Automation using Datatable concept
  
  Given User enter name
  |Vyshnavi|Dakarapu|
  And User enter EmailId
  |selenium.onlinetutorials@gmail.com|
  And User Select "<Gender>" radio button
  And user Enter the mobile number "<mobileNum>"
  And User enter the subjects "<Subjects>"
  And User Slect Hobbies "<Hobbies>"
  
  Examples:
  | Gender | mobileNum   | Subjects  | Hobbies |
  | Male   | 43883284832 | Economics | Sports  |
  
  
  @release @regression
  Scenario: DemoQa Practive Form uing DataTable with Map collection
  
  Given User enter name of the student
  | firstname | lastname |
  | Jhon      |  Smith   |
  
  
  
  
  
  
  
  