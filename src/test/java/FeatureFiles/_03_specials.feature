Feature: Specials Functionality
Background:
  Given Navigate to practicesite
  When Enter username and password and click login button
  Then User should login successfully
  And Navigate to specials page

  Scenario: Add firs item to cart

    When Click list button and add the first dress to the cart
    Then Successfully added message is displayed

  Scenario: Women part Functionality
    When Select T-shirts and add to cart
    Then T-shirt text should be seen on the screen

#  Scenario: Search Functionality
#    When Search T-shirt
#    Then Search T-shirt text should be seen on the screen
