@purchase @smoke
Feature: Test purchase function

  Background:
    Given Navigate to automation practice website
    Then Verify landing page display


  @purchaseItem   #Test Cases 22 - 25
  Scenario Outline: User purchase item
    Given User search for item "<keyword>"
    Then User should see search "<results>"
    When User click on More button on Printed Summer Dress
    Then User land on Add to cart page
    And User choose "<quantity>" and "<size>" and "<color>"
    When User click on Add to cart button
    Then User should see the confirm massage and click on proceed to checkout
    Then User land on Summary page and click on proceed to checkout
    And User try to sign in using "<username>" and "<password>"
    Then User land on Address page and enter "<massage>" and click on checkout
    And User land on Shipping page and cling on checkout
    And User land on Payment page and click on pay by check
    When User click on confirm my order button
    Then User should see order confirm massage


    Examples:
      | keyword               | results                    | quantity | size | color  | username                  | password    | massage                      |
      | Printed Chiffon Dress | 2 results have been found. | 3        | M    | Green  | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | I just order dresses         |
      | dress                 | 7 results have been found. | 10       | S    | Yellow | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | I just order dress           |
      | summer dress          | 4 results have been found. | 5        | L    | Black  | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | I want Tracking number       |
      | summer dress          | 4 results have been found. | 9        | M    | Orange | jj_yangyuzhen@icloud.com  | Siri-951753 | Send me Tracking number      |
      | summer dress          | 4 results have been found. | 15       | L    | Blue   | jj_yangyuzhen@hotmail.com | Jenmoh-2522 | I want Tracking number       |
      | summer dress          | 4 results have been found. | 28       | S    | Yellow | jj_yangyuzhen@icloud.com  | Siri-951753 | I want Tracking number       |

    #LaningPage
    #SearchResultsPage
    #AddtocartPage
    #SummaryPage
    #AddressPage
    #ShippingPage
    #PaymentPage