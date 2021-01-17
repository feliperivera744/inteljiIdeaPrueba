#Autor juan felipe rivera
  @stories
  Feature: academy choucair
  as a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: search for automation course
    Given than brandon wants to learn automation at the academy choucair
    | strUser |  strPassword |

    When he search for the course Bancolombia Automation Resources on the choucair academy plataform
      | strCourse               |
    Then he fidns the course called Bancolombia Automation Resources
      | strCourse               |