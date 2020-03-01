package com.company;

public class MarvelCinematicUniverse implements Printable {
    private String name;
    private String power;
    private int age;

    public String getName() {
        return name;
    }

    private String getPower() {
        return power;
    }

    public int getAge() {
        return age;
    }


    public MarvelCinematicUniverse(String name, String power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("name " + getName() + "\n" + "power" + getPower() + "\n" + "age" + getAge());
    }

}