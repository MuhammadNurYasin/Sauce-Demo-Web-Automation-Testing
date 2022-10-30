package starter.page;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement dashboardHeader;




    public String getHeaderText(){
        return dashboardHeader.getText();

    }

}
