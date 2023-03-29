## Summary Behavior Driven Development (BDD) ##
- Format BDD : 
- 1. User Story 
- 2. As a (X) I want (Y) So That (Z) 
- 3. Scenario 
- 4. Given, When, Then
- Gherkin BDD Language : 
- 1. Meta - Search feature for user. This feature is very important because it will allow users to filter products. 
- 2. Narrative : As a user
I want to be able to choose a payment method
So that I can make a purchase easily
- 3. Scenario : Successfully payment
    Given I am on the payment method selection page
    When I select a valid payment method
    And I click the Pay Now button
    Then the system should process my payment and show a confirmation message
- Step BDD With Cucumber : 1. Write Story with Gherkin Syntax 2. Map Steps to Java 3. Configure Stories 3. Run Stories 4. View Reports