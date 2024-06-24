package main;

import java.util.ArrayList;

public class Zoo {
    private String nameOfZoo;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.nameOfZoo = name;
    }

    
    public void addAnimal(String species, String name, int age) {
        animals.add(new Animal(species, name, age));
    }
    
    public void listAnimals() {
        for(Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }
    
    public void runAnimals(int cycles){
        for(Animal animal : animals) {
            //Format:  Pikseli juoksee kovaa vauhtia!
            int x = cycles;
            while(x-- > 0) {
                System.out.println(animal.getName() + " juoksee kovaa vauhtia!");
            }
        }
    }
}
