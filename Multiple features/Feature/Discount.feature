Feature: Creating Multiple Features and Step Defintions

  Scenario Outline: Test discount combinations
    Given Open browser and start application
    When Enter "<weight>" and "<distance>"
    Then Validate the output "<message>"

    Examples: 
      | weight | distance | message                                |
      |    100 |      200 | Datax shipping company offers discount |
      |     80 |      500 | Datax shipping company offers discount |
      |    120 |      520 | Datax shipping company offers discount |
      |    300 |      200 | Datax shipping company offers discount |
