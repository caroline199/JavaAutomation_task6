package onliner.selenium.pages;

import onliner.selenium.enums.KsisItems;
import onliner.selenium.enums.TopMenuCatalogItems;
import onliner.selenium.enums.TopMenuItems;
import onliner.selenium.utils.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage{

    private By catalogTitle = By.xpath("//div[@class='catalog-navigation__title']");
    private By catalogSection = By.xpath("//ul[contains(@class,'catalog-navigation-classifier')]");

    private By dropdownItemTitle = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[@class='catalog-navigation-list__dropdown-item']//span[@class='catalog-navigation-list__dropdown-title']");

    private By dropdownItemDescription = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[@class='catalog-navigation-list__dropdown-item']");
    public boolean isNewsItemPresent() {
        return topMenu.isItemExists(TopMenuItems.CATALOG.getValue());
    }

    public boolean isItemPresent(TopMenuCatalogItems item) {
        return topMenuCatalog.isItemExists(item.getValue());
    }

    public boolean isCatalogItemsListPresent(KsisItems item) {
        return catalogList.isItemExists(item.getValue());
    }

    @Override
    public void openPage() {
        topMenu.clickOnItem(TopMenuItems.CATALOG);
    }

    public void openKsis() {
        topMenuCatalog.clickOnItem(TopMenuCatalogItems.KSIS);
    }

    public void openCatalogItemsListDropdown() {
        catalogListDropdown.clickOnItem(KsisItems.ACCESSORIES);
    }

    public String getCatalogTitle() {
        return WebDriverRunner.getDriver().findElements(catalogTitle)
                .get(0)
                .getText();
    }


    public String getCatalogSection() {
        return WebDriverRunner.getDriver().findElement(catalogSection).getText();
    }

    public WebElement getDropdownItemTitle() {
        return WebDriverRunner.getDriver().findElement(dropdownItemTitle);
    }

    public WebElement getDropdownItemDescription() {
        return WebDriverRunner.getDriver().findElement(dropdownItemDescription);
    }
}
