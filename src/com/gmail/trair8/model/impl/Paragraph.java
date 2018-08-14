package com.gmail.trair8.model.impl;

import com.gmail.trair8.model.AbstractTextElement;
import com.gmail.trair8.model.TextElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph extends AbstractTextElement {

    public Paragraph(String value) {
        super(value);
    }


    @Override
    protected TextElement buildChildElement(String val) {
        return new Sentence(val);
    }


    @Override
    protected void parse(String value) {
        Pattern pattern = Pattern.compile("[^.?!]*[.?!]+");
        Matcher matcher = pattern.matcher(value);
        TextElement textElement;
        while (matcher.find()) {
            textElement = buildChildElement(matcher.group());
            textElements.add(textElement);
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + getChildren() + '\'' +
                '}';
    }

}
