package org.fasttrackit.dataprovider;

import org.fasttrackit.Account;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public static Object[][] createLoginsProvider() {
        Account dinoAccount = new Account("dino", "choochoo");
        Account beetleAccount = new Account("beetle", "choochoo");
        Account turtleAccount = new Account("turtle", "choochoo");
        return new Object[][]{new Object[]
                {dinoAccount},
                {beetleAccount},
                {turtleAccount}
        };

    }












}
