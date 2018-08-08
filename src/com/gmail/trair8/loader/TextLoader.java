package com.gmail.trair8.loader;

import java.io.*;

public class TextLoader {
    public static String load() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("qwer.txt"));
            byte[] a = new byte[fileInputStream.available()];
            fileInputStream.read(a, 0, fileInputStream.available());
            fileInputStream.close();
            String s = new String(a);
            return s;
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return "";

    }
}
