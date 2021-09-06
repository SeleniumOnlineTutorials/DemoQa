package StepDefinitions;

import io.cucumber.java.en.*;
public class HooksSteps {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("I want to write a step with precondition");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("some other precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("some other action");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("yet another action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
		System.out.println("I want to write a step with name{int}");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("I check for the {int} in step");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println("I verify the success in step");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
		System.out.println("I verify the Fail in step");
	}

}
