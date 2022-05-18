package com.company;

public class Horse extends AbstrakAnimal {

 private String color;

 public Horse() {
 }

 public Horse(String color) {
  this.color = color;
 }

 public Horse(int weight, int age, char gender, String nickName, String color) {
  super(weight, age, gender, nickName);
  this.color = color;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 @Override
 public String toString() {
  return "Horse{" +
          "color='" + color + '\'' +
          "} " + super.toString();
 }
}
