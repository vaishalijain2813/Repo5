Feature: Login Keka

  Scenario Outline: Verify Negative Login scenario of keka tool.
    Given Open link of keka.
    Then User on Keka Login Page.
    Then Enter credentials in fields "<email>" and "<password>".
    Examples:

      | email                         | password  |
#      Scenario1: Correct email address and incorrect Password.
      | vaishali.jain@successive.tech | VAIjai13  |
#      Scenario2: Incorrect email address and correct Password.
      | vaishali.jain@successive.tec  | VAIjai13@ |
#      Scenario3: Incorrect email address and incorrect Password.
      | vaishali.jain@successive.tec  | VAIjai13  |
#      Scenario4: Blank email address and incorrect Password.
      |                               | VAIjai13  |
#      Scenario5: Correct email address and Blank Password.
      | vaishali.jain@successive.tech |           |
#      Scenario6: Blank email address and Blank Password.
      |                               |           |
#      Scenario7: Correct email address and correct Password.
      | vaishali.jain@successive.tech | VAIjai13@ |

  Scenario: Click on all Left Pane tabs and verify the successful landing.
      Given Click on all left pane tabs and verify successful landing.




