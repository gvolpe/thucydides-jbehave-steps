package ar.com.gvolpe.test.steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ar.com.gvolpe.test.mediator.CalculatorMediator;
import net.thucydides.core.annotations.Steps;

public class CalculatorSteps {
	
	@Steps
	CalculatorMediator calculatorMediator;
	
	@BeforeScenario
	public void init() {
		// Work around for initialize mediator variables between scenarios
		calculatorMediator.init();
	}
	
	@Given("number $n1 and number $n2")
	public void given(Integer n1, Integer n2){
		calculatorMediator.setNumbers(n1, n2);
	}
	
	@When("calculate the sum of both numbers") 
	public void when() {
		calculatorMediator.sum();
	}
	
	@Then("the sum should be $result")
	public void then(Integer result) {
		calculatorMediator.shouldBeSum(result);
	}

}
