package main;

public class Animal {
    private String species;
    private String name;
    private int age;
   

    public Animal(String species,String name,int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
   
    public String getName() {
        return this.name;
    }


    public String toString() {
        // Format: Siili: Pikseli, 5 vuotta
        return species + ": " + name + ", " + age + " vuotta";
    }
}
