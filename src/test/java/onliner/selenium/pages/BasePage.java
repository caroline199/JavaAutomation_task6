package onliner.selenium.pages;

import onliner.selenium.elements.*;

public abstract class BasePage {

    public abstract void openPage();

    protected TopMenu topMenu = new TopMenu();
    protected CatalogMenu topMenuCatalog = new CatalogMenu();

    protected CatalogList catalogList = new CatalogList();
    protected CatalogListDropdown catalogListDropdown = new CatalogListDropdown();
}
