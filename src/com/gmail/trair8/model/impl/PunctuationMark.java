package com.gmail.trair8.model.impl;

import com.gmail.trair8.model.AbstractTextElement;
import com.gmail.trair8.model.TextElement;

public class PunctuationMark extends AbstractTextElement {

    private String value;

    public String getValue() {
        return value;
    }

    public PunctuationMark(String value) {
        super(value);
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
    protected void parse(String value) {
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }
}
