package org.example;

import org.junit.jupiter.api.Test;

//import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Selenide.open("https://www.google.com/");
    }
}