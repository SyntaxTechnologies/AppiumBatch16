Feature: Login page validation

  @test
  Scenario: valid login functionality in android application
    Given user opens the appium driver
    When user enters username and password
    And user clicks on login button
    Then user should be able to navigate to products page


