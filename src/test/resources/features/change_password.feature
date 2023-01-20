Feature: I as user of the StartSharp
  i want to change my password
  to access as user


  Scenario: Successful  password change
    Given I as a user on the home page
    When I as a user change the user password by filling in all the fields
    Then I as user can see successful password change