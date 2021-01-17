package co.com.choucair.certification.proyectobase.stepdefinitions;



import co.com.choucair.certificaction.academy.model.AcademyChourcairData;
import co.com.choucair.certificaction.academy.questions.Answer;
import co.com.choucair.certificaction.academy.tasks.Login;
import co.com.choucair.certificaction.academy.tasks.OpenUp;
import co.com.choucair.certificaction.academy.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChourcairData> academyChourcairData)throws Exception {
        OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thepage(),
                Login.onThePage(academyChourcairData.get(0).getStrUser(),academyChourcairData.get(0).getStrPassword()));
    }


    @When("^he search for the course on the choucair academy plataform$")
    public void heSearchForTheCourseBancolombiaAutomationResourcesOnTheChoucairAcademyPlataform(List<AcademyChourcairData> academyChourcairData)throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChourcairData.get(0).getStrCourse()));
      }

    @Then("^he fidns the course called$")
    public void heFidnsTheCourseCalledBancolombiaAutomationResources(List<AcademyChourcairData> academyChourcairData)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChourcairData.get(0).getStrCourse())));
    }

}
