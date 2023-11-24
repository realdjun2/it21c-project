
package Polymorphism;

public class Polymorphism_Cat extends Polymorphism_Animal{
    String name;
    
    Polymorphism_Cat (String name){
        super(name);
    }
    void eat(){
    System.out.println(name +"ni_kaun_ug_isda");
    }
    public void animalSound(){
        System.out.println("nagn meowk si" +name);
    }
 }
