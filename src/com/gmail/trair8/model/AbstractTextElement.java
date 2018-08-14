package com.gmail.trair8.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTextElement implements TextElement {

    private String composeDelimiter = " ";

    protected List<TextElement> textElements = new ArrayList<>();

    protected AbstractTextElement(String value) {
        parse(value);
    }

    protected abstract void parse(String value);

    protected abstract TextElement buildChildElement(String val);

    @Override
    public List<TextElement> getChildren() {
        return textElements;
    }

    @Override
    public String compose() {
        StringBuilder sb = new StringBuilder();
        for (TextElement textElement : textElements) {
            sb.append(textElement.compose());
            sb.append(composeDelimiter);
        }
        return sb.toString();
    }
}
