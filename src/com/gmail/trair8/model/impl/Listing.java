package com.gmail.trair8.model.impl;

import com.gmail.trair8.model.AbstractTextElement;
import com.gmail.trair8.model.TextElement;

public class Listing extends AbstractTextElement {

    private String value;

    public Listing(String value) {
        super(value);
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
    protected void parse(String value) {
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }
}
