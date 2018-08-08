package com.gmail.trair8.model;

public class Listing extends AbstractTextElement {

    private String value;

    public Listing(String value) {
        super(null, value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    protected TextElement buildChildElement(String val) {
        return null;
    }

    @Override
    public String compose() {
        return value;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }
}
