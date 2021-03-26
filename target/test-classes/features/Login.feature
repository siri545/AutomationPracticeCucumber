@login @smoke
Feature: Test login function

  Background:
    Given Navigate to automation practice website
    Then Verify landing page display

  @loginCorrect  #Test Cases 1
  Scenario Outline: User login using correct info
    Given Click on Sign in button
    And User try to sign in using "<username>" and "<password>"
    Then User should land on my account page and see "<accountName>"

    Examples:
      | username                  | password    | accountName |
      | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | Jen Yang    |
      | jj_yangyuzhen@icloud.com  | Siri-951753 | Siri Sing   |

     #LangingPage
     #LoginPage
     #MyAccountPage


  @loginWrong  #Test Cases 2 - 5
  Scenario Outline: User login using wrong info
    Given Click on Sign in button
    And User try to sign in using "<username>" and "<password>"
    Then User should see "<warningMassage>"

    Examples:
      | username                  | password      | warningMassage             |
      | jj_yangyuzhen@hotmail.com | Jenmoh-252222 | Authentication failed.     |
      | jj_yuzhen@icloud.com      | Siri-951753   | Authentication failed.     |
      | wrong@hotmail.com         | wrong-2522    | Authentication failed.     |
      |                           |               | An email address required. |

    #LangingPage
    #LoginPage
