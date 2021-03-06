package com.henry.guava.resources;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ReadResourcesFile {
    public static void main(String[] args) throws IOException {
        URL url = Resources.getResource("test.txt");
        String text = Resources.toString(url, StandardCharsets.UTF_8);
        System.out.println(text);
    }
}
