package starter.step;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.page.InventoryPage;
import starter.page.LoginPage;
import static org.junit.Assert.assertTrue;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginStep {

    @Steps
    LoginPage Loginpage;
    InventoryPage inventoryPage;

    @Step
    public void openLoginPage() {
        Loginpage.open();
        Loginpage.inputUsername();
        Loginpage.inputPassword();
        Loginpage.clickLoginButton();
    }

    @Step
    public void inputValidUsername(String name){
        Loginpage.inputUsername(name);
    }

    @Step
    public void inputValidPassword(String password){

        Loginpage.inputPassword(password);
    }

    @Step
    public void clickLoginButton(){
        Loginpage.clickLoginButton();
    }

    @Step
    public void goToInventoryPage(){

        String header = inventoryPage.getHeaderText();
        assertTrue(header.equalsIgnoreCase("product"));



    }


}

