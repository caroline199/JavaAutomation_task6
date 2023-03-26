package onliner.selenium.elements;

import onliner.selenium.enums.KsisItems;
import onliner.selenium.utils.WebDriverRunner;
import org.openqa.selenium.By;

public class CatalogListDropdown {

    private static final String ITEM_PATTERN = "//div[contains(@class,'catalog-navigation-list__aside-title') and contains(normalize-space(), '%s')]";

    public boolean isItemExists(String name) {
        return WebDriverRunner.getDriver().findElement(By.xpath(String.format(ITEM_PATTERN, name))).isDisplayed();
    }

    public void clickOnItem(KsisItems item) {
        WebDriverRunner.getDriver().findElement(By.xpath(String.format(ITEM_PATTERN, item.getValue()))).click();
    }
}
