@search @smoke
Feature: Test search function

  Background:
    Given Navigate to automation practice website
    Then Verify landing page display

  @searchWithoutLogin
  Scenario Outline: User search for item without login
    Given User search for item "<keyword>"
    Then User should see search "<results>"

    Examples:
      | keyword      | results                    |
      | dress        | 7 results have been found. |
      | shirt        | 1 result has been found.   |
      | summer dress | 4 results have been found. |
      | ?!&$#        | 0 results have been found. |
      |              | 0 results have been found. |

    #LangingPage
    #SearchResultsPage

  @searchWithLogin
  Scenario Outline: User search for item after login
    Given Click on Sign in button
    And User try to sign in using "<username>" and "<password>"
    And User should land on my account page and see "<accountName>"
    Then User search for item "<keyword>"
    Then User should see search "<results>"

    Examples:
      | username                  | password    | accountName | keyword      | results                    |
      | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | Jen Yang    | dress        | 7 results have been found. |
      | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | Jen Yang    | shirt        | 1 result has been found.   |
      | jj_yangyuzhen@icloud.com  | Siri-951753 | Siri Sing   | summer dress | 4 results have been found. |
      | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | Jen Yang    | ?!&$#        | 0 results have been found. |
      | jj_yangyuzhen@icloud.com  | Siri-951753 | Siri Sing   |              | 0 results have been found. |

    #LangingPage
    #LoginPage
    #MyAccountPage
    #SearchResultsPage



