package onliner.selenium.enums;

public enum KsisItems{
    LAPTOP("Ноутбуки, компьютеры, мониторы"),
    ACCESSORIES("Комплектующие"),
    TECHNIQUE("Техника для\u00a0печати и\u00a0дизайна"),
    STORAGE("Хранение данных"),
    NETWORKING("Сетевое оборудование");

        private String value;

        KsisItems(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}