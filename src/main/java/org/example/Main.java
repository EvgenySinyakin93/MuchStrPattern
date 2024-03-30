package org.example;

public class Main {
    public static void main(String[] args) {
        Log log = new Log();
        log.log("INFO", "Hello");
        log.log("ERROR", "Батон встал на весы");
        log.log("INFO", "Bye");
    }
}