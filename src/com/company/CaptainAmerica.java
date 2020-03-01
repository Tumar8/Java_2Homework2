package com.company;

public class CaptainAmerica extends MarvelCinematicUniverse {
    private String mainActor;

    public CaptainAmerica(String mainActor, String name, String power, int age) {
        super(name, power, age);
        this.mainActor = mainActor;
    }

    public String getMainActor() {
        return mainActor;
    }


    @Override
    public void print() {
        super.print();

        System.out.println("mainActor" + "-" + getMainActor() + "\n" + "name " + "-" + getName()  + "\n" + "age" + "-" + getAge());
    }
}