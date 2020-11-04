package aplikacja;

import io.cucumber.java8.En;
import org.junit.Assert;


public class LogInSteps implements En {
    private String login;
    private String password;

    public LogInSteps() {

        Given("I fill in {login} with {iza}", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.login = "iza";
        });

        Given("I fill in {password} with {iza}", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.password = "iza";
        });

        When("I press {login}", () -> {
            // Write code here that turns the phrase above into concrete actions
            Login login = new Login();
            Password password = new Password();
            this.password = password.checkPassword(this.password);
            this.login = login.checkLogin(this.login);
        });

        Then("I should be on the users home page", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.login);
            Assert.assertEquals(string, this.password);
        });

        Given("I fill in {login} with {izuuu}", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.login = "izuuu";
        });

        Given("I fill in {password} with {izuuu}", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.password = "izuu";
        });

        When("I press {login}", () -> {
            // Write code here that turns the phrase above into concrete actions
            Login login = new Login();
            Password password = new Password();
            this.password = password.checkPassword(this.password);
            this.login = login.checkLogin(this.login);
        });

        Then("I should not be on the users home page", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.login);
            Assert.assertEquals(string, this.password);
        });


    }
}