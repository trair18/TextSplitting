package com.gmail.trair8.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph extends AbstractTextElement {

    private String value;

    public Paragraph(String value) {
        super(null, value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    protected TextElement buildChildElement(String val) {
        return new Sentence(val);
    }

    @Override
    public String compose() {
        return value;
    }



    @Override
    protected void parse(String value) {
        Pattern pattern = Pattern.compile("[^.?!]*[.?!]+");
        Matcher matcher = pattern.matcher(value);
        TextElement textElement;
        while (matcher.find()){
            textElement = buildChildElement(matcher.group());
            textElements.add(textElement);
        }
    }

    @Override
    public String toString() {
        return  getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }

}
