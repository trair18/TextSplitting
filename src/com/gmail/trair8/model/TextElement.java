package com.gmail.trair8.model;

import java.util.List;

public interface TextElement {

    List<TextElement> getChildren();

    String compose();
}
