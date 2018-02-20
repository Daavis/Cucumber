Feature: google search
  Search word in google and check results

  Scenario Outline: search
    Given I navigate to google search page
    And I enter <word> in serach input
    And I click search button
    Then I should see results

    Examples: 
      | word  |
      | Dawid |
