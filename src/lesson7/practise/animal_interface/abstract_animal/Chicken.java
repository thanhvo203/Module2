package lesson7.practise.animal_interface.abstract_animal;

import lesson7.practise.animal_interface.interface_edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck- cluck!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
