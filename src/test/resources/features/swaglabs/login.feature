Feature: Login
  @Login
  Scenario: User success login
    Given The user is already on the login page
    When Input valid username "standard_user"
    When Input valid password "secret_sauce"
    And Click login button
    Then Go to inventory page
