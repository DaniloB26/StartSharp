Feature: I as user of the StartSharp
  i want to create a new register
  to access as user


  Scenario: Successful user creation
    Given me as a user on the home page
    When user create an account filling all fields
    Then user sees its username

