#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Check Train Ticket

 
   
  @RegressionTest 
  Scenario: Login To Noukri.com
    Given open website
    And Enter "<username>" and "<password>"
    When Hit Login
    Then Check Login "<status>"
    
    
    
    Examples: 
      | username  | password | status  |
      | ashvelapure@gmail.com |     9422117187 | success |
      | name2 |     7 | Fail    |
