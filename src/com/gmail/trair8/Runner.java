package com.gmail.trair8;

import com.gmail.trair8.loader.TextLoader;
import com.gmail.trair8.model.Text;

public class Runner {
    public static void main(String[] args) {
        Text text = new Text(TextLoader.load());
        /*System.out.println(text.getChildren().get(0).getChildren().get(0).getChildren());
        System.out.println(text.getChildren().get(0).getChildren().get(0).compose());*/
        System.out.println(text.getChildren().get(0).getChildren().get(0).getChildren());
        System.out.println(text.getChildren().get(0).getChildren().get(0).compose());




    }
}
