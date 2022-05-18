package com.company;

public class Cow  extends AbstrakAnimal{
    public Cow() {
    }

    public Cow(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
