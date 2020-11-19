Feature: Work with Setup Page

  Scenario: Login to Basqar
    Given Navigate to the website
    And Enter username and password
    Then Click button "loginBtn"

  Scenario: Add the Country
    Given Click button in SetupPage "setupBtn"
    And Click button in SetupPage "paramBtn"
    And Click button in SetupPage "countryBtn"
    And Click button in SetupPage "addCountryBtn"
    And Enter to "countryNameInput" the value "Turkmenistan"
    And Enter to "countryCodeInput" the value "1123"
    And Click button in SetupPage "countrySaveBtn"
    Then It should show "SuccessfullyMessage"
