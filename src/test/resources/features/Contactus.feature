@contactUs @smoke
Feature: Test contact us function

  Background:
    Given Navigate to automation practice website
    Then Verify landing page display

  @contactUsPage    #Test Cases 12 - 15
  Scenario Outline: User contact customer service and filled up all the filed
    Given User click on contact us button
    And User land on contact us page
    And User choose subject Heading "<Heading>"
    Then User enter email address "<email>"
    And User enter order reference "<reference>"
    And User try to attach file
    And User enter massage "<massage>"
    Then User should see successfully sent massage

    Examples:
      | Heading          | email                     | reference | massage                |
      | Customer service | jj_yangyuzhen@hotmail.com | 12345     | I want my money back   |
      | Webmaster        | jj_yangyuzhen@icloud.com  | 098375645 | Please contact me back |

    #LangingPage
    #ContactUsPage


  @contactUsFile    #Test Cases 16 - 21
  Scenario Outline: User contact customer service without filled up all the filed
    Given User click on contact us button
    And User land on contact us page
    And User choose subject Heading "<Heading>"
    Then User enter email address "<email>"
    And User enter order reference "<reference>"
    And User enter massage "<massage>"
    Then User should see warning error massage "<warning>"

    Examples:
      | Heading          | email                     | reference | massage              | warning                      |
      | Customer service |                           |           |                      | Invalid email address.       |
      | Webmaster        |                           | 12345     |                      | Invalid email address.       |
      | Customer service | jj_yangyuzhen@hotmail.com |           |                      | The message cannot be blank. |
      | Webmaster        |                           | 12345     | I want my money back | Invalid email address.       |
      | Customer service | jj_yangyuzhen@hotmail.com | 12345     |                      | The message cannot be blank. |

     #LangingPage
     #ContactUsPage