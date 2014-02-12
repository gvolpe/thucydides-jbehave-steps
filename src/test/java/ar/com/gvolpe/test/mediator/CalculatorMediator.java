package ar.com.gvolpe.test.mediator;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;

public class CalculatorMediator {
	
	private Integer n1;
	private Integer n2;
	private Integer result;
	
	@Step
	public void init() {
		this.result = null;
	}
	
	@Step
	public void setNumbers(Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Step
	public void sum() {
		//Result: In the first scenario is null and in the second scenario is 11
		System.out.println("THIS RESULT: " + result); 
		this.result = n1 + n2;
	}

	@Step
	public void shouldBeSum(Integer expectedResult) {
		Assert.assertEquals(expectedResult, result);
	}

}
