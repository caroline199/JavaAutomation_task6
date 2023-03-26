package onliner.selenium.tests;
import onliner.selenium.enums.KsisItems;
import onliner.selenium.enums.TopMenuCatalogItems;
import onliner.selenium.pages.CatalogPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import static java.lang.Thread.sleep;

public class CatalogTest extends MainPageTest {
    public CatalogPage catalogPage;

    @BeforeEach
    public void initCatalogPage() {
        catalogPage = new CatalogPage();
    }

    @Test
    public void testCatalogItemPresent() {
        Assertions.assertTrue(catalogPage.isNewsItemPresent());
    }

    @Test
    public void testOpenCatalog() {
        catalogPage.openPage();
        Assertions.assertFalse(catalogPage.getCatalogTitle().isEmpty());
        Assertions.assertFalse(catalogPage.getCatalogSection().isEmpty());
    }

    @Test
    public void testItemsPresent() {
        catalogPage.openPage();
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.ELECTRONICS));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.KSIS));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.APPLIANCES));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.AUTO));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.BUILDERING));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.BEAUTY));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.HOME));
        Assertions.assertTrue(catalogPage.isItemPresent(TopMenuCatalogItems.MOMS));
    }

    @Test
    public void testOpenKsis(){
        catalogPage.openPage();
        catalogPage.openKsis();
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.LAPTOP));
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.ACCESSORIES));
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.TECHNIQUE));
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.STORAGE));
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.NETWORKING));
    }

    @Test
    public void testOpenAccessories() {
        catalogPage.openPage();
        catalogPage.openKsis();
        Assertions.assertTrue(catalogPage.isCatalogItemsListPresent(KsisItems.ACCESSORIES));
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        catalogPage.openCatalogItemsListDropdown();
        Assertions.assertTrue(catalogPage.getDropdownItemTitle().isDisplayed());
        Assertions.assertTrue(catalogPage.getDropdownItemDescription().isDisplayed());
    }
}
