package com.company;

public class Sheep extends AbstrakAnimal {
    public Sheep() {
    }

    public Sheep(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
