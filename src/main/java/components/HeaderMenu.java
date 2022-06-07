package components;

public enum HeaderMenu {
    PRODUCT("Product"),
    SOLUTIONS("Solutions"),
    RESOURCES("Resources");

    private final String name;

    HeaderMenu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
