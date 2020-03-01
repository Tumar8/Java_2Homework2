package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("CaptainAmerica").print();
        createObject("Tor").print();
    }


    public static com.company.Printable createObject(String className) {
        Printable printable = new Printable() {
            @Override
            public void print() {
            }
        };

        switch (className) {
            case "CaptainAmerica":
                printable = new CaptainAmerica("CaptainAmerica", "CaptainAmerica", "Power", 27);
                break;
            case "Tor":
                printable = new Tor("Tor", "Tor", " God of thunder", 40);
                break;
        }
        return printable;
    }
}

