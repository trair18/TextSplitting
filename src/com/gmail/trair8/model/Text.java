package com.gmail.trair8.model;

public class Text extends AbstractTextElement {

    public Text(String value) {
        super("\t", value);
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

}
