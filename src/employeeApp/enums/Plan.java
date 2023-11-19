package employeeApp.enums;

public enum Plan {
    BASIC("BASIC", 300),
    MEDIUM("MEDIUM", 600),
    ADVANCE("ADVANCE", 1000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
