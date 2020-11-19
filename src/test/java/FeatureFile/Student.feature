Feature: Student testing

  Scenario Outline: Add new Students
    Given Navigate to the basqar website
    When Enter the <username> and <password> Click on log in button
    Then Click student
    And Click students
    And Add new student
    And FirstName is <FName> LastName is <LName>
    And  Click Gender
    And Click Grade Level
    And Click Section
    And Click Citizenship
    And Click Document Type
    Then Click Document Number
    Examples:
      | username | password       | FName   | LName  |
      | "admin"  | "F4pj8Zsq52mX" | "Nohur" | "Boss" |

