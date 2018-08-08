package com.gmail.trair8.model;

public class PunctuationMark extends AbstractTextElement{

    private String value;

    public String getValue() {
        return value;
    }

    public PunctuationMark(String value) {
        super(null, value);
        this.value = value;

    }

    @Override
    protected TextElement buildChildElement(String val) {
        return null;
    }

    @Override
    public String compose() {
        return getValue();
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }
}
