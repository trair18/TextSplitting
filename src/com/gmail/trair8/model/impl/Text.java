package com.gmail.trair8.model.impl;

import com.gmail.trair8.model.AbstractTextElement;
import com.gmail.trair8.model.TextElement;
import com.gmail.trair8.model.impl.Listing;
import com.gmail.trair8.model.impl.Paragraph;

public class Text extends AbstractTextElement {

    public Text(String value) {
        super(value);
    }

    @Override
    protected TextElement buildChildElement(String val) {
        if (val.length() > 3) {
            if (val.substring(0, 3).matches("/\\*#")) {
                return new Listing(val);
            } else {
                return new Paragraph(val);
            }
        } else{
            return  new Paragraph(val);
        }

    }

    @Override
    protected void parse(String value) {
        String[] values = value.split("\t");
        TextElement textElement;
        for (String val : values) {
            textElement = buildChildElement(val);
            textElements.add(textElement);
        }
    }
}
