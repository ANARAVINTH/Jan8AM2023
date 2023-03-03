
Feature: Validate the login page of sales force application

  @SmokeTest @RegressionTest @AlphaTeam
  Scenario: To validate the login functionality with Valid US & PW
    Given User Should navigate to login page of salesforce application
    When User Enters the username "LearnMore" and password "abc"
    And User clicks the login Button
    Then User navigates to the Home page

  @RegressionTest @AlphaTeam
  Scenario: Validating the error message in login page
    Given User Should navigate to login page of salesforce application
    When User Enters the username "LearnMore" and password "xyz"
    And User clicks the login Button
    Then User Validate the error message "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

  @SampleTest @AlphaTeam
  Scenario Outline: Validating the login functionality with multiple data
    Given User Should navigate to login page of salesforce application
    When User Enters the username "<UserName>" and password "<Password>"
    And User clicks the login Button
    Then User navigates to the Home page
    Examples:
      | UserName  | Password  |
      | LearnMore | like      |
      | Aravinth  | share     |
      | Arun      | subscribe |

  @StaticDropdown
  Scenario: Static Dropdown handling
    Given User Navigates to the Application
    When User Selects the value from the currency dropdown
    And User extract the currency dropdown values

  @DynamicDropdown
  Scenario: Static Dynamic handling
    Given User Navigates to the Application
    When User handles the dynamic dropdown

  @MouseActions
  Scenario: Mouse Action handling
    Given User Navigates to the Application
    When User handles the Mouse Action

  @Frame
  Scenario: Mouse Action handling
    Given User Navigates to the Application
    When User handles the frame

  @TabelHandling
  Scenario: Table handling
    Given User Navigates to the Application
    When User handles the Table


  @AutoDynamicDropdown
  Scenario: Dynamic Drop
    Given User Navigates to the Application
    When User handles the auto suggestive

  @cal
  Scenario:Calander
    Given User Navigates to the Application
    When User handles the calander

  @Stale
  Scenario:  StaleElementReferenceException
    Given User Navigates to the Application
    When User Enters the username and password

  @Hyperlink
  Scenario:  Count the links
    Given User Navigates to the Application
    And sample
    When User counts the links

    @ManualTest
  Scenario:
      Given Hello







