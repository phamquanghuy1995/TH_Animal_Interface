package com.huy;

import com.huy.Animal;
import com.huy.Tiger;
import com.huy.Chicken;
import com.huy.Edible;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
