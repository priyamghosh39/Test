Feature: Creating Multiple Features and Step Defintions for ND

  Scenario Outline: Test discount combinations for ND
    Given Open browser and start application
    When Enter "<weight>" and "<distance>"
    Then Validate the output "<message>"

    Examples: 
      | weight | distance | message                           |
      |     60 |      110 | Datax shipping offers no discount |
      |     50 |      150 | Datax shipping offers no discount |
