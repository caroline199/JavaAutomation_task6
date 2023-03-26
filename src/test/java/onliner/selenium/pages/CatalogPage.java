package onliner.selenium.pages;

import onliner.selenium.enums.KsisItems;
import onliner.selenium.enums.TopMenuCatalogItems;
import onliner.selenium.enums.TopMenuItems;
import onliner.selenium.utils.WebDriverRunner;
import org.openqa.selenium.By;

public class CatalogPage extends BasePage{

    private By catalogTitle = By.xpath("//a[@class='b-tile-main']/h3/span");
    private By catalogSection = By.xpath("//a[@class='b-tile-section']");

    private By dropdownItemTitle = By.xpath("//span[contains(@class,'catalog-navigation-list__dropdown-item')]");

    private By dropdownItemDescription = By.xpath("//span[@class='catalog-navigation-list__dropdown-description']");

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

    public String getDropdownItemTitle() {
        return WebDriverRunner.getDriver().findElements(dropdownItemTitle)
                .get(0)
                .getText();
    }

    public String getDropdownItemDescription() {
        return WebDriverRunner.getDriver().findElements(dropdownItemDescription)
                .get(0)
                .getText();
    }
}
