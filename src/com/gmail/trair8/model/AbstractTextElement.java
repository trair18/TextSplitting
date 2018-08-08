package com.gmail.trair8.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTextElement implements TextElement {

    private String regex;
    private String composeDelimiter = " ";

    protected List<TextElement> textElements = new ArrayList<>();

    protected AbstractTextElement(String regex, String value) {
        this.regex = regex;
        parse(value);
    }

    protected void parse(String value) {
        if(regex != null && !regex.equals("")) {
            String[] values = value.split(regex);
            TextElement textElement;
            for (String val : values) {
                textElement = buildChildElement(val);
                textElements.add(textElement);
            }
        }
    }

    protected abstract TextElement buildChildElement(String val);

    @Override
    public List<TextElement> getChildren() {
        return textElements;
    }

    @Override
    public String compose() {
        StringBuilder sb = new StringBuilder();
        for(TextElement textElement : textElements) {
            sb.append(textElement.compose());
            sb.append(composeDelimiter);
        }
        return sb.toString();
    }
}
