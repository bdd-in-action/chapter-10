package com.bddinaction.chapter10.jbehave.steps;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * A description goes here.
 * User: john
 * Date: 4/02/2014
 * Time: 10:35 PM
 */
public class LoginSteps {
    @Given("$username has registered online with a password of '$password'")
    public void registered_online_with_a_password_of_secret(String username, String password) throws Throwable {
    }

    @When("$username logs on with password '$password'")
    public void Joe_logs_on_with_password_secret(String username, String password) throws Throwable {
    }

    @Then("he should be given access to the site")
    public void he_should_be_given_access_to_the_site() throws Throwable {
    }


    @Then("he should be informed that his password was incorrect")
    public void he_should_be_informed_that_his_password_was_incorrect() throws Throwable {
    }

    @Given("the account has expired")
    public void the_account_has_expired() throws Throwable {
    }

    @Then("he should be informed that his account has expired")
    public void he_should_be_informed_that_his_account_has_expired() throws Throwable {
    }

    @Then("he should be invited to renew his account")
    public void he_should_be_invited_to_renew_his_account() throws Throwable {
    }


}
