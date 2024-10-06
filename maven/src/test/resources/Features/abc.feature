Feature: Testing Heroku App

  Scenario: Verify A/B Testing and Dropdown Functionality
    Given I launch the application
    When I verify the title of the page
    And I click on A/B Testing link
    Then I verify the text on the A/B Testing page
    When I navigate back to the home page
    And I click on the dropdown link
    And I select Option 1
    Then I confirm the selection
    When I navigate back to the home page
    And I click on Frames
    Then I verify the presence of nested frames and iframe links
    And close the browser

