package com.gmail.trair8.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence extends AbstractTextElement{

    public Sentence(String value) {
        super(null, value);
    }

    @Override
    protected TextElement buildChildElement(String val) {
        if (val.matches("[.,!?;:-]+")){
            return new PunctuationMark(val);
        }else{
            return new Word(val);
        }
    }

    @Override
    protected void parse(String value) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(value);
        TextElement textElement;
        int start;
        int end = 0;
        while (matcher.find()){
            start = matcher.start();
            if(end != 0) {
                String s = value.substring(end, start-1);
                if (!s.equals("")) {
                    textElement = buildChildElement(value.substring(end, start - 1));
                    textElements.add(textElement);
                }
            }
            textElement = buildChildElement(matcher.group());
            textElements.add(textElement);
            end = matcher.end();
        }
        textElement = buildChildElement(value.substring(end));
        textElements.add(textElement);
    }

    @Override
    public String compose() {
        StringBuilder sb = new StringBuilder();
        for(TextElement textElement : textElements) {
            if (textElement instanceof PunctuationMark){
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(textElement.compose());
            sb.append(" ");

        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "value='" + getChildren() + '\'' +
                '}';
    }
}
