Feature: Solar Energy Calculator for UK resident

  Scenario Outline: Non Uk resident trying to calculate
    Given Launching solar energy calculator site "https://www.pvfitcalculator.energysavingtrust.org.uk/"
    When Entering postcode "<postcode>"
    Then Verifying postcode is valid "<expected error message>"
    And Trying to enter the calculator page by clicking next button error popup shown
    And Closing browser window
    Examples:
      | country | postcode   | expected error message                    |
      | Ireland | D15X435    | formField jsPostcode isRequired isInvalid |
      | US      | 12345-1234 | formField jsPostcode isRequired isInvalid |
      | Germany | 10115      | formField jsPostcode isRequired isInvalid |


  Scenario Outline: Uk resident calculating potential annual benefit that they can get by installing solar system
    Given Launching solar energy calculator site "https://www.pvfitcalculator.energysavingtrust.org.uk/"
    When Entering postcode "<postcode>"
    Then Verifying postcode is valid "formField jsPostcode isRequired isValid"
    And Entering into the calculator page by clicking next button
    Then Selecting roof slope <roof slope> degree
    And Selecting shading <shading value> percentage
    And Selecting installation size "<installation size>"
    And Reaching result page by clicking the next button
    Then Checking for "Potential annual benefit"
    And Closing browser window
    Examples:
      | country          | postcode | roof slope | shading value | installation size |
      | UK               | GU16 7HF | 25         | 20            | 4 kWp             |
      | Scotland         | EH12 7TB | 20         | 20            | 2 kWp             |
      | Northern Ireland | BT10 0QX | 25         | 20            | 4 kWp             |