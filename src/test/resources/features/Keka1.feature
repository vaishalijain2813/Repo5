Feature: Login Keka

  Scenario Outline: Verify Negative Login scenario of keka tool.
    Given Open link of keka.
    Then User on Keka Login Page.
    Then Enter credentials in fields "<email>" and "<password>".
    Examples:

      | email                         | password  |
#      Scenario1: Correct email address and incorrect Password.
      | vaishali.jain@successive.tech | 1234567  |
#      Scenario2: Incorrect email address and correct Password.
      | vaishali.jain@successive.tec  | 1234567@ |
#      Scenario3: Incorrect email address and incorrect Password.
      | vaishali.jain@successive.com  | 12345678  |
#      Scenario4: Blank email address and incorrect Password.
      |                               | 1235667  |
#      Scenario5: Correct email address and Blank Password.
      | vaishali.jain@successive.com |           |
#      Scenario6: Blank email address and Blank Password.
      |                               |           |
#      Scenario7: Correct email address and correct Password.
      | vaishali.jain@successive.com | 12345678 |

  Scenario: Click on all Left Pane tabs and verify the successful landing.
      Given Click on all left pane tabs and verify successful landing.




