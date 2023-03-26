package onliner.selenium.enums;

public enum TopMenuCatalogItems {
    ELECTRONICS("Электроника"),
    KSIS("Компьютеры и\u00a0сети"),
    APPLIANCES("Бытовая техника"),
    BUILDERING("Стройка и\u00a0ремонт"),
    HOME("Дом и\u00a0сад"),
    AUTO("Авто и\u00a0мото"),
    BEAUTY("Красота и\u00a0спорт"),
    MOMS("Детям и\u00a0мамам");

    private String value;

    TopMenuCatalogItems(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
