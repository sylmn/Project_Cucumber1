Feature: Contact Us Functionality
Background:
  Given Navigate to practicesite
  When Enter username and password and click login button
  Then User should login successfully
  And Navigate to contact us page




  Scenario: Sending Problem Message
    When Sent problem message to customer service
    Then Success message should be displayed

  Scenario: Send wrong e mail address
    When Send wrong e mail address
    Then Error message should be displayed

  Scenario: Sending Blank Message
    When Sent webmaster blank message
    Then Error message should be displayed
