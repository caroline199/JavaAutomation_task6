package onliner.selenium.elements;

import onliner.selenium.enums.KsisItems;
import onliner.selenium.utils.WebDriverRunner;
import org.openqa.selenium.By;

public class CatalogList {
    private static final String ITEM_PATTERN = "//span[contains(@class,'catalog-navigation-list') and contains(text(), '%s')]";

    public boolean isItemExists(String name) {
        return WebDriverRunner.getDriver().findElement(By.xpath(String.format(ITEM_PATTERN, name))).isDisplayed();
    }

    public void clickOnItem(KsisItems item) {
        WebDriverRunner.getDriver().findElement(By.xpath(String.format(ITEM_PATTERN, item.getValue()))).click();
    }
}
