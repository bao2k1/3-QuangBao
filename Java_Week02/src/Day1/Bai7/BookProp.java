package Day1.Bai7;


class BookProp {
    private String propertyName;
    private String propertyValue;

    private BookProp(String propertyName, String propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public static BookProp name(String name) {
        return new BookProp("title", name);
    }

    public static BookProp author(String author) {
        return new BookProp("author", author);
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

}
