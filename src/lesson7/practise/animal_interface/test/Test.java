package lesson7.practise.animal_interface.test;
import lesson7.practise.animal_interface.abstract_animal.Animal;
import lesson7.practise.animal_interface.abstract_animal.Tiger;
import lesson7.practise.animal_interface.abstract_animal.Chicken;
import lesson7.practise.animal_interface.abstract_fruit.Apple;
import lesson7.practise.animal_interface.abstract_fruit.Fruit;
import lesson7.practise.animal_interface.abstract_fruit.Orange;
import lesson7.practise.animal_interface.interface_edible.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1: fruit) {
            System.out.println(fruit1.howToEat());
        }

    }
}
