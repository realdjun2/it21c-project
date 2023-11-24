
package Polymorphism;


public class Main {
    public static void main (String[]args){
        Polymorphism_Animal my_animal = new Polymorphism_Animal("smurphy");
        Polymorphism_Lion my_lion = new Polymorphism_Lion("layon-king");
        Polymorphism_Cat my_cat = new Polymorphism_Cat("smurphy");
        
        my_animal.sleep();
        my_animal.bark();
        my_animal.eat();
        
        System.out.println("--------------------");
         my_animal.animalSound();
         my_lion.animalSound();
         my_cat.animalSound();
         
        
    }
    
}
