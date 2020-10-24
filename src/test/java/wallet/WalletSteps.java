package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });


        Given("I have deposited $500 in my wallet", () -> {
            wallet.deposit(500);
            Assert.assertEquals("Incorrect wallet balance", 500, wallet.getBalance());
        });

        When("I request $500", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 500);
        });
        Then("$500 should be dispensed", () -> {
            Assert.assertEquals(500, cashSlot.getContents());
        });
        Given("I have deposited $199 in my wallet", () -> {
            wallet.deposit(199);
            Assert.assertEquals("Incorrect wallet balance", 199, wallet.getBalance());
        });

        When("I request $201", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 201);
        });
        Then("$201 should be dispensed", () -> {
            Assert.assertEquals(201, cashSlot.getContents());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.debit(100);
            Assert.assertEquals("Wallet balance", -100, wallet.getBalance());
        });
        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, -100);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(-100, cashSlot.getContents());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });
        Given("there is $150 in my wallet", () -> {
            wallet.debit(150);
            Assert.assertEquals("Display wallet balance", 150, wallet.getBalance());
        });
        When("I check the balance of my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 150);
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(150, cashSlot.getContents());
        });
    }
}
