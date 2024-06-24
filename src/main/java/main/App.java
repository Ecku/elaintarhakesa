package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna eläintarhalle nimi:");
        String nameOfZoo = sc.nextLine();
        Zoo zoo = new Zoo(nameOfZoo);


        boolean exit = false;
        while(!exit) {

            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int age = Integer.parseInt(sc.nextLine());
                        zoo.addAnimal(species, name, age);
                        break;
                    case 2:
                        System.out.println(nameOfZoo + " pitää sisällään seuraavat eläimet");
                        zoo.listAnimals();                        
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int cycles = Integer.parseInt(sc.nextLine());
                        zoo.runAnimals(cycles);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
        sc.close();
}




    }

