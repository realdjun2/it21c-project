
package Polymorphism;

public class Polymorphism_Lion extends Polymorphism_Animal {
    
   String name;
   
   Polymorphism_Lion (String name){
       super(name);
   }
   void bark(){
       System.out.println(name +"ni_usig");
       
   }
   public void animalSound(){
       System.out.println("nag_usig si" +name);
   }
       
   }
           
 
