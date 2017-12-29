Feature:Checking Sign in functionality working as a user
  Scenario:verify user can login successfully
    Given user is on amazon home page
    When user clicks "Sign in" link
    And user types valid email "mayanag2017@gmail.com"
    And  user types valid password "Animation@123"
    And  user clicks "Sign in" button
    Then user should landed on "Hello, Maya" page



