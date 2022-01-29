package com.techelevator.language;

public class LanguageApp {
    public static void main(String[] args) {
        SalutatuionTranslator translator = new SalutatuionTranslator();

        translator.setDefaultLanguage("English");

        //translator.setDefaultLanguage("Spanish");

        System.out.println(translator.getGreeting("English"));
    }
}
