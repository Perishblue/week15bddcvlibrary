Feature: homepage Test

  @smoke
  Scenario Outline: User should find jon search successfully.
    Given User is on Homepage.
    When I enterJobTitle "<jobTitle>"
    And I enterLocation "<location>"
    And I selectDistance "<distance>"
    And I clickOnMoreSearchOptionLink
    And I enterMinSalary "<minSalary>"
    And I enterMaxSalary "<maxSalary>"
    And I selectSalaryType "<Type>"
    And I selectJobType "<JobType>"
    Then I clickOnFindJobsButton
    Examples:
      | jobTitle | location | distance | minSalary | maxSalary | Type      | JobType   |
      | Tester   | Watford  | 10 miles | 35000     | 45000     | Per annum | Permanent |