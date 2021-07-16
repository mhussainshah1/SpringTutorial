package me.kodysimpson.example2;

public class Main {
    public static void main(String[] args) {

        var textingService = new TextingService(new SpanishMessageServiceImpl());
        textingService.respondToText();
    }
}
